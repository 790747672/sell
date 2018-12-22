package com.yeafel.handler;

import com.yeafel.VO.ResultVO;
import com.yeafel.exception.ReponseBankException;
import com.yeafel.exception.SellException;
import com.yeafel.exception.SellerAuthorizeException;
import com.yeafel.utils.ResultVOUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kangyifan on 2018/8/16 16:30
 */
@ControllerAdvice
public class SellExceptionHandler {

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException(){
        return new ModelAndView("redirect:"
        .concat("····")
        .concat("····"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = ReponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleReponseBankException(){

    }
}
