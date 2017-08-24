package com.xmy.sms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.MultiData;
import com.xmy.sms.service.IMultiDataService;
import com.xmy.sms.to.MultiDataTo;
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
@RequestMapping("/multiData")
public class MultiDataController extends BaseController {

    @Autowired
    private IMultiDataService dataService;

    @RequestMapping(value = "/gotoMultiData")
    public String gotoProjectCfg(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("MultiDataController.gotoMultiDataCfg()。。。。");
        return "multiData";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(MultiDataTo dataTo, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("MultiDataController.query()，参数为:"+dataTo);
        }
        AjaxPo ret;
        try{
            List<MultiDataTo> dataTos=dataService.list(dataTo,page);
            ret=toSuccess(dataTos,((Page)dataTos).getTotal());
        }
        catch (ServiceException e){
            logger.error("获取万能机列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public AjaxPo add(MultiData data, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("MultiDataController.add()......参数为:" + data);
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
    public AjaxPo update(MultiData data, HttpServletRequest request , HttpServletResponse response) {
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
    public AjaxPo delete(MultiData data, HttpServletRequest request , HttpServletResponse response) {
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

    @RequestMapping(value = "/getOptions")
    @ResponseBody
    public AjaxPo getOptions(int id,int type, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("MultiDataController.getOptions()，参数为:");
        }
        AjaxPo ret;
        try{
            Map<String,List<Object>> options=dataService.getOptions(id,type);

            ret=toSuccess(options);
        }
        catch (ServiceException e){
            logger.error("获取万能机列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }
}
