package com.weichuang.demo.order.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.weichuang.demo.api.BaseControllerApi;
import com.weichuang.demo.order.fallback.OrderApiFallback;
import com.weichuang.demo.order.po.OrderPo;


@FeignClient(value = "demo-order", path = "order", fallback = OrderApiFallback.class)
public interface OrderApi extends BaseControllerApi<OrderPo>{

}

