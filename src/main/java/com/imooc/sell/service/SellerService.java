package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

/**
 * Created by Citrix on 2018/5/14.
 */
public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
