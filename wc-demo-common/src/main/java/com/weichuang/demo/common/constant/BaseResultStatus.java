package com.weichuang.demo.common.constant;

import com.weichuang.demo.bean.CodeMsg;

public  interface BaseResultStatus {
	/**
	 * 成功
	 */
	public CodeMsg SUCCESS=new CodeMsg("0000","成功");
	/**
	 * 断容状态
	 */
	public CodeMsg FAIL=new CodeMsg("9999","成功");
	/**
	 * 断容状态-调用远程服务失败
	 */
	public CodeMsg FALLBACK_FAIL=new CodeMsg("9990","调用远程服务失败");
	
}
