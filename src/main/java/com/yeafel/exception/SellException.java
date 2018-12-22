package com.yeafel.exception;

import com.yeafel.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by kangyifan on 2018/8/3 10:29
 */
@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
