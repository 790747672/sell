package com.yeafel.service.impl;

import com.yeafel.dto.OrderDTO;
import com.yeafel.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by kangyifan on 2018/8/16 17:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;
    @Test
    public void orderStatus() throws Exception{

        OrderDTO orderDTO = orderService.findOne("1533279601438245015");

        pushMessageService.orderStatus(orderDTO);
    }
}