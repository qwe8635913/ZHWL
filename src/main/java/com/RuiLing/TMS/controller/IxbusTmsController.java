package com.RuiLing.TMS.controller;

import com.RuiLing.TMS.entity.TGpsRail;
import com.RuiLing.TMS.service.TGpsRailService;
import com.RuiLing.component.commons.utils.AjaxResult;
import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson2.JSON;
//import com.ixbusmes.framework.web.controller.BaseController;
//import com.ixbusmes.framework.web.domain.AjaxResult;
//import com.ixbusmes.project.erp.domain.Tom01;
//import com.ixbusmes.project.erp.domain.Tpcma11;
//import com.ixbusmes.project.erp.service.IOMService;
//import com.ixbusmes.project.erp.service.ITpcma11Service;
//import com.ixbusmes.project.erp.service.SendService;
//import com.ixbusmes.project.erp.vo.Cbom01VO;
//import com.ixbusmes.project.erp.vo.Cbom02VO;
//import com.ixbusmes.project.erp.vo.Cbom15VO;
//import com.ixbusmes.project.erp.vo.PurchaseBackVO;
//import com.ixbusmes.project.pdm.CallPDMService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @author 
 * @date 2022-10-11 19:32
 * @description TMS接口类
 */
@RestController
@RequestMapping("/IxbusTms")
public class IxbusTmsController  {


    @Autowired
    private  TGpsRailService tGpsRailService;
    AjaxResult ajaxResult = null;

//    @Autowired
//    private SendService sendService;

