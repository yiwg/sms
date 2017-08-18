/**
 * Created by yiwg on 2017/7/24.
 */
var APP = {};
APP.ctx = "/sms";
APP.urls = {
    list : "/pressureData/list.do",
    add : "/pressureData/add.do",
    update : "/pressureData/update.do",
    remove : "/pressureData/delete.do",
    listItem:"/item/list4menu.do"
};
APP.constant = {};

APP.pageSize = 10;

APP.User = function(id, tenderId, labName,deviceName,testType,
                    deviceNum,constructionPoint,testDate,age,deviceSize,
                    designStrength,loadOne,loadTwo,loadThree,strengthOne,
                    strengthTwo,strengthThree,strengthValue,qualified,remard) {
    this.id=id;
    this.tenderId=tenderId;
    this.labName=labName;
    this.deviceName=deviceName;
    this.testType=testType;
    this.deviceNum=deviceNum;
    this.constructionPoint=constructionPoint;
    this.testDate=testDate;
    this.age=age;
    this.deviceSize=deviceSize;
    this.designStrength=designStrength;
    this.loadOne=loadOne;
    this.loadTwo=loadTwo;
    this.loadThree=loadThree;
    this.strengthOne=strengthOne;
    this.strengthTwo=strengthTwo;
    this.strengthThree=strengthThree;
    this.strengthValue=strengthValue;
    this.qualified=qualified;
    this.remard=remard;
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
    this.typeList=ko.observableArray();

    function typeType() {
        self.typeList([]);
        self.typeList.push({
            type: 0,
            typeName :"施工单位"
        });
        self.typeList.push({
            type: 1,
            typeName :"中心实验室"
        });
        self.typeList.push({
            type: 2,
            typeName :"监理单位"
        });
    }

    function itemList(){
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
                    for(var i=0;i<lis.length;i++){
                        if(lis[i].menuType==1){
                            lis[i].name='\b'+lis[i].name
                        }else {
                            lis[i].name=""+lis[i].name
                        }
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

    this.loadDataList = function() {
        itemList();
        //typeType();
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
                        var pressureData = list[i];
                        self.list.push(new APP.User(pressureData.id, pressureData.tenderId, pressureData.labName,pressureData.deviceName,pressureData.testType,
                            pressureData.deviceNum,pressureData.constructionPoint,pressureData.testDate,pressureData.age,pressureData.deviceSize,
                            pressureData.designStrength,pressureData.loadOne,pressureData.loadTwo,pressureData.loadThree,pressureData.strengthOne,
                            pressureData.strengthTwo,pressureData.strengthThree,pressureData.strengthValue,pressureData.qualified,pressureData.remard));
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
    this.tempUser = ko.observable(new APP.User());
    this.saving = ko.observable(false);
    this.gotoUpdate = function(pressureData) {
        self.tempUser(new APP.User(pressureData.id, pressureData.name, pressureData.account,
            pressureData.passWord,pressureData.email,pressureData.type,pressureData.typeName,pressureData.itemId,
            pressureData.itemName,pressureData.phoneNum));
        location.hash = "update";
    };
    this.addUser = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.tempUser();
        $.ajax({
            url : APP.ctx + APP.urls.add,
            type : "post",
            dataType : "json",
            cache : false,
            /*id, name, account,passWord,email,type,typeName,itemId,itemName,phoneNum*/
            data : {
                name : sg.name,
                passWord:sg.passWord,
                email:sg.email,
                type:sg.type,
                itemId:sg.itemId,
                phoneNum : sg.phoneNum
            },
            success : function(data) {
                console.log(data);
                self.saving(false);
                if (data.success) {
                    KS.alert("添加成功！");
                    self.gotoList();
                    self.loadDataList();
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
    this.updateUser = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.tempUser();
        console.log("修改的压力机数据id："+sg.projectId);
        $.ajax({
            url : APP.ctx + APP.urls.update,
            type : "post",
            dataType : "json",
            cache : false,
            data : {
                id : sg.id,
                passWord:sg.passWord,
                email:sg.email,
                phoneNum : sg.phoneNum
            },
            success : function(data) {
                self.saving(false);
                if (data.success) {
                    KS.alert("修改成功！");
                    self.gotoList();
                    self.loadDataList();
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
    this.deleteUser = function(pressureData) {
        //console.log("删除id："+project.id)
        var tip = "确定删除选中的" + (pressureData.name)
            + "压力机数据么？";
        KS.confirm(tip, function(result) {
            if (result) {
                $.ajax({
                    url : APP.ctx + APP.urls.remove,
                    type : "post",
                    dataType : "json",
                    cache : false,
                    data : {
                        Id : pressureData.id
                    },
                    success : function(data) {
                        if (data.success) {
                            KS.alert("删除成功！");
                            self.loadDataList();
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
    APP.vm.loadDataList();
});