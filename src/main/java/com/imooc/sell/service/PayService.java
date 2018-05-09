package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * 支付
 * Created by Citrix on 2018/5/8.
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);
}
