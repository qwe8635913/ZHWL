package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TCarProduct;
import com.RuiLing.TMS.vo.TCarProductVO;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

@Repository
public interface TCarProductMapper {
    /**
     * 查询
     * @param tCarProductVO
     * @return 数据表
     */
    List<LinkedHashMap<String, Object>> queryTCarProduct(TCarProductVO tCarProductVO);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteCarProduct(Long[] id);

    /**
     * 新增
     * @param record
     * @return
     */
    int insertCarProduct(TCarProduct record);

    /**
     * 修改
     * @param record
     */
    void updateCarProduct(TCarProduct record);
}