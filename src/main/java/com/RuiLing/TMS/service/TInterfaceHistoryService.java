package com.RuiLing.TMS.service;

import java.math.BigDecimal;
import java.util.Map;

import com.RuiLing.TMS.entity.TInterfaceHistory;
import com.RuiLing.TMS.vo.TInterfaceHistoryVo;

public interface TInterfaceHistoryService{


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
    Map<String, Object> queryRailList(TInterfaceHistoryVo tInterfaceHistoryVo);

    /**
     * 新增履历
     * @param tInterfaceHistory
     */
    void insertTlnterFaceHistory(TInterfaceHistory tInterfaceHistory);
}
