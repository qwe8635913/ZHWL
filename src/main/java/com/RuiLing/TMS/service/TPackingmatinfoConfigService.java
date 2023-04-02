package com.RuiLing.TMS.service;

import java.math.BigDecimal;
import java.util.Map;

import com.RuiLing.TMS.entity.TPackingmatinfoConfig;
import com.RuiLing.TMS.vo.PackingMatinVo;

public interface TPackingmatinfoConfigService{


    int deleteByPrimaryKey(BigDecimal id);

    void deletepackingMatin(Long[] id);

    int insert(TPackingmatinfoConfig record);

    int insertSelective(TPackingmatinfoConfig record);

    TPackingmatinfoConfig selectByPrimaryKey(BigDecimal id);

    Map<String, Object> packingMatinfoSelect(PackingMatinVo packingMatinVo);

    int updateByPrimaryKeySelective(TPackingmatinfoConfig record);

    int updateByPrimaryKey(TPackingmatinfoConfig record);

}
