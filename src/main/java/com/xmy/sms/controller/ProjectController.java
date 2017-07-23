package com.xmy.sms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.constant.ResultConstant;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.Project;
import com.xmy.sms.service.IProjectService;
import exception.ServiceException;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
@Controller
@RequestMapping("/project")
public class ProjectController extends BaseController {

    @Autowired
    private IProjectService projectService;

    @RequestMapping(value = "/gotoProjectCfg")
    public String gotoProjectCfg(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("ProjectController.gotoProjectCfg()。。。。");

        return "login";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(Project project, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        logger.debug("ProjectController.list()......参数为:" + project);
        if (logger.isDebugEnabled()) {
            logger.debug("UcdsEnterpriseAgentInfoController.query()，参数为:"+project);
        }
        AjaxPo ret = new AjaxPo(true, "成功");
        try{
            List<Project> projectList=projectService.list(project,page);
            ret.setObj(projectList);
            ret.setTotal(((Page)projectList).getTotal());
            ret.setCode(ResultConstant.SUCCESS);
            ret.setMsg(ResultConstant.SUCCESS_DESC);
        }
        catch (ServiceException e){
            logger.error("未登陆或登陆状态已失效",e);
            ret.setCode(ResultConstant.FAIL);
            ret.setMsg(ResultConstant.FAIL_DESC);
        }

        return ret;
    }
}
