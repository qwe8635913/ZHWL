package com.RuiLing.TMS.service;

import com.RuiLing.TMS.entity.TCarProduct;
import com.RuiLing.TMS.vo.TCarProductVO;

import java.math.BigDecimal;
import java.util.Map;

public interface TCarProductService{


    void deleteCarProduct(Long[] id);

    void insertCarProduct(TCarProduct record);

//    int insertSelective(TCarProduct record);

//    TCarProduct selectByPrimaryKey(BigDecimal id);

//    int updateByPrimaryKeySelective(TCarProduct record);

    void updateCarProduct(TCarProduct record);

    /*根据参数查询用车需求表
    形参：TCarProductV - 参数Map
    返回值：
    */
    Map<String, Object> queryTCarProduct(TCarProductVO tCarProductVO);

}
