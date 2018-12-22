package com.yeafel.service.impl;

import com.yeafel.dataobject.ProductCategory;
import com.yeafel.dataobject.dao.ProductCategoryDao;
import com.yeafel.repository.ProductCategoryRepository;
import com.yeafel.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import java.util.List;

/**
 *类目
 * Created by kangyifan on 2018/7/25 14:31
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

  /*  @Autowired
    private ProductCategoryDao productCategoryDao;*/

    @Override
    public ProductCategory findByCategoryId(Integer categoryId) {
        return  repository.findByCategoryId(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
