package com.team.loanorder.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface BorrowMapper {

    int addByUid(@Param("broMoney") Integer broMoney,
                 @Param("broUse") String broUse,
                 @Param("broPeriods") String broPeriods,
                 @Param("downPayment") Integer downPayment,
                 @Param("broAccount") String broAccount,
                 @Param("uid") String uid
    );


}