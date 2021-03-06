package com.xmy.sms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.constant.ResultConstant;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.Project;
import com.xmy.sms.service.IProjectService;
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

        return "projectCfg";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(Project project, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        logger.debug("ProjectController.list()......参数为:" + project);
        if (logger.isDebugEnabled()) {
            logger.debug("UcdsEnterpriseAgentInfoController.query()，参数为:"+project);
        }
        AjaxPo ret;
        try{
            List<Project> projectList=projectService.list(project,page);
            ret=toSuccess(projectList,((Page)projectList).getTotal());
        }
        catch (ServiceException e){
            logger.error("获取工程列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public AjaxPo add(Project project, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.add()......参数为:" + project);
        }
        AjaxPo ret ;
        try{
            Project pjt;
            pjt=projectService.add(project);
            ret=toSuccess(project);
        }
        catch (ServiceException e){
            logger.error("添加失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public AjaxPo update(Project project, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.update()......参数为:" + project);
        }
        AjaxPo ret ;
        try{
            Project pjt;
            pjt=projectService.update(project);
            ret=toSuccess(project);
        }
        catch (ServiceException e){
            logger.error("更新失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public AjaxPo delete(Project project, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.delete()......参数为:" + project);
        }
        AjaxPo ret ;
        try{
            projectService.delete(project);
            ret=toSuccess(null);
        }
        catch (ServiceException e){
            logger.error("删除：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }
}
