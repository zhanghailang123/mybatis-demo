package com.zhl.custommybatis.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Description: 账单认领收费实体类
 *
 * @author fanxuemei [fanxuemei@sinosoft.com.cn]
 * date: 2019-09-20 16:22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RemiCraClaimInfo implements Serializable {
    private static final long serialVersionUID = -9017596979155902311L;

    private Long id;
    /**
     * CRA系统主键
     */
    private String craId;

    /**
     * 客户名称
     */
    private String custName;
    /**
     * 财务编码
     */
    private String fnncConNo;
    /**
     * 认领金额
     */
    private BigDecimal claimMoney;
    private String claimMoneyStr;
    /**
     * 审批通过时间
     */
//    @DateTimeFormat(pattern = DATE_CONSTANT)
//    @JsonFormat(pattern = DATE_CONSTANT, timezone = "GMT+8")
    private Date craCreTime;
    /**
     * 回款编号
     */
    private String payBackNumber;
    /**
     * cra客户id
     */
    private String custNo;

    /**
     * 记账日期
     */
    private String changeDate;
    private Date changeDateTime;
    /**
     * 回款时间
     */
//    @DateTimeFormat(pattern = DATE_CONSTANT)
//    @JsonFormat(pattern = DATE_CONSTANT, timezone = "GMT+8")
    private Date paybackDate;
    /**
     * 回款年月
     */
    private Integer payBackYm;
    /**
     * 收/付方名称
     */
    private String paymentName;
    /**
     * 公司ID
     */
    private Integer corpId;
    /**
     * 公司编码
     */
    private String corpCode;
    /**
     * 公司名称
     */
    private String corpName;
    /**
     * 银行账号
     */
    private String bankNo;
    /**
     * 可用余额
     */
    private BigDecimal remiableAmo;
    /**
     * 汇款单状态【未认领、部分认领、全部认领】
     */
    private Integer state;

    /**
     * 创建人ID
     */
    private Integer creId;
    /**
     * 创建时间
     */
//    @DateTimeFormat(pattern = DATE_TIME)
//    @JsonFormat(pattern = DATE_TIME, timezone = "GMT+8")
    private Date creTime;
    /**
     * 操作人ID
     */
    private Integer operId;
    /**
     * 操作时间
//     */
//    @DateTimeFormat(pattern = DATE_TIME)
//    @JsonFormat(pattern = DATE_TIME, timezone = "GMT+8")
    private Date operTime;
    /**
     * 是否有效
     */
    private Integer isEffect;
    /**
     * 回款年月
     */
    private Integer backYm;

    /**
     * 回款时间-开始
     */
//    @DateTimeFormat(pattern = DATE_CONSTANT)
//    @JsonFormat(pattern = DATE_CONSTANT, timezone = "GMT+8")
    private Date changeBegDate;
    /**
     * 回款时间-结束
     */
//    @DateTimeFormat(pattern = DATE_CONSTANT)
//    @JsonFormat(pattern = DATE_CONSTANT, timezone = "GMT+8")
    private Date changeEndDate;
    /**
     * 分页开始数
     */
    private Integer startIndex;
    /**
     * 分页结束数
     */
    private Integer endIndex;
    /**
     * 导入结果
     */
    private Integer impResult;
    /**
     * 导入失败原因
     */
    private String impFailReason;
}
