package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TPackingmatinfoConfig;
import com.RuiLing.TMS.vo.PackingMatinVo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface TPackingmatinfoConfigMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int deletePackingmatin(Long[] id);

    int insert(TPackingmatinfoConfig record);

    int insertSelective(TPackingmatinfoConfig record);

    TPackingmatinfoConfig selectByPrimaryKey(BigDecimal id);

    List<LinkedHashMap<String, Object>> packingMatinfoSelect(PackingMatinVo record);

    int updateByPrimaryKeySelective(TPackingmatinfoConfig record);

    int updateByPrimaryKey(TPackingmatinfoConfig record);
}