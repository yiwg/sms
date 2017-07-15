package com.xmy.sms.interceptor;

import com.xmy.sms.po.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yiwg on 2017/7/10.
 */
public class LoginInterceptor  extends HandlerInterceptorAdapter {

    private Log logger = LogFactory.getLog(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("进入LoginInterceptor.preHandle()..............");

        String uri = request.getRequestURI();
        //设置不拦截的对象
        String[] noFilters = new String[] { "common", "js",
                "images", "css", "jsp","/user/gotoLogin" ,"/user/welcome","/user/login" ,
                "/user/register" , "/user/active" , "/user/gotoRegister", "/user/checkEmail",
                "/user/gotoForgetPwd", "/user/forgetPwd","/user/gotoNewPwd","/user/forwardPwdOk",
                "/customWs/", "/tools/", "/recordFileWs/","user/reSendEmail","woff","ttf","eot","font","fonts"
        };
        for (String s : noFilters) {
            if (uri.indexOf(s) != -1) {
                //不拦截
                return super.preHandle(request, response, handler);
            }
        }

        // 如果session中没有user对象，则创建一个。
        User user = (User) request.getSession().getAttribute("user");
        if (user == null)
        {
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
            return false;
        }
        return true;
    }
}
