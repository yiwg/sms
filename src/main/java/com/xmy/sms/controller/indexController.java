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
public class IndexController extends BaseController {

    @RequestMapping(value = "/pressRecord")
    public String gotopressRecord(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("indexController.pressRocord()。。。。");
        return "pressRecord";
    }
    @RequestMapping(value = "/universalRecord")
    public String gotoUniversalRecord(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        logger.debug("indexController.pressRocord()。。。。");
        return "universalRecord";
    }
    @RequestMapping(value = "/pressOver")
    public String gotoPressOver(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        logger.debug("indexController.pressRocord()。。。。");
        return "pressOver";
    }
    @RequestMapping(value = "/universalOver")
    public String gotoUniversalOver(HttpServletRequest request,
                                HttpServletResponse response) throws Exception {
        logger.debug("indexController.pressRocord()。。。。");
        return "universalOver";
    }
    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            return "login";
        }
        return "index";
    }

    @RequestMapping(value = "/gotoProjectCfg")
    public String gotoProjectCfg(HttpServletRequest request,
                                  HttpServletResponse response) throws Exception {
        logger.debug("indexController.gotoProjectCfg()。。。。");
        return "projectCfg";
    }
}
