/**
 * Created by yiwg on 2017/7/24.
 */
console.log("页面加载.....")
var APP = {};
APP.ctx = "/sms";
APP.urls = {
    list : "/project/list.do",
    add : "/skillGroup/add.do",
    update : "/skillGroup/update.do",
    remove : "/skillGroup/delete.do",
    findSp : "/resource/findSp.do",
    findType : "/skillGroup/findType.do",
};
APP.constant = {};

APP.pageSize = 10;

APP.Project = function(id, name, remark) {
    this.checked = ko.observable(false);
    this.id = id;
    this.name = name;
    this.remark = remark;
};

APP.ViewModel = function() {

    var self = this;
    Sammy(function () {
        this.get("#list", function () {
            console.log("list");
            APP.vm.hash("list");
            console.log("list end");
        });
        this.get("#add", function () {
            console.log("add");
            APP.vm.hash("add");
        });
        this.get("#update", function () {
            console.log("update");
            APP.vm.hash("update");
        });
    }).run("#list");

    this.hash = ko.observable("list");
    this.list = ko.observableArray();

    this.loadProjectList = function() {
        console.log("ajax请求......")
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

                    // 测试代码 - Start
                    /*
                     * for (var j = 0; j < 30; j++) { self.list.push( new
                     * APP.SkillGroup(j+100, "TestSkillGroup-" + j, "sp-" + j,
                     * "agent-" + j, "08:00 - 19:00", "08:00", "19:00", 1) ); }
                     */

                    // 测试代码 - End
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
    this.deleteSkillGroup = function(project) {

        console.log("删除id："+project.id)


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
                        skillGroupIds : idStr
                    },
                    success : function(data) {
                        if (data.success) {
                            KS.alert("删除成功！");
                            self.loadSkillGroupList();
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
    console.log("页面加载完成")
    APP.vm = new APP.ViewModel();
    ko.applyBindings(APP.vm);
    console.log("页面加载完成1")
    APP.vm.loadProjectList();
    console.log("页面加载完成2")
});