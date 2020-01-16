package com.weichuang.demo.api;

import com.weichuang.demo.bean.Result;

/**
 * 断容回调，基础类接口
 *
 * @param <T>
 */
public class BaseFallbackApi<T> implements BaseControllerApi<T>{

	@Override
	public Result<Integer> add(T t) {
		return Result.fallbackFail();
	}
	
	@Override
	public Result<T> getByKey(Object key) {
		return Result.fallbackFail();
	}
}
