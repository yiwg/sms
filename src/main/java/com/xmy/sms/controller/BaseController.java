package com.xmy.sms.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;

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
}