package com.team.loanorder.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class User {
    private Integer uid;

    private String username;

    private String password;

    private String uOccupation;

    private String uIncome;

    private String uRegion;

    private Integer isDelete;
}