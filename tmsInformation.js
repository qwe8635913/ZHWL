import request from '@/utils/request'

export function queryPackingMatin(query) {
  return request({
    url: '/api/TMS/packmatinfoconfig/queryPackingMatin',
    method: 'get',
    params: query
  })
}

export function insertPackingMatin(query) {
  return request({
    url: '/api/TMS/packmatinfoconfig/insertPackingMatin',
    method: 'post',
    query
  })
}
export function updatePackingMatin(query) {
  return request({
    url: '/api/TMS/packmatinfoconfig/updatePackingMatin',
    method: 'put',
    query
  })
}
export function deletePackingMatin(data) {
  return request({
    url: '/api/TMS/packmatinfoconfig/deletePackingMatin',
    method: 'post',
    params: {
      id: data
    }
  })
}

export function queryApplyMsg(query) {
  return request({
    url: '/api/TMS/enteringapply/queryApplyMsg',
    method: 'get',
    params: query
  })
}

export function deleteApplyMsg(data) {
  return request({
    url: '/api/TMS/enteringapply/deleteApplyMsg',
    method: 'post',
    params: {
      id: data
    }
  })
}
export function getShipTrajectory(query) {
  return request({
    url: '/api/TMS/shiptrajectory/getShipTrajectory',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】列表
export function queryGpsRail(query) {
  return request({
    url: '/api/TMS/gps_rail/gps_railList',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】列表
export function tlnterfacehistoryList(query) {
  return request({
    url: '/api/TMS/tlnterfacehistory/tlnterfacehistoryList',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getRail(railId) {
  return request({
    url: '/api/TMS/gps_rail/gps_railList/' + railId,
    method: 'get'
  })
}

// 查询【请填写功能名称】详细
export function getShip(railId) {
  return request({
    url: '/api/TMS/enteringapply/queryApplyMsg/' + railId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function insertGpsRail(data) {
  return request({
    url: '/api/TMS/gps_rail/insertgpsResult',
    method: 'post',
    data: data
  })
}

// 新增【请填写功能名称】
export function insertApplyMsg(data) {
  return request({
    url: '/api/TMS/enteringapply/insertApplyMsg',
    method: 'post',
    data: data
  })
}

// 新增【请填写功能名称】
export function inserttlnterfacehistory(data) {
  return request({
    url: '/api/TMS/tlnterfacehistory/inserttlnterfacehistory',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateGpsRail(data) {
  return request({
    url: '/api/TMS/gps_rail/updatgpsResult',
    method: 'put',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateApplyMsg(data) {
  return request({
    url: '/api/TMS/enteringapply/updateApplyMsg',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function deleteGpsRail(data) {
  return request({
    url: '/api/TMS/gps_rail/deletegpsResult',
    method: 'post',
    params: {
      railId: data
    }
  })
}

export function insertCarProduct(data) {
  return request({
    url: '/api/TMS/carProduct/insertCarProduct',
    method: 'post',
    data
  })
}
export function deleteCarProduct(data) {
  return request({
    url: '/api/TMS/carProduct/deleteCarProduct',
    method: 'post',
    params: {
      id: data
    }
  })
}
export function updateCarProduct(data) {
  return request({
    url: '/api/TMS/carProduct/updateCarProduct',
    method: 'put',
    data
  })
}
export function queryCarProduct(data) {
  return request({
    url: '/api/TMS/carProduct/queryCarProduct',
    method: 'get',
    params: data
  })
}
export function insertPackingmatinfoTms(data) {
  return request({
    url: '/api/TMS/packingmatinfoTms/insert',
    method: 'post',
    data
  })
}

export function deletePackingmatinfoTms(data) {
  return request({
    url: '/api/TMS/packingmatinfoTms/delete',
    method: 'post',
    params: {
      id: data
    }
  })
}
export function updatePackingmatinfoTms(data) {
  return request({
    url: '/api/TMS/packingmatinfoTms/update',
    method: 'put',
    data
  })
}
export function selectPackingmatinfoTms(data) {
  return request({
    url: '/api/TMS/packingmatinfoTms/select',
    method: 'get',
    params: data
  })
}
// demo
// export function getCarno() {
//   return request({
//     url: '/api/guangZhouBoat/packingMatInfo/getCarno',
//     method: 'get'
//   })
// }
//
// export function queryCurrentUser(query) {
//   return request({
//     url: '/api/guangZhouBoat/transfercode/queryCurrentUser',
//     method: 'get',
//     params: query
//   })
// }
//
// export function importProductPlan(data) {
//   return request({
//     url: '/api/guangZhouBoat/productPlan/importData',
//     method: 'post',
//     data
//   })
// }
// export function exportProductPlan(data) {
//   return request({
//     url: '/api/guangZhouBoat/productPlan/exportProductPlan',
//     method: 'post',
//     responseType: 'blob',
//     data
//   })
// }
//
// export function deleteProductPlan(data) {
//   return request({
//     url: '/api/guangZhouBoat/productPlan/deleteProductPlan',
//     method: 'post',
//     params: {
//       id: data
//     }
//   })
// }
//
//
// // 新增中转站
// export function addTransferCode(data) {
//   return request({
//     url: '/api/guangZhouBoat/transfercode/addTransferCode',
//     method: 'post',
//     data
//   })
// }
//
// // 编辑中转站
// export function updateTransferCode(data) {
//   return request({
//     url: '/api/guangZhouBoat/transfercode/updateTransferCode',
//     method: 'put',
//     data
//   })
// }

