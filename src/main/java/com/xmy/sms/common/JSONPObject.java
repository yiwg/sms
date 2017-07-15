package com.xmy.sms.common;

import java.io.Serializable;

/**
 * <dl>
 * <dt>JSONPObject</dt>
 * <dd>Description:Jsonp对象</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2016年12月27日</dd>
 * </dl>
 *
 * @author cy
 */
public class JSONPObject implements Serializable {

    private static final long serialVersionUID = -7634081032767024781L;

    private String function;

    private Object json;

    public JSONPObject(String function, Object json){
        this.function = function;
        if(function==null||function.equals("")){
            throw new RuntimeException("jsonp回调方法为空");
        }
        this.json = json;
    }

    public String getFunction() {
        return function;
    }

    public Object getJson() {
        return json;
    }

    public JSONPObject setFunction(String function) {
        this.function = function;
        return this;
    }

    public JSONPObject setJson(Object json) {
        this.json = json;
        return this;
    }

	@Override
	public String toString() {
		return "JSONPObject [function=" + function + ", json=" + json + "]";
	}

}