package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * 支付
 * Created by Citrix on 2018/5/8.
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);
    /**
     * @author Citrix  
     * @date 2018/5/10 下午9:22
     * @param [notifyData]  
     * @return com.lly835.bestpay.model.PayResponse  
     */
    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}

