package com.RuiLing.TMS.service;

import java.math.BigDecimal;
import java.util.Map;

import com.RuiLing.TMS.entity.TEnteringFactoryApply;
import com.RuiLing.TMS.vo.EnteringApplyVo;

public interface TEnteringFactoryApplyService{


    int deleteByPrimaryKey(BigDecimal id);

    void deleteApplyMsg(Long[] id);

    int insert(TEnteringFactoryApply record);

    int insertSelective(TEnteringFactoryApply record);

    TEnteringFactoryApply selectByPrimaryKey(BigDecimal id);

    Map<String, Object> applyMsgSelect(EnteringApplyVo enteringApplyVo);

    int updateByPrimaryKeySelective(TEnteringFactoryApply record);

    int updateByPrimaryKey(TEnteringFactoryApply record);

}
