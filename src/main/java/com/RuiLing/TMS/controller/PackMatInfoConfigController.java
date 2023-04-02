package com.RuiLing.TMS.controller;

import com.RuiLing.TMS.entity.TPackingmatinfoConfig;
import com.RuiLing.TMS.service.TPackingmatinfoConfigService;
import com.RuiLing.TMS.vo.PackingMatinVo;
import com.RuiLing.component.commons.result.ActionResult;
import com.RuiLing.component.commons.result.ListResult;
import com.RuiLing.component.commons.result.ResultBuilder;


import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 厂区信息的控制层
 *
 * @版权所有 湖南瑞菱科技有限公司
 */
@Api(value = "厂区信息的控制层", tags = { "厂区信息" })
@RestController
@RequestMapping("/packmatinfoconfig")
public class PackMatInfoConfigController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private TPackingmatinfoConfigService tPackingmatinfoConfigService;


	/**
	 * 查询车辆信息
	 *
	 * @param packingMatinVo 自定义车辆信息
	 * @return
	 */
	@GetMapping(path = "/queryPackingMatin")
	public ListResult<Object> queryPackingMatin(PackingMatinVo packingMatinVo) {
		Map<String, Object> data= tPackingmatinfoConfigService.packingMatinfoSelect(packingMatinVo);
		return ResultBuilder.buildListSuccess(data);
	}

	/**
	 * 新增车辆信息
	 *
	 * @param tPackingmatinfoConfig 自定义车辆信息
	 * @return
	 */
	@PostMapping(path = "/insertPackingMatin")
	public ActionResult insertSelective(TPackingmatinfoConfig tPackingmatinfoConfig){
		tPackingmatinfoConfigService.insertSelective(tPackingmatinfoConfig);
		return ResultBuilder.buildActionSuccess();

	}

	/**
	 * 删除车辆信息
	 *
	 * @param id 自定义车辆ID
	 * @return
	 */
	@PostMapping(path = "/deletePackingMatin")
	public ActionResult deletePackingMatinById(Long[] id) {
		tPackingmatinfoConfigService.deletepackingMatin(id);
		return ResultBuilder.buildActionSuccess();
	}

	/**
	 * 编辑车辆信息
	 *
	 * @param tPackingmatinfoConfig 自定义车辆信息
	 * @return
	 */
	@PutMapping(path = "/updatePackingMatin")
	public ActionResult updatePackingMatinById(TPackingmatinfoConfig tPackingmatinfoConfig){
		tPackingmatinfoConfigService.updateByPrimaryKeySelective(tPackingmatinfoConfig);
		return ResultBuilder.buildActionSuccess();
	}


}
