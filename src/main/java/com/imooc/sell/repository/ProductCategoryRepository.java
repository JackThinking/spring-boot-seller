package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Citrix on 2018/5/2.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
}
