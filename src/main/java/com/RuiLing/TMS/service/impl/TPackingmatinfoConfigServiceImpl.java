package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.vo.PackingMatinVo;
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

import com.RuiLing.TMS.mapper.TPackingmatinfoConfigMapper;
import com.RuiLing.TMS.entity.TPackingmatinfoConfig;
import com.RuiLing.TMS.service.TPackingmatinfoConfigService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 车辆管理的实现层
 *
 * @版权所有 湖南瑞菱科技有限公司
 */
@Service
@Transactional
public class TPackingmatinfoConfigServiceImpl implements TPackingmatinfoConfigService{

    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();//用来构建数据库中唯一ID，无现实意义

    @Resource
    private TPackingmatinfoConfigMapper tPackingmatinfoConfigMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return tPackingmatinfoConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deletepackingMatin(Long[] id) {
         tPackingmatinfoConfigMapper.deletePackingmatin(id);
    }

    @Override
    public int insert(TPackingmatinfoConfig record) {
        return tPackingmatinfoConfigMapper.insert(record);
    }

    @Override
    public int insertSelective(TPackingmatinfoConfig record) {
        long id = sequenceGenerator.nextId();//用来构建数据库中唯一ID，无现实意义
        record.setId(id);
        record.setRecCreator(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));
        return tPackingmatinfoConfigMapper.insertSelective(record);
    }

    @Override
    public TPackingmatinfoConfig selectByPrimaryKey(BigDecimal id) {
        return tPackingmatinfoConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> packingMatinfoSelect(PackingMatinVo packingMatinVo) {
        Page<Object> pageVo = PageHelper.startPage(packingMatinVo.getCurrentPage(), packingMatinVo.getPageSize());
        List<LinkedHashMap<String, Object>> resultList = tPackingmatinfoConfigMapper.packingMatinfoSelect(packingMatinVo);
        return PaginationBuilder.buildResult(resultList, pageVo.getTotal(), packingMatinVo.getCurrentPage(), packingMatinVo.getPageSize());
    }

    @Override
    public int updateByPrimaryKeySelective(TPackingmatinfoConfig record) {
        record.setRecRevisor(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));
        return tPackingmatinfoConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TPackingmatinfoConfig record) {
        return tPackingmatinfoConfigMapper.updateByPrimaryKey(record);
    }

}
