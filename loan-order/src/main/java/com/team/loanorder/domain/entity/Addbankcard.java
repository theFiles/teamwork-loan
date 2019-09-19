package com.team.loanorder.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Addbankcard {
    private Integer cardId;

    private String userName;

    private String bankName;

    private String bankArea;

    private String subBranch;

    private Integer uid;

    private Date createDate;
}