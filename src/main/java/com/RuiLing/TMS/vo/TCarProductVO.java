package com.RuiLing.TMS.vo;

import com.RuiLing.component.commons.vo.CommonVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 用车需求
    */
public class TCarProductVO extends CommonVO implements Serializable {
    private BigDecimal id;

    /**
    * 需求单号
    */
    private String no;

    /**
    * 运输方式编码
    */
    private String transferTypeCode;

    /**
    * 车号ID
    */
    private BigDecimal packmagingId;

    /**
    * 订单状态
    */
    private String status;

    /**
    * 需求派车时间
    */
    private Date packmagingTime;

    /**
    * 实际派车时间
    */
    private Date packmagingActualTime;

    /**
    * 创建时间
    */
    private Date recCreateTime;

    /**
    * 创建人
    */
    private String recCreator;

    /**
    * 修改时间
    */
    private Date recRevisorTime;

    /**
    * 修改人
    */
    private String recRevisor;

    /**
    * 版本
    */
    private BigDecimal version;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public BigDecimal getPackmagingId() {
        return packmagingId;
    }

    public void setPackmagingId(BigDecimal packmagingId) {
        this.packmagingId = packmagingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPackmagingTime() {
        return packmagingTime;
    }

    public void setPackmagingTime(Date packmagingTime) {
        this.packmagingTime = packmagingTime;
    }

    public Date getPackmagingActulTime() {
        return packmagingActualTime;
    }

    public void setPackmagingActulTime(Date packmagingActualTime) {
        this.packmagingActualTime = packmagingActualTime;
    }

    public Date getRecCreateTime() {
        return recCreateTime;
    }

    public void setRecCreateTime(Date recCreateTime) {
        this.recCreateTime = recCreateTime;
    }

    public String getRecCreator() {
        return recCreator;
    }

    public void setRecCreator(String recCreator) {
        this.recCreator = recCreator;
    }

    public Date getRecRevisorTime() {
        return recRevisorTime;
    }

    public void setRecRevisorTime(Date recRevisorTime) {
        this.recRevisorTime = recRevisorTime;
    }

    public String getRecRevisor() {
        return recRevisor;
    }

    public void setRecRevisor(String recRevisor) {
        this.recRevisor = recRevisor;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }
}