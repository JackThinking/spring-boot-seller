package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 支付
 * Created by Citrix on 2018/5/8.
 */
public interface PayService {

    void create(OrderDTO orderDTO);
}
