package com.team.loanuser.service.impl;

import com.team.loanuser.service.UserService;
import com.team.loanuser.utils.AlipayUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private AlipayUtil alipayUtil;

    @Override
    public String run() {
        String outTradeNo = System.currentTimeMillis()+"";
        double price = 0.01;
        String subject = "测试标题";
        String json = "{"
                + "\"out_trade_no\":\""+outTradeNo+'"'
                + ",\"product_code\":\"FAST_INSTANT_TRADE_PAY\""
                + ",\"total_amount\":"+price
                + ",\"subject\":\""+subject+'"'
                + "}";
        return alipayUtil.webPay("https://www.baidu.com/",json);
    }
}
