package com.weichuang.demo.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.weichuang.demo.bean.Result;
import com.weichuang.demo.service.BaseService;

/**
 * api 基础控制器 实现类
 * @author wmk
 *
 */
public class BaseControllerApiImpl<T> implements BaseControllerApi<T>{
	
	@Autowired
	protected BaseService<T> baseService;
	
	@Override
	public Result<Integer> add(T t) {
		return Result.success(baseService.add(t));
	}
	
	@Override
		public Result<T> getByKey(Object key) {
			return Result.success(baseService.getByKey(key));
		}
}
