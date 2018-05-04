package com.newBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	@RequestMapping("toIndex2")
	public String toIndex2(){
		System.out.println("进入方法");
		return "index2";
	}
}
