package com.gxs.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxs.ssm.dao.UserDao;
import com.gxs.ssm.entity.UserVO;
import com.gxs.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	
	public UserVO queryObject(String id) {
		// TODO Auto-generated method stub
		return userDao.queryById(id);
	}

}