    /**
     * ixbus统一调用入口
     *
     * @param headers  头
     * @param msg      消息信心
     * @param response response
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @RequestMapping("/receive")
    public AjaxResult receive(@RequestHeader Map<String, String> headers,
                              @RequestBody String msg, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException, IOException {

        // 拿电文号
        String serviceid = headers.get("serviceid");
        // 根据电文号调用对应的方法
//        if ("OMCB02".equals(serviceid)) {
//            ajaxResult = OMCB02(msg);
//        }
//        else

        if ("OMTQI2".equals(serviceid)) {
            ajaxResult = OMCB01(msg);
        }
//            else if ("OMCB05".equals(serviceid)) {
//            ajaxResult = OMCB05(msg);
//        }

        response.addHeader("returnCode", "0");
        return ajaxResult;
    }
//    @RequestMapping("/sendCbom01")
//    public AjaxResult cbom01(@Valid @RequestBody Cbom01VO vo) {
//        Map<String, String> result = sendService.sendCbom01(vo);
//        String code = result.get("code");
//        String message = result.get("message");
//        if ("0".equals(code) && "Ixbus has received the message successfully".equals(message)){
//            return success();
//        }else{
//            return error();
//        }
//    }
//
//    @RequestMapping("/sendCbom02")
//    public AjaxResult cbom02(@Valid @RequestBody Cbom02VO vo) {
//        Map<String, String> result = sendService.sendCbom02(vo);
//        String code = result.get("code");
//        String message = result.get("message");
//        if ("0".equals(code) && "Ixbus has received the message successfully".equals(message)){
//            return success();
//        }else{
//            return error();
//        }
//    }
//
//    @RequestMapping("/sendCbom15")
//    public AjaxResult cbom15(@Valid @RequestBody Cbom15VO vo) {
//        Map<String, String> result = sendService.sendCbom15(vo);
//        String code = result.get("code");
//        String message = result.get("message");
//        if ("0".equals(code) && "Ixbus has received the message successfully".equals(message)){
//            return success();
//        }else{
//            return error();
//        }
//    }
    /**
     * 合同接收
     *
     * @param msg 入参
     * @return {@link AjaxResult} 统一返回类
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private AjaxResult OMCB01(String msg) throws InvocationTargetException, IllegalAccessException {
        Map<String, String> ixbusMessage = (Map<String, String>) JSON.parse(msg);
        String s = JSON.toJSONString(ixbusMessage);
//        Tom01 tom01 = new Tom01();
//        BeanUtils.populate(tom01, ixbusMessage);
        TGpsRail tGpsRail = new TGpsRail();
        tGpsRail.setRailDimensionality(new BigDecimal( 1));
        tGpsRail.setRailLongitude(new BigDecimal( 1));
        tGpsRail.setRailName("iXbus测试");
        tGpsRail.setRailState(new BigDecimal( 1));
        tGpsRail.setRailRadius("1");
        tGpsRail.setRailType(new BigDecimal( 1));
        tGpsRail.setRailMessage("123");


        tGpsRailService.insertgpsResult(tGpsRail);
//        ajaxResult = omService.ContractReceipt(tom01, ixbusMessage);
        return ajaxResult;
    }
//
//    /**
//     * 物料编码同步接口
//     *
//     * @param msg 入参
//     * @return {@link AjaxResult} 统一返回类
//     */
//    private AjaxResult OMCB02(String msg) throws InvocationTargetException, IllegalAccessException, IOException {
//        // json转map
//        Map<String, String> ixbusMessage = (Map<String, String>) JSON.parse(msg);
//        Tpcma11 tpcma11 = new Tpcma11();
//        BeanUtils.populate(tpcma11, ixbusMessage);
//        // 将InternalCode 改为itemId
//        String itemId = tpcma11.getItemId();
//        // 老物料编码（零件号）
//        String archiveUserId = ixbusMessage.get("archiveUserId").toString();
//        System.out.println(itemId);
//        tpcma11.setInternalCode(itemId);
//        tpcma11.setOldItemId(archiveUserId);
//        int i = tpcma11Service.insertPurchasingMaterials(tpcma11);
//        // itemId archiveUserId
//        String purchaseCode = ixbusMessage.get("itemId");
//        String materialCode = ixbusMessage.get("archiveUserId");
//        if (i != 1) {
//            AjaxResult result = callPDMService.syncCgCode(purchaseCode, materialCode);
//            if (result.isSuccess()){
//                return result;
//            }else{
//                // todo失败业务需处理
//                return result;
//            }
//        }
//        return AjaxResult.success();
//    }
//
//    /**
//     * 采购入库
//     * @param msg json串
//     * @return
//     * @throws InvocationTargetException
//     * @throws IllegalAccessException
//     */
//    private AjaxResult OMCB05(String msg) throws InvocationTargetException, IllegalAccessException {
//        System.out.println("ERP入库");
//
//        // json转map
//        Map<String, String> ixbusMessage = (Map<String, String>) JSON.parse(msg);
//        String s = JSON.toJSONString(ixbusMessage);
//        PurchaseBackVO purchaseBackVO = new PurchaseBackVO();
//        BeanUtils.populate(purchaseBackVO, ixbusMessage);
//        // todo 后续的业务处理
//        //约束条件
//        if (purchaseBackVO.getProjectNo().equals("") || purchaseBackVO.getProjectNo() == null){
//            return AjaxResult.error("工号不能为空");
//        }
//        if (purchaseBackVO.getItemId() == null || purchaseBackVO.getItemId().equals("")){
//            return AjaxResult.error("采购编码不能为空");
//        }
//        if (purchaseBackVO.getRemark() == null || purchaseBackVO.getRemark().equals("")){
//            return AjaxResult.error("remark字段不能为空");
//        }
//        if (purchaseBackVO.getPrice() == null || purchaseBackVO.getPrice().equals("")){
//            return AjaxResult.error("采购价格不能为空");
//        }
//        if (purchaseBackVO.getInternalCode() == null || purchaseBackVO.getInternalCode().equals("")){
//            return AjaxResult.error("采购唯一标识不能为空");
//        }
//        String stockNo = purchaseBackVO.getRemark();
//        String[] stockNos = stockNo.split(";");
//        stockNo = stockNos[stockNos.length-1];
//        System.out.println("1");
//        int i = tpcma11Service.insertPurchaseBackVO(stockNo,purchaseBackVO);
//        System.out.println(purchaseBackVO);
//        return AjaxResult.success();
//    }
}
