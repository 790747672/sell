package com.yeafel.utils;

/**
 * Created by kangyifan on 2018/8/15 14:11
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    /**
     * 比较两个金额是否相等，    比如 0.1和0.10,
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1,Double d2){
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE){
            return true;
        }else{
            return false;
        }
    }
}
