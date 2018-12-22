package com.yeafel.repository;

import com.yeafel.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kangyifan on 2018/7/25 11:14
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    ProductCategory findByCategoryId(Integer id);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
