package com.RuiLing.TMS.controller;

import com.RuiLing.TMS.entity.TShipTrajectory;
import com.RuiLing.TMS.service.TShipTrajectoryService;
import com.RuiLing.TMS.vo.ShipTrajectoryVo;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;
//import com.RuiLing.component.commons.utils.ShipDemoMain;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 船舶轨迹查询的控制层
 *
 * @版权所有 湖南瑞菱科技有限公司
 */
@Api(value = "船舶轨迹查询的控制层", tags = { "船舶轨迹查询" })
@RestController
@RequestMapping("/shiptrajectory")
public class ShipTrajectoryController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    TShipTrajectoryService tshipTrajectoryService;

    @PostMapping(path = "/queryShipTrajectory")//@RequestParam name="XX"告诉框架如何从前端请求的传递的参数赋值到对应的方法的形参 ，required = true前端必须传这个变量
    public JSONObject getMapPoint(String carNo) {
        //开始查询轨迹
//        String s = ShipDemoMain.transTimeManage(carNo);
        String s = "";
        JSONObject parse = JSONObject.parseObject(s);
        TShipTrajectory tShipTrajectory = new TShipTrajectory();
        tshipTrajectoryService.insertSelective(tShipTrajectory);

        logger.error(s);
        return parse;
    }

    @GetMapping(path = "/getShipTrajectory")//@RequestParam name="XX"告诉框架如何从前端请求的传递的参数赋值到对应的方法的形参 ，required = true前端必须传这个变量
    public ListResult<Object> queryPackingMatin(ShipTrajectoryVo shipTrajectoryVo) {
        Map<String, Object> data= tshipTrajectoryService.shipTrajectorySelect(shipTrajectoryVo);
        return ResultBuilder.buildListSuccess(data);
    }
}
