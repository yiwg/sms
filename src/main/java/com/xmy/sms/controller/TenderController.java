package com.xmy.sms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.Tender;
import com.xmy.sms.service.ITenderService;
import com.xmy.sms.to.TenderTo;
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
@RequestMapping("/tender")
public class TenderController extends BaseController {

    @Autowired
    private ITenderService tenderService;

    @RequestMapping(value = "/gotoTenderCfg")
    public String gotoProjectCfg(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("TenderController.gotoTenderCfg()。。。。");
        return "tenderCfg";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(TenderTo tenderTo, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("TenderController.query()，参数为:"+tenderTo);
        }
        AjaxPo ret;
        try{
            List<TenderTo> tenderTos=tenderService.list(tenderTo,page);
            ret=toSuccess(tenderTos,((Page)tenderTos).getTotal());
        }
        catch (ServiceException e){
            logger.error("获取工程列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public AjaxPo add(Tender tender, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("TenderController.add()......参数为:" + tender);
        }
        AjaxPo ret ;
        try{
            tender=tenderService.add(tender);
            ret=toSuccess(tender);
        }
        catch (ServiceException e){
            logger.error("添加失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

   @RequestMapping(value = "/update")
    @ResponseBody
    public AjaxPo update(Tender tender, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.update()......参数为:" + tender);
        }
        AjaxPo ret ;
        try{
            tender=tenderService.update(tender);
            ret=toSuccess(tender);
        }
        catch (ServiceException e){
            logger.error("更新失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public AjaxPo delete(Tender tender, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.delete()......参数为:" + tender);
        }
        AjaxPo ret ;
        try{
            tenderService.delete(tender);
            ret=toSuccess(null);
        }
        catch (ServiceException e){
            logger.error("删除：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }
}
