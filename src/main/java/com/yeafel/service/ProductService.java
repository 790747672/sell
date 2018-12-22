package com.yeafel.service;

import com.yeafel.dataobject.ProductInfo;
import com.yeafel.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * Created by kangyifan on 2018/7/26 9:11
 */
public interface ProductService {

    ProductInfo findByProductId(String productId);

    /**
     * 查询所有在架商品列表(客户需求)
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查找所有商品(管理端的需求)
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);



}
