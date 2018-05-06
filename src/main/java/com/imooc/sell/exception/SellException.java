package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * Created by Citrix on 2018/5/5.
 */
public class SellException extends RuntimeException{

    private Integer code;
    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}