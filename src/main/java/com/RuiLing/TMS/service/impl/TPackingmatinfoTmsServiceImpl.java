package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.vo.TPackingmatinfoTmsVO;
import com.RuiLing.component.commons.result.PaginationBuilder;
import com.RuiLing.component.commons.utils.CurrentUserUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.RuiLing.TMS.mapper.TPackingmatinfoTmsMapper;
import com.RuiLing.TMS.entity.TPackingmatinfoTms;
import com.RuiLing.TMS.service.TPackingmatinfoTmsService;
import com.RuiLing.component.commons.utils.SequenceGenerator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class TPackingmatinfoTmsServiceImpl implements TPackingmatinfoTmsService{

    @Resource
    private TPackingmatinfoTmsMapper tPackingmatinfoTmsMapper;
    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public void delete(String[] id) {
        tPackingmatinfoTmsMapper.deletePackingmatinfoTms(id);
    }

    /**
     * 新增
     * @param record
     */
    @Override
    public void insert(TPackingmatinfoTms record) {
        record.setRecCreator(CurrentUserUtils.getOAuth2AuthenticationInfo().get("name"));
        long id = sequenceGenerator.nextId();
        record.setId(String.valueOf(id));
        tPackingmatinfoTmsMapper.insertPackingmatinfoTms(record);
    }

    /**
     * 查询
     * @param tPackingmatinfoTmsVO
     * @return 数据表
     */
    @Override
    public Map<String, Object> select(TPackingmatinfoTmsVO tPackingmatinfoTmsVO) {
        Page<Object> page = PageHelper.startPage(tPackingmatinfoTmsVO.getCurrentPage(), tPackingmatinfoTmsVO.getPageSize());
        List<LinkedHashMap<String,Object>> resultList = tPackingmatinfoTmsMapper.selectPackingmatinfoTms(tPackingmatinfoTmsVO);
        return PaginationBuilder.buildResult(resultList, page.getTotal(),tPackingmatinfoTmsVO.getCurrentPage(),tPackingmatinfoTmsVO.getPageSize());
    }

    /**
     * 修改
     * @param record
     */
    @Override
    public void update(TPackingmatinfoTms record) {
        record.setRecRevisor(CurrentUserUtils.getOAuth2AuthenticationInfo().get("name"));
        tPackingmatinfoTmsMapper.updatePackingmatinfoTms(record);
    }

}
