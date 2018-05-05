package com.newBlog.controller;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newBlog.pojo.User;
import com.newBlog.service.UserService;
import com.newBlog.utils.WebUtils;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	//regist注册
	@RequestMapping("regist")
	@ResponseBody
	public String regist(User user){
		System.out.println(user);
		//md5加密密码，用密码+账号 加密两次
		
		try {
			Md5Hash md5Hash = new Md5Hash(user.getUserPwd(), user.getUserName(), 2);
			String userPwd = md5Hash.toString();
			user.setUserPwd(userPwd);
			userService.regist(user);
			return WebUtils.ajaxReturn(true, "注册成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return  WebUtils.ajaxReturn(false, "注册失败！");
		}
	}
}
