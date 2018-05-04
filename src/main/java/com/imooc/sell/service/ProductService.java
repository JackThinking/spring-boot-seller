package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by Citrix on 2018/5/4.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * @author Citrix
     * @date 2018/5/4 下午2:41
     * @param []
     * @return java.util.List<com.imooc.sell.dataobject.ProductInfo>
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    //减库存

}
