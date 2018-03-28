package com.gxs.ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.gxs.ssm.entity.UserVO;
import com.gxs.ssm.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService uservice;
	/**
	 * 
	* @Function: UserController.java
	* @Description: 根据ID查找用户信息
	*
	* @param:用户ID
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 14212
	* @date: 2018年3月28日 上午10:03:13 
	*
	 */
	@RequestMapping("/id/{id}")
	@ResponseBody
	public UserVO queryById(@PathVariable("id") String id){

		UserVO vo = uservice.queryObject(id);
		//return JSON.toJSONString(vo);
		return vo;
	}
}
