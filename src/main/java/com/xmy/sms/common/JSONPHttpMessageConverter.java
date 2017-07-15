package com.xmy.sms.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.xmy.sms.common.JSONPObject;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * <dl>
 * <dt>JSONPHttpMessageConverter</dt>
 * <dd>Description:FastJson的Jsonp扩展</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2016年12月27日</dd>
 * </dl>
 *
 * @author cy
 */
public class JSONPHttpMessageConverter extends FastJsonHttpMessageConverter {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    private Charset charset;

    public JSONPHttpMessageConverter() {
        super();
        this.charset = UTF8;
    }

    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // obj就是controller中注解为@ResponseBody的方法返回值对象
        if(obj instanceof JSONPObject){
            JSONPObject jsonpObject = (JSONPObject)obj;
            OutputStream out = outputMessage.getBody();
            String text = JSON.toJSONString(jsonpObject.getJson(), super.getFeatures());
            String jsonpText = new StringBuilder(jsonpObject.getFunction()).append("(").append(text).append(")").toString();
            byte[] bytes = jsonpText.getBytes(this.charset);
            out.write(bytes);
        }else{
            super.writeInternal(obj, outputMessage);
        }
    }


    @Override
    public Charset getCharset() {
        return charset;
    }

    @Override
    public void setCharset(Charset charset) {
        this.charset = charset;
    }
}