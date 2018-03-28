package com.gxs.ssm.service;

import com.gxs.ssm.entity.UserVO;

/**
 * 
* Copyright: Copyright (c) 2018 
* 
* @ClassName: UserService.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 龚兴盛
* @date: 2018年3月27日 下午2:24:17 
*
 */
public interface UserService {
	 /**
	  * 
	 * @Function: UserService.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: 龚兴盛
	 * @date: 2018年3月28日 上午9:53:35 
	 *
	  */
    public UserVO queryObject(String id);

}
