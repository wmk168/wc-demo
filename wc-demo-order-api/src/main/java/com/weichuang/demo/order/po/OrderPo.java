package com.weichuang.demo.order.po;

import java.math.BigDecimal;

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
@Table(name="t_order")
public class OrderPo extends BasePo{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//按照数据库自增
	Long id;
	@Column(name="orderNo")
	String orderNo;
	@Column(name="amount")
	BigDecimal amount;//自动对应
}
