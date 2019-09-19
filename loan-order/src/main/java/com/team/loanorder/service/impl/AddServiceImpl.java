package com.team.loanorder.service.impl;

import com.vip.loans.mapper.BorrowMapper;
import com.vip.loans.service.AddService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */

@Service
public class AddServiceImpl implements AddService {
    @Resource
    BorrowMapper borrowMapper;

    @Override
    public int add(Integer broMoney, String broUse, String broPeriods, Integer downPayment, String broAccount, String uid) {
        return borrowMapper.addByUid(broMoney,broUse,broPeriods,downPayment, broAccount,uid);
    }
}
