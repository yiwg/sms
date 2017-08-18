package com.xmy.sms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.Item;
import com.xmy.sms.po.Project;
import com.xmy.sms.service.IItemService;
import com.xmy.sms.service.IProjectService;
import com.xmy.sms.to.ItemTo;
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
@RequestMapping("/item")
public class ItemController extends BaseController {

    @Autowired
    private IItemService itemService;

    @RequestMapping(value = "/gotoItemCfg")
    public String gotoProjectCfg(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("ItemController.gotoItemCfg()。。。。");
        return "itemCfg";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxPo list(ItemTo itemTo, PageInfo page, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ItemController.query()，参数为:"+itemTo);
        }
        AjaxPo ret;
        try{
            List<ItemTo> itemTos=itemService.list(itemTo,page);
            ret=toSuccess(itemTos,((Page)itemTos).getTotal());
        }
        catch (ServiceException e){
            logger.error("获取工程列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public AjaxPo add(Item item, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ItemController.add()......参数为:" + item);
        }
        AjaxPo ret ;
        try{
            item=itemService.add(item);
            ret=toSuccess(item);
        }
        catch (ServiceException e){
            logger.error("添加失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

   @RequestMapping(value = "/update")
    @ResponseBody
    public AjaxPo update(Item item, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.update()......参数为:" + item);
        }
        AjaxPo ret ;
        try{
            item=itemService.update(item);
            ret=toSuccess(item);
        }
        catch (ServiceException e){
            logger.error("更新失败：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public AjaxPo delete(Item item, HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ProjectController.delete()......参数为:" + item);
        }
        AjaxPo ret ;
        try{
            itemService.delete(item);
            ret=toSuccess(null);
        }
        catch (ServiceException e){
            logger.error("删除：",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }

    @RequestMapping(value = "/list4menu")
    @ResponseBody
    public AjaxPo list4menu(ItemTo itemTo,HttpServletRequest request , HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("ItemController.query()，参数为:"+itemTo);
        }
        AjaxPo ret;
        try{
            List<ItemTo> itemTos=itemService.list4menu(itemTo);
            ret=toSuccess(itemTos);
        }
        catch (ServiceException e){
            logger.error("获取工程列表异常",e);
            ret=toFail(-1,e.getMessage());
        }
        return ret;
    }
}
