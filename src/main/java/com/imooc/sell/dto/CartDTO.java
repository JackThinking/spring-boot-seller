package com.imooc.sell.dto;

import lombok.Data;

/**
 * 下单的时候前端返回的只有商品ID和数量
 * Created by Citrix on 2018/5/5.
 */
@Data
public class CartDTO {

    /**商品Id*/
    private String productId;

    /**数量**/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
