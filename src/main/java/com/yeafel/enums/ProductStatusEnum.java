package com.yeafel.enums;

import lombok.Getter;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 商品状态
 * Created by kangyifan on 2018/7/26 9:28
 */
@Getter //自动生成getter方法
public enum ProductStatusEnum implements CodeEnum<Integer> {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }
}
