package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.vo.EnteringApplyVo;
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

import com.RuiLing.TMS.mapper.TEnteringFactoryApplyMapper;
import com.RuiLing.TMS.entity.TEnteringFactoryApply;
import com.RuiLing.TMS.service.TEnteringFactoryApplyService;
@Service
public class TEnteringFactoryApplyServiceImpl implements TEnteringFactoryApplyService{

    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();//用来构建数据库中唯一ID，无现实意义

    @Resource
    private TEnteringFactoryApplyMapper tEnteringFactoryApplyMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return tEnteringFactoryApplyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteApplyMsg(Long[] id) {
        tEnteringFactoryApplyMapper.deleteApplyMsg(id);
    }

    @Override
    public int insert(TEnteringFactoryApply record) {
        return tEnteringFactoryApplyMapper.insert(record);
    }

    @Override
    public int insertSelective(TEnteringFactoryApply record) {
        long id = sequenceGenerator.nextId();//用来构建数据库中唯一ID，无现实意义
        record.setId(id);
        record.setRecCreator(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));
        return tEnteringFactoryApplyMapper.insertSelective(record);
    }

    @Override
    public TEnteringFactoryApply selectByPrimaryKey(BigDecimal id) {
        return tEnteringFactoryApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> applyMsgSelect(EnteringApplyVo enteringApplyVo) {
        Page<Object> pageVo = PageHelper.startPage(enteringApplyVo.getCurrentPage(), enteringApplyVo.getPageSize());
        List<LinkedHashMap<String, Object>> resultList = tEnteringFactoryApplyMapper.applyMsgSelect(enteringApplyVo);
        return PaginationBuilder.buildResult(resultList, pageVo.getTotal(), enteringApplyVo.getCurrentPage(), enteringApplyVo.getPageSize());
    }

    @Override
    public int updateByPrimaryKeySelective(TEnteringFactoryApply record) {
        record.setRecRevisor(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));
        return tEnteringFactoryApplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TEnteringFactoryApply record) {
        return tEnteringFactoryApplyMapper.updateByPrimaryKey(record);
    }

}
