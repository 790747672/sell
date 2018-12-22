package com.yeafel.repository;

import com.yeafel.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kangyifan on 2018/8/2 17:29
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

        List<OrderDetail> findByOrderId(String orderId);


}
