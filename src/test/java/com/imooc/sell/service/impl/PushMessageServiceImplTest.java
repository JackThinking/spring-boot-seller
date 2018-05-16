package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Citrix on 2018/5/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1525609147609672877");
        for (int i = 0; i < 1000; i++) {
            pushMessageService.orderStatus(orderDTO);
        }

    }

}