package com.yeafel.service;

import com.yeafel.dto.OrderDTO;

/**
 *  推送消息
 * Created by kangyifan on 2018/8/16 17:12
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
