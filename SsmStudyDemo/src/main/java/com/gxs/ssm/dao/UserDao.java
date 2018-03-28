package com.gxs.ssm.dao;

import com.gxs.ssm.entity.UserVO;

/**
 * 
* Copyright: Copyright (c) 2018 
* 
* @ClassName: UserDao.java
* @Description: 用户相关的数据库操作
*
* @version: v1.0.0
* @author: 龚兴盛
* @date: 2018年3月27日 下午2:24:28 
*
 */
public interface UserDao {
	
	public UserVO queryById(String id);
}
