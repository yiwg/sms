/**
 * Created by yiwg on 2017/7/24.
 */
var APP = {};
APP.ctx = "/sms";
APP.urls = {
    list : "/project/list.do",
    add : "/project/add.do",
    update : "/project/update.do",
    remove : "/project/delete.do",
};
APP.constant = {};

APP.pageSize = 10;

APP.Project = function(id, name, remark) {
    this.id = id;
    this.name = name;
    this.remark = remark;
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

    this.loadProjectList = function() {
        //console.log("ajax请求......")
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
                        var item = list[i];
                        self.list.push(new APP.Project(item.id,
                            item.name, item.remark));
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
    this.tempProject = ko.observable(new APP.Project());
    this.saving = ko.observable(false);
    this.gotoUpdate = function(project) {
        self.tempProject(new APP.Project(project.id,
            project.name, project.remark));
        location.hash = "update";
    };
    this.addProject = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.tempProject();
        $.ajax({
            url : APP.ctx + APP.urls.add,
            type : "post",
            dataType : "json",
            cache : false,
            data : {
                name : sg.name,
                remark : sg.remark
            },
            success : function(data) {
                console.log(data);
                self.saving(false);
                if (data.success) {
                    KS.alert("添加成功！");
                    self.gotoList();
                    self.loadProjectList();
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
    this.updateProject = function() {
        // 初始化
        $("#skillGroupFormId").initValidate();
        // 添加校验
        if (!$("#skillGroupFormId").doValidate()) {
            return false;
        }

        self.saving(true);

        var sg = self.tempProject();
        console.log("修改的id："+sg.id);
        $.ajax({
            url : APP.ctx + APP.urls.update,
            type : "post",
            dataType : "json",
            cache : false,
            data : {
                id : sg.id,
                name : sg.name,
                remark : sg.remark
            },
            success : function(data) {
                self.saving(false);
                if (data.success) {
                    KS.alert("修改成功！");
                    self.gotoList();
                    self.loadProjectList();
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
    this.deleteProject = function(project) {
        //console.log("删除id："+project.id)
        var tip = "确定删除选中的" + (project.name)
            + "工程么？";
        KS.confirm(tip, function(result) {
            if (result) {
                $.ajax({
                    url : APP.ctx + APP.urls.remove,
                    type : "post",
                    dataType : "json",
                    cache : false,
                    data : {
                        Id : project.id
                    },
                    success : function(data) {
                        if (data.success) {
                            KS.alert("删除成功！");
                            self.loadProjectList();
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
    APP.vm.loadProjectList();
});