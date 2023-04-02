package com.RuiLing.TMS.vo;

import com.RuiLing.component.commons.vo.CommonVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EnteringApplyVo extends CommonVO implements Serializable {
    private Long id;

    /**
     * 申请单号或出门凭证
     */
    private String no;

    /**
     * 状态
     */
    private String statu;

    /**
     * 创建时间
     */
    private Date recCreateTime;

    /**
     * 创建人
     */
    private String recCreator;

    /**
     * 修改人
     */
    private String recRevisor;

    /**
     * 修改时间
     */
    private Date recRevisorTime;

    /**
     * 版本
     */
    private BigDecimal version;

    /**
     * 运输方式编码
     */
    private BigDecimal transferTypeCode;

    /**
     * 发出时间
     */
    private Date startTime;

    /**
     * 目的港口
     */
    private String targetPort;

    /**
     * 当前位置
     */
    private String currentPosition;

    /**
     * 船号
     */
    private String carNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
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

    public String getRecRevisor() {
        return recRevisor;
    }

    public void setRecRevisor(String recRevisor) {
        this.recRevisor = recRevisor;
    }

    public Date getRecRevisorTime() {
        return recRevisorTime;
    }

    public void setRecRevisorTime(Date recRevisorTime) {
        this.recRevisorTime = recRevisorTime;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public BigDecimal getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(BigDecimal transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }
}
