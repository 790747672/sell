package com.yeafel.enums;

import lombok.Getter;

/**
 * Created by kangyifan on 2018/8/2 17:08
 */
@Getter
public enum PayStatusEnum implements CodeEnum<Integer>{
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
