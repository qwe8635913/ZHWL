package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TEnteringFactoryApply;
import com.RuiLing.TMS.vo.EnteringApplyVo;
import com.RuiLing.TMS.vo.PackingMatinVo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface TEnteringFactoryApplyMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int deleteApplyMsg(Long[] id);

    int insert(TEnteringFactoryApply record);

    int insertSelective(TEnteringFactoryApply record);

    TEnteringFactoryApply selectByPrimaryKey(BigDecimal id);

    List<LinkedHashMap<String, Object>> applyMsgSelect(EnteringApplyVo record);

    int updateByPrimaryKeySelective(TEnteringFactoryApply record);

    int updateByPrimaryKey(TEnteringFactoryApply record);
}