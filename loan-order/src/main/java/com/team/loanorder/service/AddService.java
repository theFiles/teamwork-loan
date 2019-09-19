package com.team.loanorder.service;

/**
 * @author Administrator
 */
public interface AddService {
    int add(Integer broMoney,
            String broUse,
            String broPeriods,
            Integer downPayment,
            String broAccount,
            String uid
    );
}
