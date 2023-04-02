package com.RuiLing.TMS.service;

import java.math.BigDecimal;
import java.util.Map;

import com.RuiLing.TMS.entity.TShipTrajectory;
import com.RuiLing.TMS.vo.EnteringApplyVo;
import com.RuiLing.TMS.vo.ShipTrajectoryVo;

public interface TShipTrajectoryService{


    int deleteByPrimaryKey(BigDecimal id);

    int insert(TShipTrajectory record);

    int insertSelective(TShipTrajectory record);

    Map<String, Object> shipTrajectorySelect(ShipTrajectoryVo shipTrajectoryVo);

    TShipTrajectory selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(TShipTrajectory record);

    int updateByPrimaryKey(TShipTrajectory record);

}
