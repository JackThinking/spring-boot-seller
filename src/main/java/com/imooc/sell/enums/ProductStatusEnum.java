package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by Citrix on 2018/5/4.
 */
@Getter//也是lombak的好东西
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
