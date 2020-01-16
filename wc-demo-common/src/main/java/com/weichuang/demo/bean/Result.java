package com.weichuang.demo.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.weichuang.demo.common.constant.CommonResultStatus;

import lombok.ToString;

@SuppressWarnings("serial")
@ToString
@JsonInclude(value=Include.NON_NULL)//返回null字段不显示
public class Result<T> implements Serializable {

    Boolean success;
	String code;
	String msg;
	T data;
	
	private static <T> Result<T> setResult(CodeMsg codeMsg,T data){
		return new Result<T>().setCode(codeMsg.code)
				.setMsg(codeMsg.msg).setData(data);
	}
	
	public static <T> Result<T> success(T data){
		return setResult(CommonResultStatus.SUCCESS, data).setSuccess(true);
	}
	
	public static <T> Result<T> fallbackFail(){
		return setResult(CommonResultStatus.FALLBACK_FAIL, null);
	}

	/**
	 * @return the success
	 */
	public Boolean isSuccess() {
		return success;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param success the success to set
	 */
	public Result<T> setSuccess(boolean success) {
		this.success = success;
		return this;
	}
	/**
	 * @param code the code to set
	 */
	public Result<T> setCode(String code) {
		this.code = code;
		return this;
	}
	/**
	 * @param msg the msg to set
	 */
	public Result<T> setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	/**
	 * @param data the data to set
	 */
	public Result<T> setData(T data) {
		this.data = data;
		return this;
	}
	
}
