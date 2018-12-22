package com.yeafel.service;

import com.yeafel.dataobject.SellerInfo;

/**
 *  卖家端
 * Created by kangyifan on 2018/8/16 9:36
 */
public interface SellerService{

    /**
     *  通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
