package com.weichuang.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weichuang.demo.order.api.OrderApi;
import com.weichuang.demo.springboot.service.UserService;
import com.weichuang.demo.user.api.UserApi;
import com.weichuang.demo.user.po.UserPo;

@RestController
@RequestMapping("user")
@RefreshScope
//必须配置这个后，通过http://desktop-ueulfov:5570/actuator/bus-refresh刷新才会更新，
//这个路径必须是post请求，不然请求失败，对应系统内置的配置属性无法做更新操作，如果要进行刷新，必须要定义对象出来，加载这个注解，这个需要多研究
public class UserConsumeController {
	
	@Autowired
	UserApi userApi;
	@Autowired
	OrderApi orderApi;
	@Autowired
	UserService userService;

	@Value("${feign.hystrix.enabled}")
    String testRefreshVal;

	
	@RequestMapping("getById")
	public Object getById(@RequestParam(name="id")Object id) {
		System.out.println("刷新值===========> "+testRefreshVal);
		//System.out.println(userApi.getByKey(id));
		
		/*
		 * UserPo userPo=new UserPo(); userPo.setUserName("发送到发送到"); userPo.setAge(1);
		 * 
		 * System.out.println(userPo+"添加用户返回ID={}"+userApi.add(userPo).getData());
		 */
		return userService.getByKey(id);
	}
}
