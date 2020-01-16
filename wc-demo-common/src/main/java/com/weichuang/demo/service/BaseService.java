package com.weichuang.demo.service;

/**
 * 基础数据业务接口
 * @author wmk
 *
 */
public interface BaseService<T> {
	public Integer add(T t);
	public T getByKey(Object key);
}
