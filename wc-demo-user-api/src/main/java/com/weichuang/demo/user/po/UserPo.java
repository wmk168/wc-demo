package com.weichuang.demo.user.po;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.weichuang.demo.po.BasePo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@SuppressWarnings("serial")
@Table(name="t_user")
public class UserPo extends BasePo{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//按照数据库自增
	Long id;
	@Column(name="userName")
	String userName;//如果大小号就自动分割成了user_name
	Integer age;//自动对应
	
	
}
