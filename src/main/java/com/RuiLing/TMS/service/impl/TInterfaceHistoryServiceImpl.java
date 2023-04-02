package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.vo.TInterfaceHistoryVo;
import com.RuiLing.component.commons.result.PaginationBuilder;
import com.RuiLing.component.commons.utils.SequenceGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.RuiLing.TMS.mapper.TInterfaceHistoryMapper;
import com.RuiLing.TMS.entity.TInterfaceHistory;
import com.RuiLing.TMS.service.TInterfaceHistoryService;
@Service
public class TInterfaceHistoryServiceImpl implements TInterfaceHistoryService{
    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();//用来构建数据库中唯一ID，无现实意义
    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Resource
    private TInterfaceHistoryMapper tInterfaceHistoryMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return tInterfaceHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TInterfaceHistory record) {
        return tInterfaceHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(TInterfaceHistory record) {
        return tInterfaceHistoryMapper.insertSelective(record);
    }

    @Override
    public TInterfaceHistory selectByPrimaryKey(BigDecimal id) {
        return tInterfaceHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TInterfaceHistory record) {
        return tInterfaceHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TInterfaceHistory record) {
        return tInterfaceHistoryMapper.updateByPrimaryKey(record);
    }

    /**
     * 查询履历列表
     * @param tInterfaceHistoryVo
     * @return
     */
    @Override
    public Map<String, Object> queryRailList(TInterfaceHistoryVo tInterfaceHistoryVo) {
        Page<Object> page = PageHelper.startPage(tInterfaceHistoryVo.getCurrentPage(), tInterfaceHistoryVo.getPageSize());
        //从数据库查询出List类型结果集
        List<LinkedHashMap<String, Object>> RaiList = tInterfaceHistoryMapper.queryTInterfaceHistory(tInterfaceHistoryVo);
        //将结果集传进分页工具进行分页
        return PaginationBuilder.buildResult(RaiList, page.getTotal(), tInterfaceHistoryVo.getCurrentPage(), tInterfaceHistoryVo.getPageSize());

    }

    /**
     * 新增履历
     * @param tInterfaceHistory
     */
    @Override
    public void insertTlnterFaceHistory(TInterfaceHistory tInterfaceHistory) {
        long id = sequenceGenerator.nextId();//用来构建数据库中唯一ID，无现实意义
        tInterfaceHistory.setId(id);
        tInterfaceHistoryMapper.insertHistory(tInterfaceHistory);
        logger.info("GPS已新增： {}", tInterfaceHistory.getApiName());
    }

}
