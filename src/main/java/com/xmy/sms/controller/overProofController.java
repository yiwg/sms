package com.xmy.sms.controller;

/**
 * Created by yiwg on 2017/8/21.
 */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.Overproof;
import com.xmy.sms.to.OverproofTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.Overproof;
import com.xmy.sms.service.IOverproofService;
import com.xmy.sms.to.OverproofTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by yiwg on 2017/7/22.
 */
@Controller
@RequestMapping("/overProof")
public class OverproofController extends BaseController {

    @Autowired
    private IOverproofService dataService;

    @RequestMapping(value = "/gotoOverproof")
    public String gotoProjectCfg(HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        logger.debug("overProofController.gotoOverproofCfg()。。。。");
        return "overProof";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(OverproofTo dataTo, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("overProofController.query()，参数为:"+dataTo);
        }
        AjaxPo ret;
        try{
            List<OverproofTo> dataTos=dataService.list(dataTo,page);
            ret=toSuccess(dataTos,((Page)dataTos).getTotal());
        }
        catch (ServiceException e){
            logger.error("获取用户列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public AjaxPo add(Overproof data, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("overProofController.add()......参数为:" + data);
        }
        AjaxPo ret ;
        try{
            data=dataService.add(data);
            ret=toSuccess(data);
        }
        catch (ServiceException e){
            logger.error("添加失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public AjaxPo update(Overproof data, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.update()......参数为:" + data);
        }
        AjaxPo ret ;
        try{
            data=dataService.update(data);
            ret=toSuccess(data);
        }
        catch (ServiceException e){
            logger.error("更新失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public AjaxPo delete(Overproof data, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.delete()......参数为:" + data);
        }
        AjaxPo ret ;
        try{
            dataService.delete(data);
            ret=toSuccess(null);
        }
        catch (ServiceException e){
            logger.error("删除：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

}

