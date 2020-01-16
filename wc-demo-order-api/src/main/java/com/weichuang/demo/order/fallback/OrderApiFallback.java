package com.weichuang.demo.order.fallback;

import org.springframework.stereotype.Component;

import com.weichuang.demo.api.BaseFallbackApi;
import com.weichuang.demo.order.api.OrderApi;
import com.weichuang.demo.order.po.OrderPo;

@Component
public class OrderApiFallback extends BaseFallbackApi<OrderPo> implements OrderApi{

}
