package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * Created by Citrix on 2018/5/15.
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息推送
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
