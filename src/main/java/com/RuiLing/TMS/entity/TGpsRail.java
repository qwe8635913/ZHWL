package com.RuiLing.TMS.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class TGpsRail {
    /**
     * 电子围栏ID
     */
    private long railId;

    /**
     * 电子围栏纬度
     */
    private BigDecimal railDimensionality;

    /**
     * 电子围栏的经度
     */
    private BigDecimal railLongitude;

    /**
     * 电子围栏的名称
     */
    private String railName;

    /**
     * 电子围栏的半径
     */
    private String railRadius;

    /**
     * 电子围栏所在的地址信息
     */
    private String railMessage;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态
     */
    private BigDecimal railState;

    /**
     * 类型
     */
    private BigDecimal railType;
}