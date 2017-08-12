package com.xmy.sms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.User;
import com.xmy.sms.service.IUserService;
import com.xmy.sms.to.UserTo;
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
@RequestMapping("/pressureData")
public class PressureDataController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/gotoPressureData")
    public String gotoProjectCfg(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("PressureDataController.gotoUserCfg()。。。。");
        return "pressureData";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(UserTo userTo, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("PressureDataController.query()，参数为:"+userTo);
        }
        AjaxPo ret;
        try{
            List<UserTo> userTos=userService.list(userTo,page);
            ret=toSuccess(userTos,((Page)userTos).getTotal());
        }
        catch (ServiceException e){
            logger.error("获取用户列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public AjaxPo add(User user, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("PressureDataController.add()......参数为:" + user);
        }
        AjaxPo ret ;
        try{
            user=userService.add(user);
            ret=toSuccess(user);
        }
        catch (ServiceException e){
            logger.error("添加失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

   @RequestMapping(value = "/update")
    @ResponseBody
    public AjaxPo update(User user, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.update()......参数为:" + user);
        }
        AjaxPo ret ;
        try{
            user=userService.update(user);
            ret=toSuccess(user);
        }
        catch (ServiceException e){
            logger.error("更新失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public AjaxPo delete(User user, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.delete()......参数为:" + user);
        }
        AjaxPo ret ;
        try{
            userService.delete(user);
            ret=toSuccess(null);
        }
        catch (ServiceException e){
            logger.error("删除：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }
}
