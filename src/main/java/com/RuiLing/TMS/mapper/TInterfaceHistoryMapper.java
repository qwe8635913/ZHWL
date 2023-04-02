package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TInterfaceHistory;
import com.RuiLing.TMS.vo.TInterfaceHistoryVo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface TInterfaceHistoryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(TInterfaceHistory record);

    int insertSelective(TInterfaceHistory record);

    TInterfaceHistory selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(TInterfaceHistory record);

    int updateByPrimaryKey(TInterfaceHistory record);

    /**
     * 查询履历列表
     * @param tInterfaceHistoryVo
     * @return
     */
    List<LinkedHashMap<String, Object>> queryTInterfaceHistory(TInterfaceHistoryVo tInterfaceHistoryVo);

    /**
     * 新增履历
     * @param tInterfaceHistory
     */
    void insertHistory(TInterfaceHistory tInterfaceHistory);
}