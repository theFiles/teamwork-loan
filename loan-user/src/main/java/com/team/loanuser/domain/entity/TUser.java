package com.team.loanuser.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TUser implements Serializable {
    private Integer userId;

    private String userName;

    private String userNickname;

    private String userPwd;

    private Byte userSex;

    private String userHeadimg;

    private String userPhone;

    private String userEmail;

    private String userMarriage;

    private String userLive;

    private String userAddress;

    private Integer recordId;

    private Integer enterpriseScaleId;

    private Integer incomeId;

    private Integer workLengthId;

    private Integer socialSecurityId;

    private Date userCreateTime;

    private Date userLastTime;

    private Byte userStatus;

    private Integer userTipsNum;

    private Integer chinaId;
}