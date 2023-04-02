package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.vo.EnteringApplyVo;
import com.RuiLing.TMS.vo.ShipTrajectoryVo;
import com.RuiLing.component.commons.result.PaginationBuilder;
import com.RuiLing.component.commons.utils.CurrentUserUtils;
import com.RuiLing.component.commons.utils.SequenceGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.RuiLing.TMS.entity.TShipTrajectory;
import com.RuiLing.TMS.mapper.TShipTrajectoryMapper;
import com.RuiLing.TMS.service.TShipTrajectoryService;
@Service
public class TShipTrajectoryServiceImpl implements TShipTrajectoryService{

    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();//用来构建数据库中唯一ID，无现实意义

    @Resource
    private TShipTrajectoryMapper tShipTrajectoryMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return tShipTrajectoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TShipTrajectory record) {
        return tShipTrajectoryMapper.insert(record);
    }

    @Override
    public int insertSelective(TShipTrajectory record) {
        long id = sequenceGenerator.nextId();//用来构建数据库中唯一ID，无现实意义
        record.setId(id);
        record.setRecCreator(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));
        return tShipTrajectoryMapper.insertSelective(record);
    }

    @Override
    public Map<String, Object> shipTrajectorySelect(ShipTrajectoryVo shipTrajectoryVo) {
        Page<Object> pageVo = PageHelper.startPage(shipTrajectoryVo.getCurrentPage(), shipTrajectoryVo.getPageSize());
        List<LinkedHashMap<String, Object>> resultList = tShipTrajectoryMapper.shipTrajectorySelect(shipTrajectoryVo);
        return PaginationBuilder.buildResult(resultList, pageVo.getTotal(),shipTrajectoryVo.getCurrentPage(), shipTrajectoryVo.getPageSize());
    }

    @Override
    public TShipTrajectory selectByPrimaryKey(BigDecimal id) {
        return tShipTrajectoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TShipTrajectory record) {
        return tShipTrajectoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TShipTrajectory record) {
        return tShipTrajectoryMapper.updateByPrimaryKey(record);
    }

}
