package com.RuiLing.TMS.vo;

import com.RuiLing.component.commons.vo.CommonVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class TPackingmatinfoTmsVO extends CommonVO implements Serializable {
    private String id;

    /**
    * 车号
    */
    private String carNo;

    /**
    * 运输方式编码
    */
    private Long transferTypeCode;

    /**
    * 驾驶人
    */
    private String driver;

    /**
    * 驾驶人电话
    */
    private String driverPhone;

    /**
    * 仓库ID
    */
    private Long transferstationId;

    /**
    * 总重量
    */
    private Double wgt;

    /**
    * 总数量
    */
    private Long count;

    /**
    * 接收人
    */
    private String reciver;

    /**
    * 接收人电话
    */
    private String reciverPhone;

    /**
    * 修改人
    */
    private String recRevisor;

    /**
    * 修改时间
    */
    private Date recRevisorTime;

    /**
    * 版本号
    */
    private Long versionId;

    /**
    * 状态
    */
    private Long status;

    /**
    * 下一仓库ID 
    */
    private Long nTransferstationId;

    /**
    * 出库时间
    */
    private Date checkoutTime;

    /**
    * 创建人
    */
    private String recCreator;

    /**
    * 创建时间
    */
    private Date recCreatorTime;

    /**
    * 出门凭证
    */
    private String goOut;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public Long getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(Long transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public Long getTransferstationId() {
        return transferstationId;
    }

    public void setTransferstationId(Long transferstationId) {
        this.transferstationId = transferstationId;
    }

    public Double getWgt() {
        return wgt;
    }

    public void setWgt(Double wgt) {
        this.wgt = wgt;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getReciverPhone() {
        return reciverPhone;
    }

    public void setReciverPhone(String reciverPhone) {
        this.reciverPhone = reciverPhone;
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

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getnTransferstationId() {
        return nTransferstationId;
    }

    public void setnTransferstationId(Long nTransferstationId) {
        this.nTransferstationId = nTransferstationId;
    }

    public Date getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public String getRecCreator() {
        return recCreator;
    }

    public void setRecCreator(String recCreator) {
        this.recCreator = recCreator;
    }

    public Date getRecCreatorTime() {
        return recCreatorTime;
    }

    public void setRecCreatorTime(Date recCreatorTime) {
        this.recCreatorTime = recCreatorTime;
    }

    public String getGoOut() {
        return goOut;
    }

    public void setGoOut(String goOut) {
        this.goOut = goOut;
    }
}