/**
 * Created by yiwg on 2017/7/24.
 */
var APP = {};
APP.ctx = "/sms";
APP.urls = {
    list : "/overProof/list.do",
    add : "/overProof/add.do",
    update : "/overProof/update.do",
    remove : "/overProof/delete.do",
    listItem:"/item/list4menu.do",
    getOptions:"/overProof/getOptions.do"
};
APP.constant = {};

APP.pageSize = 10;

APP.PData = function(id, dataId, tenderId,buildMsg,buildStaff,
                     buildDate,testMsg,testStaff,testDate,supervisorMsg,
                     supervisorStaff,supervisorDate,msgNum,isDeal,isWarm,
                     dataType,testType,dataDate,constructionPoint) {
    this.id=id;
    this.dataId=dataId;
    this.tenderId=tenderId;
    this.buildMsg=buildMsg;
    this.buildStaff=buildStaff;
    this.buildDate=buildDate;
    this.testMsg=testMsg;
    this.testStaff=testStaff;
    this.testDate=testDate;
    this.supervisorMsg=supervisorMsg;
    this.supervisorStaff=supervisorStaff;
    this.supervisorDate=supervisorDate;
    this.msgNum=msgNum;
    this.isDeal=isDeal;
    this.isWarm=isWarm;
    this.dataType=dataType;
    this.testType=testType;
    this.dataDate=dataDate;
    this.constructionPoint=constructionPoint;
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
    this.isDealOptions = ko.observableArray();
    this.typeList=ko.observableArray();
    this.tempPData = ko.observable(new APP.PData());


    function typeType() {
        self.typeList([]);
        self.typeList.push({
            type: 0,
            typeName :"未处理"
        });
        self.typeList.push({
            type: 1,
            typeName :"已处理"
        });
        self.typeList.push({
            type: 2,
            typeName :"仅中试审批"
        });

        self.typeList.push({
            type: 3,
            typeName :"仅监理审批"
        });
        self.typeList.push({
            type: 4,
            typeName :"已审批"
        });
    }

    this.itemList=function () {
        itemList();
        isDealList();
    }
    function isDealList() {
        self.isDealOptions([]);
        self.isDealOptions.push({
            itemId: "",
            itemName :""
        });
        self.isDealOptions.push({
            itemId: 0,
            itemName :"未处理"
        });
        self.isDealOptions.push({
            itemId: 1,
            itemName :"已处理"
        });
        self.isDealOptions.push({
            itemId: 2,
            itemName :"仅中试审批"
        });
        self.isDealOptions.push({
            itemId: 3,
            itemName :"仅监理审批"
        });
        self.isDealOptions.push({
            itemId: 4,
            itemName :"已审批"
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
                            lis[i].id ='1:'+lis[i].id
                        }else {
                            lis[i].name=""+lis[i].name
                            lis[i].id="0:"+lis[i].id
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

    this.loadDataList = function(pData) {
        /*if(self.itemTypeList.length<=0){
            itemList();
        }*/
        //typeType();
        self.list([]);
        console.log("item id:"+pData.tenderId)
        var tenderId=pData.tenderId.split(':')[1];
        var tenderType=pData.tenderId.split(':')[0];
        $.ajax({
            url : APP.ctx + APP.urls.list,
            type : "get",
            dataType : "json",
            cache : false,
            data : {
                tenderId:tenderId,
                tenderType:tenderType,
                isDeal:pData.isDeal,
            },
            success : function(data) {
                if (data.success) {
                    var list = data.obj;
                    for (var i = 0, len = list.length; i < len; i++) {
                        var overProof = list[i];
                        self.list.push(new APP.PData(overProof.id, overProof.dataId, overProof.enderId,overProof.buildMsg,overProof.buildStaff,
                            overProof.buildDate,overProof.testMsg,overProof.testStaff,overProof.testDate,overProof.supervisorMsg,
                            overProof.supervisorStaff,overProof.supervisorDate,overProof.msgNum,overProof.isDeal,overProof.isWarm,
                            overProof.dataType,overProof.testType,overProof.dataDate,overProof.constructionPoint));
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
    this.tempPData = ko.observable(new APP.PData());
    this.saving = ko.observable(false);
    this.gotoUpdate = function(overProof) {
        self.tempPData(new APP.PData(overProof.id, overProof.name, overProof.account,
            overProof.passWord,overProof.email,overProof.type,overProof.typeName,overProof.itemId,
            overProof.itemName,overProof.phoneNum));
        location.hash = "update";
    };
    this.addPData = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.tempPData();
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
    this.updatePData = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.tempPData();
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
    this.deletePData = function(overProof) {
        //console.log("删除id："+project.id)
        var tip = "确定删除选中的" + (overProof.name)
            + "压力机数据么？";
        KS.confirm(tip, function(result) {
            if (result) {
                $.ajax({
                    url : APP.ctx + APP.urls.remove,
                    type : "post",
                    dataType : "json",
                    cache : false,
                    data : {
                        Id : overProof.id
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
    //APP.vm.loadDataList();
    APP.vm.itemList();
});