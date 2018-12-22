package com.yeafel.service;

import com.yeafel.dto.OrderDTO;

/**
 *  支付
 * Created by kangyifan on 2018/8/15 9:37
 */
public interface PayService {

    void create(OrderDTO orderDTO);
}
