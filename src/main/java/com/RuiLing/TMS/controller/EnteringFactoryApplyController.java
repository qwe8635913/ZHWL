package com.RuiLing.TMS.controller;

import com.RuiLing.TMS.entity.TEnteringFactoryApply;
import com.RuiLing.TMS.service.TEnteringFactoryApplyService;
import com.RuiLing.TMS.vo.EnteringApplyVo;
import com.RuiLing.component.commons.result.ActionResult;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;
import com.RuiLing.component.commons.validator.InsertValidator;
import com.RuiLing.component.commons.validator.UpdateValidator;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 船舶到厂申报的控制层
 *
 * @版权所有 湖南瑞菱科技有限公司
 */
@Api(value = "船舶到厂申报的控制层", tags = { "船舶到厂申报" })
@RestController
@RequestMapping("/enteringapply")
public class EnteringFactoryApplyController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TEnteringFactoryApplyService tEnteringFactoryApplyService;

    /**
     * 查询船舶到厂申报信息
     *
     * @param enteringApplyVo 自定义申报信息
     * @return
     */
    @GetMapping(path = "/queryApplyMsg")
    public ListResult<Object> queryApplyMsg(EnteringApplyVo enteringApplyVo) {
        Map<String, Object> data= tEnteringFactoryApplyService.applyMsgSelect(enteringApplyVo);
        return ResultBuilder.buildListSuccess(data);
    }

    /**
     * 新增船舶到厂申报信息
     *
     * @param tEnteringFactoryApply 船舶到厂申报信息
     * @return
     */
    @PostMapping(path = "/insertApplyMsg")
    public ActionResult insertSelective(@Validated(InsertValidator.class) @RequestBody TEnteringFactoryApply tEnteringFactoryApply){
        tEnteringFactoryApplyService.insertSelective(tEnteringFactoryApply);
        return ResultBuilder.buildActionSuccess();
    }

    /**
     * 删除船舶到厂申报信息
     *
     * @param id 申报信息ID
     * @return
     */
    @PostMapping(path = "/deleteApplyMsg")
    public ActionResult deletedeleteApplyMsgById(Long[] id) {
        tEnteringFactoryApplyService.deleteApplyMsg(id);
        return ResultBuilder.buildActionSuccess();
    }

    /**
     * 编辑船舶到厂申报信息
     *
     * @param tEnteringFactoryApply 自定义船舶到厂申报信息
     * @return
     */
    @PutMapping(path = "/updateApplyMsg")
    public ActionResult updateApplyMsg(@Validated(UpdateValidator.class) @RequestBody TEnteringFactoryApply tEnteringFactoryApply){
        tEnteringFactoryApplyService.updateByPrimaryKeySelective(tEnteringFactoryApply);
        return ResultBuilder.buildActionSuccess();
    }
}
