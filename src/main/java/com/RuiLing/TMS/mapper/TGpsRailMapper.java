package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TGpsRail;
import com.RuiLing.TMS.vo.TGpsRailVO;


import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface TGpsRailMapper {
    int deleteByPrimaryKey(BigDecimal railId);

    int insert(TGpsRail record);

    int insertSelective(TGpsRail record);

    TGpsRail selectByPrimaryKey(BigDecimal railId);

    int updateByPrimaryKeySelective(TGpsRail record);

    int updateByPrimaryKey(TGpsRail record);

    /**
     * 查询jsp列表
     *
     * @param tGpsRailVO
     * @return
     */
    List<LinkedHashMap<String, Object>> queryGpsRail(TGpsRailVO tGpsRailVO);

    /**
     * 新增GPS
     *
     * @param tGpsRailVO
     */
    void insertGpsResult(TGpsRail tGpsRailVO);

    /**
     * 编辑GPS
     *
     * @param tGpsRailVO
     */
    void updateGpsRail(TGpsRail tGpsRailVO);

    /**
     * 根据ID删除
     * @param railId
     */
    void deleteGpsRail(Long[] railId);
}