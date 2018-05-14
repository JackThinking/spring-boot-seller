package com.imooc.sell.repository;

import com.imooc.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Citrix on 2018/5/14.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String>{
    SellerInfo findByOpenid(String openid);
}
