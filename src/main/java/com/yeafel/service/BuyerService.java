package com.yeafel.service;

import com.yeafel.dto.OrderDTO;

/**
 * 买家
 * Created by kangyifan on 2018/8/6 16:28
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
