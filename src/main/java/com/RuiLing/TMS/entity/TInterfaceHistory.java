package com.RuiLing.TMS.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class TInterfaceHistory {
    /**
    * 履历ID
    */
    private Long id;

    /**
    * 接口名称
    */
    private String apiName;

    /**
    * 请求方法
    */
    private String requestMethod;

    /**
    * 请求UPL
    */
    private String requestUrl;

    /**
    * 请求IP
    */
    private String requestIp;

    /**
    * 请求时间
    */
    private Date requestTime;

    /**
    * 响应状态码
    */
    private BigDecimal requestStatusCode;

    /**
    * 请求参数
    */
    private String requestParams;

    /**
    * 响应结果
    */
    private String requestResult;

    /**
    * 错误信息
    */
    private String errorMsg;

    /**
    * 日志级别
    */
    private String logLevel;

    /**
    * 用户ID
    */
    private BigDecimal userId;

    /**
    * 用户姓名
    */
    private String userName;

    /**
    * 创建时间
    */
    private Date createTime;
}