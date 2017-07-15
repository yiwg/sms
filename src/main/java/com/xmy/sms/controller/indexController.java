package com.xmy.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yiwg on 2017/7/12.
 */
@Controller
@RequestMapping("/index")
public class indexController extends BaseController {

    @RequestMapping(value = "/pressRecord")
    public String gotoLogin(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("indexController.pressRocord()。。。。");
        return "pressRecord";
    }
    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            return "login";
        }
        return "index";
    }
}
