package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by Citrix on 2018/5/4.
 */
@Getter
public enum ProductStatusEnum {
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code) {
        this.code = code;
    }

}
