package com.RuiLing.TMS.service.impl;

import com.RuiLing.TMS.entity.TCarProduct;
import com.RuiLing.TMS.mapper.TCarProductMapper;
import com.RuiLing.TMS.vo.TCarProductVO;
import com.RuiLing.component.commons.result.PaginationBuilder;
import com.RuiLing.component.commons.utils.CurrentUserUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.RuiLing.TMS.mapper.TCarProductMapper;
import com.RuiLing.TMS.entity.TCarProduct;
import com.RuiLing.TMS.service.TCarProductService;

import com.RuiLing.component.commons.utils.SequenceGenerator;
@Service
public class TCarProductServiceImpl implements TCarProductService{
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private static final SequenceGenerator sequenceGenerator = new SequenceGenerator();//用来构建数据库中唯一ID，无现实意义
    @Autowired
    private TCarProductMapper tCarProductMapper;

    /*
    * 根据参数查询用车需求列表
    * */
    public Map<String, Object> queryTCarProduct(TCarProductVO tCarProductVO){
        Page<Object> page = PageHelper.startPage(tCarProductVO.getCurrentPage(), tCarProductVO.getPageSize());
        List<LinkedHashMap<String,Object>> resultList = tCarProductMapper.queryTCarProduct(tCarProductVO);
        return PaginationBuilder.buildResult(resultList, page.getTotal(),tCarProductVO.getCurrentPage(),tCarProductVO.getPageSize());
    }

    /**
     * 删除用车需求
     * @param id
     */

    @Override
    public void deleteCarProduct(Long[] id) {
        tCarProductMapper.deleteCarProduct(id);
    }
    /**
     * 新增用车
     * @param
     * @return
     */
    @Override
    public void insertCarProduct(TCarProduct carProduct) {
        long id = sequenceGenerator.nextId();
        carProduct.setId(id);
        carProduct.setRecCreator(CurrentUserUtils.getOAuth2AuthenticationDetailsInfo().get("name"));
        tCarProductMapper.insertCarProduct(carProduct);
    }

    @Override
    public void updateCarProduct(TCarProduct carProduct) {
        carProduct.setRecRevisor(CurrentUserUtils.getOAuth2AuthenticationInfo().get("name"));
        tCarProductMapper.updateCarProduct(carProduct);
    }

}
