package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.service.TGpsRailService;
import com.RuiLing.TMS.vo.TGpsRailVO;
import com.RuiLing.component.commons.result.PaginationBuilder;
import com.RuiLing.component.commons.utils.CurrentUserUtils;
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

import com.RuiLing.TMS.mapper.TGpsRailMapper;
import com.RuiLing.TMS.entity.TGpsRail;


@Service
public class TGpsRailServiceImpl implements TGpsRailService {

    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();//用来构建数据库中唯一ID，无现实意义
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private TGpsRailMapper tGpsRailMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal railId) {
        return tGpsRailMapper.deleteByPrimaryKey(railId);
    }

    @Override
    public int insert(TGpsRail record) {
        return tGpsRailMapper.insert(record);
    }

    @Override
    public int insertSelective(TGpsRail record) {
        return tGpsRailMapper.insertSelective(record);
    }

    @Override
    public TGpsRail selectByPrimaryKey(BigDecimal railId) {
        return tGpsRailMapper.selectByPrimaryKey(railId);
    }

    @Override
    public int updateByPrimaryKeySelective(TGpsRail record) {
        return tGpsRailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TGpsRail record) {
        return tGpsRailMapper.updateByPrimaryKey(record);
    }

    /**
     * 查询参数JSP列表
     *
     * @param tGpsRailVO
     * @return
     */
    @Override
    public Map<String, Object> queryRailList(TGpsRailVO tGpsRailVO) {
        Page<Object> page = PageHelper.startPage(tGpsRailVO.getCurrentPage(), tGpsRailVO.getPageSize());
        //从数据库查询出List类型结果集
        List<LinkedHashMap<String, Object>> RaiList = tGpsRailMapper.queryGpsRail(tGpsRailVO);
        //将结果集传进分页工具进行分页
        return PaginationBuilder.buildResult(RaiList, page.getTotal(), tGpsRailVO.getCurrentPage(), tGpsRailVO.getPageSize());
    }

    /**
     * 新增gps
     *
     * @param tGpsRail
     */
    @Override
    public void insertgpsResult(TGpsRail tGpsRail) {
        long id = sequenceGenerator.nextId();//用来构建数据库中唯一ID，无现实意义
        tGpsRail.setRailId(id);
//        tGpsRailVO.set(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));//获取当前用户的名字
        tGpsRailMapper.insertGpsResult(tGpsRail);

        logger.info("GPS已新增： {}", tGpsRail.getRailName());
    }

    /**
     * 编辑GPS
     *
     * @param tGpsRail
     */
    @Override
    public void updategpsResult(TGpsRail tGpsRail) {

        tGpsRailMapper.updateGpsRail(tGpsRail);
        logger.info("GPS已编辑： {}", tGpsRail.getRailName());
    }

    /**
     * 根据ID删除
     * @param railId
     */
    @Override
    public void deletegpsResult(Long[] railId) {
        tGpsRailMapper.deleteGpsRail(railId);
    }

}
