package com.yeafel.enums;

import lombok.Getter;
import org.hibernate.criterion.Order;

/**
 * Created by kangyifan on 2018/8/2 17:02
 */
@Getter
public enum  OrderStatusEnum implements CodeEnum<Integer> {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过code获取订单状态枚举
     * 不能这么写，如果还有另外的枚举状态，就还得复制拷贝过去
     * 所以用实现接口和工具类来实现
     * @param code
     * @return
     */
//    public static OrderStatusEnum getOrderStatusEnum(Integer code){
//        for(OrderStatusEnum orderStatusEnum:OrderStatusEnum.values()){
//            if(orderStatusEnum.getCode().equals(code)){
//                return orderStatusEnum;
//            }
//        }
//        return null;
//    }

}
