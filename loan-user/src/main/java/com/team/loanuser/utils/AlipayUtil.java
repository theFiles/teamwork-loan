package com.team.loanuser.utils;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AlipayUtil {
    private String format = "json";

    @Value("${alipay.gateway}")
    private String gateway;

    @Value("${alipay.app-infor.id}")
    private String appId;

    @Value("${alipay.app-infor.private-key}")
    private String appPrivateKey;

    @Value("${alipay.charset}")
    private String charset;

    @Value("${alipay.public-key}")
    private String alipayPublicKey;

    @Value("${alipay.sign-type}")
    private String signType;

    @Value("${alipay.app-infor.notify-url}")
    private String notifyUrl;

    /**
     * 电脑网页支付
     * @param url           请求成功跳转页面地址
     * @param jsonConfig    配置json字符串
     * @return              html字符串
     */
    public String webPay(String url,String jsonConfig){
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(gateway, appId, appPrivateKey, format, charset, alipayPublicKey, signType);
        String form = "";

        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        // 客户端跳转地址
        request.setReturnUrl(url);
        // 在公共参数中设置回跳和通知地址
        request.setNotifyUrl(notifyUrl);
        // 设置请求参数
        request.setBizContent(jsonConfig);

        try {
            // 调用SDK生成html表单，带js自动提交表单
            form = alipayClient.pageExecute(request).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        // 返回html表单字符串
        return form;
    }
}
