package com.weichuang.demo.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weichuang.demo.api.BaseControllerApiImpl;
import com.weichuang.demo.order.api.OrderApi;
import com.weichuang.demo.order.po.OrderPo;

@RestController
@RequestMapping("order")
public class OrderController extends BaseControllerApiImpl<OrderPo> implements OrderApi{

}
