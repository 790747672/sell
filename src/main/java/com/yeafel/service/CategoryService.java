package com.yeafel.service;

import com.yeafel.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by kangyifan on 2018/7/25 14:24
 */
public interface CategoryService {

    ProductCategory findByCategoryId(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
