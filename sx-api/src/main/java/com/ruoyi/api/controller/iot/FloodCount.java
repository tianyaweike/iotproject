package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.Floodbytl;
import com.ruoyi.iot.service.FloodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author 饶泽敏 teavamc
 * @Description:山洪预警 - 统计计数类接口
 * @ClassName FloodCount
 * @date 2019/3/10 13:35
 **/
@RestController
@RequestMapping("/api/flood")
@CrossOrigin
@Api(value = "山洪预警 - 统计计数类接口")
public class FloodCount {

    @Autowired
    private FloodService flooodService;

    /**
     * 按照时间顺序返回前二十条
     * @author 饶泽敏 teavamc
     * @date 2019/12/30
     * @param []
     * @return com.ruoyi.api.domain.RongApiRes
     */
    @CrossOrigin
    @PostMapping("/commentCount")
    @ResponseBody
    @ApiOperation(value = "按照时间顺序返回前二十条")
    public RongApiRes commentCount(String rid){
        return RongApiService.get_list(flooodService.selectFloodListLimit(rid));
    }

    /**
     * 统计所有山洪数据
     * @author 饶泽敏 teavamc
     * @date 2019/12/30
     * @param []
     * @return com.ruoyi.api.domain.Flood
     */
    @CrossOrigin
    @GetMapping("/countall")
    @ApiOperation(value = "统计所有山洪数据")
    public RongApiRes countall(String rid){
        return RongApiService.get_bean(flooodService.countall(rid));
    }

    @CrossOrigin
    @GetMapping("/envbytl")
    @ApiOperation(value = "根据时间和查询条数统计山洪数据")
    public RongApiRes envbytl(Floodbytl floodbytl){
        return RongApiService.get_list(flooodService.selectFloodListbytl(floodbytl));
    }

}
