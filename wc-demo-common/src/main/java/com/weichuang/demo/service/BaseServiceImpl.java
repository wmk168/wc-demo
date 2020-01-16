package com.weichuang.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.weichuang.demo.dao.BaseDao;

/**
 * 基础数据业务接口实现类
 * @author wmk
 *
 */
public class BaseServiceImpl<T> implements BaseService<T>{
	
	@Autowired
	protected BaseDao<T> baseDao;
	
	//@LcnTransaction会占有数据库连接资源，TXC相对LCN占有整个资源更多，但是不会占有数据库连接资源
	//tcc效率比较高，但是开发成本很高,自己的手动回滚事务，整体效率是tcc>lcn>txc
	@Override
	@LcnTransaction(propagation = DTXPropagation.SUPPORTS)
    @Transactional
	public Integer add(T t) {
		return baseDao.insertSelective(t);
	}
	
	@Override
	public T getByKey(Object key) {
		String code="1111";
		if(code.equals(2222)) {
			
		}
		return baseDao.selectByPrimaryKey(key);
	}
}
