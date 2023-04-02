package com.RuiLing.TMS.controller;


import com.RuiLing.TMS.entity.TGpsRail;
import com.RuiLing.TMS.entity.TInterfaceHistory;
import com.RuiLing.TMS.service.TInterfaceHistoryService;
import com.RuiLing.TMS.vo.TGpsRailVO;
import com.RuiLing.TMS.vo.TInterfaceHistoryVo;
import com.RuiLing.component.commons.result.ActionResult;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;
import com.RuiLing.component.commons.validator.InsertValidator;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "履历控制层", tags = { "接口履历表" })
@RestController
@RequestMapping("/tlnterfacehistory")
public class TInterfaceHistoryContrller {

    @Autowired
    private TInterfaceHistoryService tInterfaceHistoryService;

    /**
     * 查询参数履历列表
     *
     * @param tInterfaceHistoryVo
     * @return
     */
    @GetMapping("/tlnterfacehistoryList")
    public ListResult<Object> queryHistoryList(TInterfaceHistoryVo tInterfaceHistoryVo) {//从前端接收参数@RequestBody
        Map<String, Object> HistoryList = tInterfaceHistoryService.queryRailList(tInterfaceHistoryVo);//查询全部JSP
        return ResultBuilder.buildListSuccess(HistoryList);
    }

    /**
     * 新增履历
     *
     * @param tInterfaceHistory
     * @return
     */
    @PostMapping(path = "/inserttlnterfacehistory")//@Validated校验 InsertValidator.class指定校验的类型
    public ActionResult inserttlnterfacehistory(@Validated(InsertValidator.class) @RequestBody TInterfaceHistory tInterfaceHistory) {//接收前端传递给后端的json字符串中的数据的
        tInterfaceHistoryService.insertTlnterFaceHistory(tInterfaceHistory);
        return ResultBuilder.buildActionSuccess();
    }
}
