package com.team.loanorder.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Borrow {
    private Integer broId;

    private Integer broMoney;

    private String broUse;

    private String broPeriods;

    private Integer downPayment;

    private String broAccount;

    private Date createDate;

    private String uid;

    private Byte isDelete;
}