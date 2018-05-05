package com.newBlog.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;


public class WebUtils {
	/**
	 * 返回一个json对象
	 * @param obj
	 */
	public static String write(Object obj){
		String jsonString = JSON.toJSONString(obj,SerializerFeature.DisableCircularReferenceDetect);
		return jsonString;
	}
	/**
	 * 
	 * @param success true OR false
	 * @param message 错误或者成功的信息
	 * @return
	 */
	public static String ajaxReturn(boolean success, String message){
		Map<String,Object> rtn = new HashMap<String,Object>();
		rtn.put("success", success);
		rtn.put("message",message);
		return WebUtils.write(rtn);
		
	}
}
