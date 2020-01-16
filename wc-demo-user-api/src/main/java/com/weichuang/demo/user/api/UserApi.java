package com.weichuang.demo.user.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.weichuang.demo.api.BaseControllerApi;
import com.weichuang.demo.user.fallback.UserApiFallback;
import com.weichuang.demo.user.po.UserPo;

@FeignClient(value = "demo-user", path = "user", fallback = UserApiFallback.class)
public interface UserApi extends BaseControllerApi<UserPo>{
	
}
