package com.RuiLing.TMS.controller;

import com.RuiLing.component.commons.result.ActionResult;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;
import com.RuiLing.component.commons.validator.InsertValidator;
import com.RuiLing.component.commons.validator.UpdateValidator;
import com.RuiLing.TMS.entity.TCarProduct;
import com.RuiLing.TMS.service.TCarProductService;
import com.RuiLing.TMS.vo.TCarProductVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@Api()
@RestController
@RequestMapping("/carProduct")
public class TCarProductController {
   private final Logger logger = LoggerFactory.getLogger(getClass());

   @Autowired
    private TCarProductService tCarProductService;
   /*
   * 查询用车需求表信息
   * */
   @GetMapping(path = "/queryCarProduct")
    public ListResult<Object> queryTCarProduct(TCarProductVO tCarProductVO){
       Map<String, Object> data = tCarProductService.queryTCarProduct(tCarProductVO);
       return  ResultBuilder.buildListSuccess(data);
   }
   /*
   * 新增用车需求表信息
   * */
    @PostMapping(path = "/insertCarProduct")
    public ActionResult insertTCarProduct(@Validated(InsertValidator.class) @RequestBody TCarProduct CarProduct){
        tCarProductService.insertCarProduct(CarProduct);
        return ResultBuilder.buildActionSuccess();
    }
    /*
    * 编辑用车需求表信息
    * */
    @PutMapping(path = "/updateCarProduct")
    public ActionResult updateCarProduct(@Validated(UpdateValidator.class) @RequestBody TCarProduct tCarProduct){
        tCarProductService.updateCarProduct(tCarProduct);
        return ResultBuilder.buildActionSuccess();
    }
    /*
    * 删除用车需求表信息
    * */
    @PostMapping(path = "deleteCarProduct")
    public  ActionResult deleteCarProduct(@RequestParam(name = "id", required = true) Long[] id){
        tCarProductService.deleteCarProduct(id);
        return  ResultBuilder.buildActionSuccess();
    }

}
