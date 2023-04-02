package com.RuiLing.TMS.mapper;

import com.RuiLing.TMS.entity.TPackingmatinfoTms;
import com.RuiLing.TMS.vo.TPackingmatinfoTmsVO;

import java.util.LinkedHashMap;
import java.util.List;

public interface TPackingmatinfoTmsMapper {
    /**
     * 删除
     * @param id
     */
    void deletePackingmatinfoTms(String[] id);

    /**
     * 新增
     * @param record
     */
    void insertPackingmatinfoTms(TPackingmatinfoTms record);

    /**
     * 修改
     * @param record
     */
    void updatePackingmatinfoTms(TPackingmatinfoTms record);

    /**
     * 查询
     * @param tPackingmatinfoTms
     * @return 数据表
     */
    List<LinkedHashMap<String, Object>> selectPackingmatinfoTms(TPackingmatinfoTmsVO tPackingmatinfoTms);
}