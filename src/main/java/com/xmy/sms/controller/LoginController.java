package com.xmy.sms.controller;

/*import com.channelsoft.col.colweb.constants.Constants.TuserConstants;
import com.channelsoft.col.colweb.constants.UserStaticType;
import com.channelsoft.col.colweb.po.AjaxPo;
import com.channelsoft.col.colweb.po.User;
import com.channelsoft.col.colweb.service.UserServiceI;*/
import com.xmy.sms.po.AjaxPo;
import com.xmy.sms.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class LoginController extends BaseController {

	/*@Autowired
	private UserServiceI service;*/

	@RequestMapping(value = "/gotoLogin")
	public String gotoLogin(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		logger.debug("进入LoginController.gotoLogin()。。。。");
		if (request.getSession().getAttribute("user") != null) {
			return "index";
		}
		return "login";
	}

	@RequestMapping(value = "/login")
	@ResponseBody
	public AjaxPo login(User user, HttpServletRequest request,
						HttpServletResponse response) throws Exception {
		logger.debug("进入LoginController.login()。。。。 参数为：" + user);
		// 判断用户名和密码是否正确
		AjaxPo ret = new AjaxPo(true, "成功");
//		Map<String,Integer> obj = new HashMap<String,Integer>();
//		obj.put("firstLogin", TuserConstants.ALREADY_LOGIN);
//		ret.setObj(obj);
		try
		{
		if (!("ywg".equals(user.getName())&&"123456".equals(user.getPassWord()))) {
			ret.setSuccess(false);
    		ret.setMsg("用户名或密码错误！");
			return ret;
		}
		else 
		{
			request.getSession(true).setAttribute("user", user);
		}
		}catch(Exception e)
		{
			logger.error(e.getMessage());
			ret.setSuccess(false);
    		ret.setMsg(e.getMessage());
			return ret;
		}
		return ret;
	}
	


	@RequestMapping(value = "/loginout")
	public String loginout(HttpServletRequest request,
						   HttpServletResponse response) throws Exception {
		logger.debug("进入LoginController.loginout()。。。。");
		if (request.getSession().getAttribute("user") != null) {
			request.getSession().setAttribute("user",null);
		}
		return "login";
	}

}
