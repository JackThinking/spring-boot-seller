package com.imooc.sell.utils;

import java.util.Random;

/**
 * Created by Citrix on 2018/5/5.
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * @author Citrix  
     * @date 2018/5/5 下午3:53
     * @param []  
     * @return java.lang.String  
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;//生成六位随机数

        return System.currentTimeMillis()+String.valueOf(number);//int转string
    }
}
