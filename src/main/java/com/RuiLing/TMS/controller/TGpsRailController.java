package com.RuiLing.TMS.controller;


import com.RuiLing.TMS.entity.TGpsRail;
import com.RuiLing.TMS.service.TGpsRailService;
import com.RuiLing.TMS.vo.TGpsRailVO;
import com.RuiLing.component.commons.result.ActionResult;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;
import com.RuiLing.component.commons.validator.InsertValidator;
import com.RuiLing.component.commons.validator.UpdateValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.Map;


@RestController
@RequestMapping("/gps_rail")
@Slf4j
public class TGpsRailController {
    @Autowired
    private TGpsRailService tGpsRailService;

    /**
     * 查询参数GPS列表
     *
     * @param tGpsRailVO
     * @return
     */
    @GetMapping("/gps_railList")
    public ListResult<Object> queryRailList( TGpsRailVO tGpsRailVO) {//从前端接收参数@RequestBody
        Map<String, Object> railList = tGpsRailService.queryRailList(tGpsRailVO);//查询全部JSP
        return ResultBuilder.buildListSuccess(railList);
    }

    /**
     * 新增GPS
     *
     * @param tGpsRail
     * @return
     */
    @PostMapping(path = "/insertgpsResult")//@Validated校验 InsertValidator.class指定校验的类型
    public ActionResult insertgpsresult(@Validated(InsertValidator.class) @RequestBody TGpsRail tGpsRail) {//接收前端传递给后端的json字符串中的数据的
        tGpsRailService.insertgpsResult(tGpsRail);
        return ResultBuilder.buildActionSuccess();
    }

    /**
     * 编辑GPS
     *
     * @param tGpsRail
     * @return
     */
    @PutMapping(path = "/updatgpsResult")
    public ActionResult updategpsResult(@Validated(UpdateValidator.class) @RequestBody TGpsRail tGpsRail) {
        tGpsRailService.updategpsResult(tGpsRail);
        return ResultBuilder.buildActionSuccess();
    }

    /**
     * 根据ID删除GPS
     *
     * @param railId
     * @return
     */
    @PostMapping(path = "/deletegpsResult")
//@RequestParam name="XX"告诉框架如何从前端请求的传递的参数赋值到对应的方法的形参 ，required = true前端必须传这个变量
    public ActionResult deletegpsResult(@RequestParam(name = "railId", required = true) Long[] railId) {
        tGpsRailService.deletegpsResult(railId);
        return ResultBuilder.buildActionSuccess();
    }
}
