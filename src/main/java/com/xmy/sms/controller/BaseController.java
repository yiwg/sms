package com.xmy.sms.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.xmy.sms.constant.ResultConstant;
import com.xmy.sms.po.AjaxPo;
import org.apache.log4j.Logger;
import org.omg.CORBA.StringHolder;

import java.util.HashMap;
import java.util.Map;

/**
 * <dl>
 * <dt>BaseController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/4/27</dd>
 * </dl>
 *
 * @author yiweiguo
 */
public class BaseController  {

    protected Logger logger = Logger.getLogger(getClass());

    protected Object toResult(int code,String msg,Object data,int total){
        Map<String,Object> result=new HashMap<>();
        if(code==0){
            result.put("success",true);
        }else {
            result.put("success",false);
        }
        result.put("code",code);
        result.put("msg",msg);
        result.put("data",data);
        result.put("total",total);
        return new JSONObject(result);
    }

    protected Object toResult(int code,String msg,Object data){
        Map<String,Object> result=new HashMap<>();
        if(code==0){
            result.put("success",true);
        }else {
            result.put("success",false);
        }
        result.put("code",code);
        result.put("msg",msg);
        result.put("data",data);
        return new JSONObject(result);
    }
    protected Object toResult(int code,String msg){
        Map<String,Object> result=new HashMap<>();
        if(code==0){
            result.put("success",true);
        }else {
            result.put("success",false);
        }
        result.put("code",code);
        result.put("msg",msg);
        return new JSONObject(result);
    }

    protected Object toResult(int code){
        Map<String,Object> result=new HashMap<>();
        if(code==0){
            result.put("success",true);
            result.put("msg","成功");
        }else {
            result.put("success",false);
            result.put("msg","失败");
        }
        result.put("code",code);
        return new JSONObject(result);
    }
    protected AjaxPo toSuccess(Object object){
        AjaxPo ret = new AjaxPo(true, ResultConstant.SUCCESS_DESC);
        ret.setObj(object);
        ret.setCode(ResultConstant.SUCCESS);
        return ret;
    }
    protected AjaxPo toSuccess(Object object,Long total){
        AjaxPo ret = new AjaxPo(true, ResultConstant.SUCCESS_DESC);
        ret.setObj(object);
        ret.setTotal(total);
        ret.setCode(ResultConstant.SUCCESS);
        return ret;
    }
    protected AjaxPo toFail(int code, String desc){
        AjaxPo ret = new AjaxPo(false, desc);
        ret.setCode(code);
        return ret;
    }

    protected AjaxPo toFail(int code, String desc,Object object){
        AjaxPo ret = new AjaxPo(false, desc);
        ret.setObj(object);
        ret.setTotal(((Page)object).getTotal());
        ret.setCode(code);
        return ret;
    }
}