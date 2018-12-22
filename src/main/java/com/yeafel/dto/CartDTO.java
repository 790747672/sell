package com.yeafel.dto;

import lombok.Data;

/**
 * 购物车
 * Created by kangyifan on 2018/8/3 11:18
 */
@Data
public class CartDTO {

    /** 商品id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
