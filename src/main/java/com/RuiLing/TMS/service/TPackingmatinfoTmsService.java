package com.RuiLing.TMS.service;

import com.RuiLing.TMS.entity.TPackingmatinfoTms;
import com.RuiLing.TMS.vo.TPackingmatinfoTmsVO;

import java.util.Map;

public interface TPackingmatinfoTmsService{


    void delete(String[] id);

    void insert(TPackingmatinfoTms record);

    Map<String, Object> select(TPackingmatinfoTmsVO tPackingmatinfoTmsVO);

    void update(TPackingmatinfoTms record);

}
