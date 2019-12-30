package com.ruoyi.api.controller.village;

import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.village.domain.Energyshow;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.village.service.IEnergyshowService;
/**
 * 能源管理终端采集信息 控制层
 *
 * @author 薛莎莎
 * @date 2019-11-24
 */
@RestController
@RequestMapping("/api/energyshow")
@CrossOrigin
@Api(value = "能源管理终端采集信息")
public class EnergyshowCount extends BaseController{
    @Autowired
    private IEnergyshowService energyshowService;
    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询能源管理终端采集信息列表")
    public RongApiRes list(Energyshow energyshow)
    {
        return RongApiService.get_list(energyshowService.selectEnergyshowList(energyshow));
    }
}
