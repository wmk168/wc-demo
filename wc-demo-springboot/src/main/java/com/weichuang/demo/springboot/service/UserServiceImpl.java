package com.weichuang.demo.springboot.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.weichuang.demo.order.api.OrderApi;
import com.weichuang.demo.order.po.OrderPo;
import com.weichuang.demo.user.api.UserApi;
import com.weichuang.demo.user.po.UserPo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserApi userApi;

	/*
	 * @Autowired private OrderApi orderApi;
	 */
	@Override
	@LcnTransaction//分布式事务，这个注解必须的，开启分布式事务
	public Object getByKey(Object id) {
		
		  UserPo userPo=new UserPo(); 
		  userPo.setUserName("发fsdfd"); 
		  userPo.setAge(1);
		  System.out.println("添加用户返回ID={}"+userApi.add(userPo).getData());
		/*
		 * OrderPo orderPo=new OrderPo();
		 * orderPo.setAmount(BigDecimal.valueOf(1133.4546));
		 * orderPo.setOrderNo(System.currentTimeMillis()+"");
		 * System.out.println("添加订单返回ID={}"+orderApi.add(orderPo));
		 */
		  //System.out.println(1/0);//测试回滚，成功回滚了
		 
		
		return userApi.getByKey(id);
	}
}
