package com.yeafel.utils;

import java.util.Random;

/**
 * Created by kangyifan on 2018/8/3 10:56
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();

//        System.currentTimeMillis();     //当前毫秒数

        Integer number =random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
