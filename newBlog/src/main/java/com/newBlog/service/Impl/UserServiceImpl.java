package com.newBlog.service.Impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newBlog.mapper.UserMapper;
import com.newBlog.pojo.User;
import com.newBlog.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	/**
	 * 用户注册
	 */
	@Override
	public void regist(User user) {
		userMapper.insert(user);
		
	}
}
