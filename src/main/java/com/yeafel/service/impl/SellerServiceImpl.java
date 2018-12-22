package com.yeafel.service.impl;

import com.yeafel.dataobject.SellerInfo;
import com.yeafel.repository.SellerInfoRepository;
import com.yeafel.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kangyifan on 2018/8/16 9:39
 */
@Service
public class SellerServiceImpl implements SellerService{

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
