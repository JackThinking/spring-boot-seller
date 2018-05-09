package com.imooc.sell.config;

import com.lly835.bestpay.config.WxPayH5Config;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Citrix on 2018/5/8.
 */
@Component
public class WechatPayConfig {


    @Autowired
    private WechatAccountConfig wechatAccountConfig;

    @Bean
    public BestPayServiceImpl bestPayService() {
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayH5Config(wxPayH5Config());
        return bestPayService;
    }

    @Bean
    public WxPayH5Config wxPayH5Config() {
        WxPayH5Config wxPayH5Config = new WxPayH5Config();
        wxPayH5Config.setAppId(wechatAccountConfig.getMpAppId());
        wxPayH5Config.setAppSecret(wechatAccountConfig.getMpAppSecret());
        wxPayH5Config.setMchId(wechatAccountConfig.getMchId());
        wxPayH5Config.setMchKey(wechatAccountConfig.getMchKey());
        wxPayH5Config.setKeyPath(wechatAccountConfig.getKeyPath());
        wxPayH5Config.setNotifyUrl(wechatAccountConfig.getNotifyUrl());//这边没法测试，因为没有支付账号


        // 测试支付  由于我是买的支付账号 和微信授权登陆账号不是一个账号，所以没有使用动态注入

//        wxPayH5Config.setAppId("wxd898fcb01713c658");
//        wxPayH5Config.setAppSecret("29d8a650db31472aa87800e3b0d739f2");
//        wxPayH5Config.setMchId(wechatAccountConfig.getMchId());
//        wxPayH5Config.setMchKey(wechatAccountConfig.getMchKey());
//        wxPayH5Config.setKeyPath(wechatAccountConfig.getKeyPath());
//        wxPayH5Config.setNotifyUrl("http://xiazhong.natapp1.cc/notify");
        return wxPayH5Config;
    }
}
