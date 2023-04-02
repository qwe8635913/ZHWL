package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TShipTrajectory;
import com.RuiLing.TMS.vo.PackingMatinVo;
import com.RuiLing.TMS.vo.ShipTrajectoryVo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface TShipTrajectoryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(TShipTrajectory record);

    int insertSelective(TShipTrajectory record);

    TShipTrajectory selectByPrimaryKey(BigDecimal id);

    List<LinkedHashMap<String, Object>> shipTrajectorySelect(ShipTrajectoryVo record);

    int updateByPrimaryKeySelective(TShipTrajectory record);

    int updateByPrimaryKey(TShipTrajectory record);
}