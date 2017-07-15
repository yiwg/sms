package com.xmy.sms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <dl>
 * <dt>TestController</dt>
 * <dd>Description:测试Controller</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2016年12月20日</dd>
 * </dl>
 *
 * @author cy
 */
@RestController
public class TestController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="/test")
    public ModelAndView test(){
        logger.info("进入/test1");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name", "xxx");
        return modelAndView;
       // return "index";
    }

    @RequestMapping(value="/test2")
    public String cas(){
        logger.info("进入/test2");
        return "test2";
    }
}