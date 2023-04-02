package com.RuiLing.TMS.service;

import com.RuiLing.TMS.entity.TGpsRail;
import com.RuiLing.TMS.vo.TGpsRailVO;

import java.math.BigDecimal;
import java.util.Map;

public interface TGpsRailService {
    int deleteByPrimaryKey(BigDecimal railId);

    int insert(TGpsRail record);

    int insertSelective(TGpsRail record);

    TGpsRail selectByPrimaryKey(BigDecimal railId);

    int updateByPrimaryKeySelective(TGpsRail record);

    int updateByPrimaryKey(TGpsRail record);

    /**
     * 查询参数JSP列表
     *
     * @param tGpsRailVO
     * @return
     */
    Map<String, Object> queryRailList(TGpsRailVO tGpsRailVO);

    /**
     * 新增gps
     *
     * @param tGpsRail
     */
    void insertgpsResult(TGpsRail tGpsRail);

    /**
     * 编辑gps
     *
     * @param tGpsRail
     */
    void updategpsResult(TGpsRail tGpsRail);

    /**
     * 根据ID删除GPS
     * @param railId
     */
    void deletegpsResult(Long[] railId);
}

