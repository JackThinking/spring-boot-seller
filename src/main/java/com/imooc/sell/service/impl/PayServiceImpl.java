package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Citrix on 2018/5/8.
 */
@Service
@Slf4j
public class PayServiceImpl {

    @Autowired
    private BestPayServiceImpl bestPayService;

    public void create(OrderDTO orderDTO){
        PayRequest payRequest = new PayRequest();
        bestPayService.pay(payRequest);
    }
}
