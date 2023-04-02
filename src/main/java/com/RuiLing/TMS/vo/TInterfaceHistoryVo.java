package com.RuiLing.TMS.vo;

import com.RuiLing.component.commons.vo.CommonVO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class TInterfaceHistoryVo  extends CommonVO implements Serializable {
    /**
    * 履历ID
    */
    private BigDecimal id;

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