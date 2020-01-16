package com.weichuang.demo.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weichuang.demo.bean.Result;

/**
 * 基本控制层API类
 * @author wmk
 *
 * @param <T>
 */
public interface BaseControllerApi<T> {
	
	@PostMapping("add")
	public Result<Integer> add(@RequestBody T t);//@RequestBody记得加上，不然feign对象无法注入值
	
	@RequestMapping("getByKey")
	public Result<T> getByKey(@RequestParam("key") Object key);
}
