/**
 * Created by yiwg on 2017/7/24.
 */
var APP = {};
APP.ctx = "/sms";
APP.urls = {
    list : "/tender/list.do",
    add : "/tender/add.do",
    update : "/tender/update.do",
    remove : "/tender/delete.do",
    listItem:"/item/list.do"
};
APP.constant = {};

APP.pageSize = 10;

APP.tender = function(id, name, itemId,itemName,projectName,remark,position,photo) {
    this.id = id;
    this.name = name;
    this.itemId=itemId;
    this.itemName=itemName;
    this.projectName = projectName;
    this.remark=remark;
    this.position = position;
    this.photo = photo;
};

APP.ViewModel = function() {

    var self = this;
    Sammy(function () {
        this.get("#list", function () {
            APP.vm.hash("list");
        });
        this.get("#add", function () {
            APP.vm.hash("add");
        });
        this.get("#update", function () {
            APP.vm.hash("update");
        });
    }).run("#list");

    this.hash = ko.observable("list");
    this.list = ko.observableArray();

    this.itemTypeList = ko.observableArray();

    function itemType(){
        self.itemTypeList([]);
        $.ajax({
            url : APP.ctx + APP.urls.listItem,
            type : "get",
            dataType : "json",
            cache : false,
            data : {},
            success : function(data) {
                if (data.success) {
                    var lis = data.obj;
                    console.log("获取的project的数量"+lis[0].name)
                    for(var i=0;i<lis.length;i++){
                        self.itemTypeList.push({
                            itemId: lis[i].id,
                            itemName : lis[i].name
                        });
                    }

                } else {
                    // TODO 查询失败
                    KS.alert("查询排队方式失败！");
                }
            },
            error : function() {
                // TODO 查询失败
                KS.alert("查询失败！");
            }
        });
    }

    this.loadtenderList = function() {
        itemType();
        self.list([]);
        $.ajax({
            url : APP.ctx + APP.urls.list,
            type : "get",
            dataType : "json",
            cache : false,
            data : {},
            success : function(data) {
                if (data.success) {
                    var list = data.obj;
                    for (var i = 0, len = list.length; i < len; i++) {
                        var tender = list[i];
                        self.list.push(new APP.tender(tender.id,
                            tender.name,tender.itemId,tender.itemName,
                            tender.projectName, tender.remark,tender.position,tender.photo));
                    }

                } else {
                    // TODO 查询失败
                    KS.alert("查询失败！");
                }
            },
            error : function() {
                // TODO 查询失败
                KS.alert("查询失败！");
            }
        });
    };
    this.listPage = ko.pureComputed(function() {
        if (self.list().length === 0) {
            return [];
        }
        var startIndex = (self.currentPage() - 1) * APP.pageSize;
        var endIndex = startIndex + APP.pageSize;
        return self.list.slice(startIndex, endIndex);
    });
    /** ****************************分页部分 - 开始******************************** */

    /**
     * 当前页
     */
    this.currentPage = ko.observable(1);

    /**
     * 页码输入
     */
    this.currentPageInput = ko.observable(1);

    /**
     * 总页数
     */
    this.totalPage = ko.pureComputed(function() {
        var totalCount = self.list().length;
        if (totalCount % APP.pageSize === 0) {
            return totalCount / APP.pageSize;
        } else {
            return parseInt(totalCount / APP.pageSize) + 1;
        }
    });

    /**
     * 当前页的数据集合
     */
    this.listPage = ko.pureComputed(function() {
        if (self.list().length === 0) {
            return [];
        }
        var startIndex = (self.currentPage() - 1) * APP.pageSize;
        var endIndex = startIndex + APP.pageSize;
        return self.list.slice(startIndex, endIndex);
    });

    /**
     * 下一页
     */
    this.nextPage = function() {
        self.currentPage(self.currentPage() + 1);
        self.currentPageInput(self.currentPage());
        //self.checkAll(false);
    };

    /**
     * 上一页
     */
    this.prevPage = function() {
        self.currentPage(self.currentPage() - 1);
        self.currentPageInput(self.currentPage());
        //self.checkAll(false);
    };

    /**
     * 下一页是否可用
     */
    this.nextPageEnabled = ko.pureComputed(function() {
        return self.currentPage() < self.totalPage();
    });

    /**
     * 上一页是否可用
     */
    this.prevPageEnabled = ko.pureComputed(function() {
        return self.currentPage() > 1;
    });

    /**
     * 跳转到页码
     */
    this.setPage = function() {
        self.currentPage(parseInt(self.currentPageInput()));
        //self.checkAll(false);
        return false;
    };

    /** ****************************分页部分 - 结束******************************** */
    this.gotoAdd = function() {
        location.hash = "add";
    };

    this.gotoList = function() {
        location.hash = "list";
    };
    this.temptender = ko.observable(new APP.tender());
    this.saving = ko.observable(false);
    this.gotoUpdate = function(tender) {
        console.log("修改标段的项目id:"+tender.itemId)
        self.temptender(new APP.tender(tender.id,
            tender.name,tender.itemId,tender.itemName,
            tender.projectName, tender.remark,tender.position,tender.photo));
        location.hash = "update";
    };
    this.addtender = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.temptender();
        $.ajax({
            url : APP.ctx + APP.urls.add,
            type : "post",
            dataType : "json",
            cache : false,
            data : {
                name : sg.name,
                itemId:sg.itemId,
                position:sg.position,
                photo:sg.photo
            },
            success : function(data) {
                console.log(data);
                self.saving(false);
                if (data.success) {
                    KS.alert("添加成功！");
                    self.gotoList();
                    self.loadtenderList();
                } else {
                    // TODO 添加失败
                    KS.alert(data.msg);
                }
            },
            error : function() {
                // TODO 添加失败
                KS.alert("添加失败！");
                self.saving(false);
            }
        });
    };

    /**
     * 修改技能组
     */
    this.updatetender = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.temptender();
        console.log("修改的标段的项目id："+sg.itemId);
        $.ajax({
            url : APP.ctx + APP.urls.update,
            type : "post",
            dataType : "json",
            cache : false,
            data : {
                id : sg.id,
                name : sg.name,
                itemId:sg.itemId,
                position:sg.position,
                photo:sg.photo
            },
            success : function(data) {
                self.saving(false);
                if (data.success) {
                    KS.alert("修改成功！");
                    self.gotoList();
                    self.loadtenderList();
                } else {
                    // TODO 修改失败
                    KS.alert(data.msg);
                }
            },
            error : function() {
                // TODO 修改失败
                KS.alert("修改失败！");
                self.saving(false);
            }
        });
    };
    this.deletetender = function(tender) {
        //console.log("删除id："+project.id)
        var tip = "确定删除选中的" + (tender.name)
            + "工程么？";
        KS.confirm(tip, function(result) {
            if (result) {
                $.ajax({
                    url : APP.ctx + APP.urls.remove,
                    type : "post",
                    dataType : "json",
                    cache : false,
                    data : {
                        Id : tender.id
                    },
                    success : function(data) {
                        if (data.success) {
                            KS.alert("删除成功！");
                            self.loadtenderList();
                        } else {
                            // TODO 删除失败
                            KS.alert("删除失败！");
                        }
                    },
                    error : function() {
                        // TODO 删除失败
                        KS.alert("删除失败！");
                    }
                });
            }
        });
    };
}

$(function() {
    APP.vm = new APP.ViewModel();
    ko.applyBindings(APP.vm);
    APP.vm.loadtenderList();
});