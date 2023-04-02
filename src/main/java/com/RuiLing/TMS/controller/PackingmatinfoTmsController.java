package com.RuiLing.TMS.controller;
import com.RuiLing.component.commons.result.ActionResult;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;
import com.RuiLing.component.commons.validator.InsertValidator;
import com.RuiLing.component.commons.validator.UpdateValidator;
import com.RuiLing.TMS.entity.TPackingmatinfoTms;
import com.RuiLing.TMS.service.TPackingmatinfoTmsService;
import com.RuiLing.TMS.vo.TPackingmatinfoTmsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

@Api()
@RestController
@RequestMapping("/packingmatinfoTms")
public class PackingmatinfoTmsController {

    @Autowired
    private  TPackingmatinfoTmsService tPackingmatinfoTmsService;

    /**
     * 查询
     * @param tPackingmatinfoTmsVO
     * @return 数据表
     */
    @GetMapping(path = "/select")
    public ListResult<Object> select(TPackingmatinfoTmsVO tPackingmatinfoTmsVO){
        Map<String, Object> data = tPackingmatinfoTmsService.select(tPackingmatinfoTmsVO);
        return ResultBuilder.buildListSuccess(data);
    }

    /**
     * 新增
     * @param tPackingmatinfoTms
     * @return
     */
    @PostMapping(path = "/insert")
    public ActionResult insert(@Validated(InsertValidator.class) @RequestBody TPackingmatinfoTms tPackingmatinfoTms){
        tPackingmatinfoTmsService.insert(tPackingmatinfoTms);
        return ResultBuilder.buildActionSuccess();
    }

    /**
     * 修改
     * @param tPackingmatinfoTms
     * @return
     */
    @PutMapping(path = "/update")
    public ActionResult update(@Validated(UpdateValidator.class) @RequestBody TPackingmatinfoTms tPackingmatinfoTms){
        tPackingmatinfoTmsService.update(tPackingmatinfoTms);
        return ResultBuilder.buildActionSuccess();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping(path = "/delete")
    public ActionResult delete(@RequestParam(name = "id", required = true) String[] id){
        tPackingmatinfoTmsService.delete(id);
        return ResultBuilder.buildActionSuccess();
    }
}
