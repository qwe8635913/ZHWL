package com.RuiLing.TMS.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TShipTrajectory {
    private Long id;

    /**
    * 船名
    */
    private String name;

    /**
    * 船舶ID
    */
    private BigDecimal shipid;

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
    * 经度
    */
    private BigDecimal lon;

    /**
    * 纬度
    */
    private BigDecimal lat;

    /**
    * 速度
    */
    private BigDecimal sog;

    /**
    * 航向
    */
    private String cog;

    /**
     * 最后时间
     */
    private Date lastTime;

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getShipid() {
        return shipid;
    }

    public void setShipid(BigDecimal shipid) {
        this.shipid = shipid;
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

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getSog() {
        return sog;
    }

    public void setSog(BigDecimal sog) {
        this.sog = sog;
    }

    public String getCog() {
        return cog;
    }

    public void setCog(String cog) {
        this.cog = cog;
    }
}