package com.imooc.sell.utils;

/**
 * Created by Citrix on 2018/5/10.
 */
public class MathUtil {

    private static final Double Money_Range = 0.01;

    public static Boolean equals(Double num1, Double num2) {
        Double result = Math.abs(num1 - num2);
        if (result < Money_Range) {
            return true;
        }
        return false;

    }

}
