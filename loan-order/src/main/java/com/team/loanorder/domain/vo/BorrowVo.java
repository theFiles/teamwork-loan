package com.team.loanorder.domain.vo;

import lombok.Data;

/**
 * @author Administrator
 */

@Data
public class BorrowVo {
    private Integer broId;

    private Integer broMoney;

    private String broUse;

    private String broPeriods;

    private Integer downPayment;

    private String broAccount;

    private String uid;

    private Byte isDelete;
}
