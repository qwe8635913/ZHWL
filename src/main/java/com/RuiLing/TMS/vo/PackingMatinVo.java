package com.RuiLing.TMS.vo;

import com.RuiLing.component.commons.vo.CommonVO;

import java.io.Serializable;
import java.util.Date;

public class PackingMatinVo extends CommonVO implements Serializable {
    private Long id;

    /**
     * 司机
     */
    private String driver;

    /**
     * 电话
     */
    private String phone;

    /**
     * 运输方式编码
     */
    private String transferTypeCode;

    /**
     * 车号ID
     */
    private String packmagingId;

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
    private String recRevisor;

    /**
     * 修改人
     */
    private Date recRevisorTime;

    /**
     * 版本
     */
    private Long version;

    /**
     * 空车重量
     */
    private String emptyWgt;

    /**
     * 身份证号
     */
    private String sfzCode;

    /**
     * 驾驶证到期年限
     */
    private String driverEndTime;

    /**
     * 身份证照片路径
     */
    private String sfzImageUrl;

    /**
     * 驾驶证照片路径
     */
    private String driveImageUrl;

    /**
     * 行驶证照片路径
     */
    private String drivingImageUrl;

    /**
     * 汽车照片路径
     */
    private String carImageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public String getPackmagingId() {
        return packmagingId;
    }

    public void setPackmagingId(String packmagingId) {
        this.packmagingId = packmagingId;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getEmptyWgt() {
        return emptyWgt;
    }

    public void setEmptyWgt(String emptyWgt) {
        this.emptyWgt = emptyWgt;
    }

    public String getSfzCode() {
        return sfzCode;
    }

    public void setSfzCode(String sfzCode) {
        this.sfzCode = sfzCode;
    }

    public String getDriverEndTime() {
        return driverEndTime;
    }

    public void setDriverEndTime(String driverEndTime) {
        this.driverEndTime = driverEndTime;
    }

    public String getSfzImageUrl() {
        return sfzImageUrl;
    }

    public void setSfzImageUrl(String sfzImageUrl) {
        this.sfzImageUrl = sfzImageUrl;
    }

    public String getDriveImageUrl() {
        return driveImageUrl;
    }

    public void setDriveImageUrl(String driveImageUrl) {
        this.driveImageUrl = driveImageUrl;
    }

    public String getDrivingImageUrl() {
        return drivingImageUrl;
    }

    public void setDrivingImageUrl(String drivingImageUrl) {
        this.drivingImageUrl = drivingImageUrl;
    }

    public String getCarImageUrl() {
        return carImageUrl;
    }

    public void setCarImageUrl(String carImageUrl) {
        this.carImageUrl = carImageUrl;
    }
}
