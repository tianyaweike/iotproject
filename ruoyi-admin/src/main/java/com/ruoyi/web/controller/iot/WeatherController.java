package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Weather;
import com.ruoyi.iot.service.WeatherService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/meteorinfo")
public class WeatherController extends BaseController {

    private String prefix = "iot/meteorinfo";

    @Autowired
    private WeatherService WeatherService;

    @RequiresPermissions("iot:meteorinfo:view")
    @GetMapping()
    public String Weather(){
        return prefix+"/weather";
    }

    /**
     * Weather列表
     * @param weather
     * @return
     */
    //@RequiresPermissions("iot:meteorinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Weather weather){
        startPage();
        List<Weather> list = WeatherService.selectWeatherList(weather);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Weather信息
     */
    @RequiresPermissions("iot:meteorinfo:add")
    @Log(title = "Weather信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Weather weather)
    {
        return toAjax(WeatherService.insertweather(weather));
    }
    /**
     * 修改Weather信息
     */
    @GetMapping("/edit/{weather_id}")
    public String edit(@PathVariable("weather_id") String weather_id, ModelMap mmap)
    {
        Weather weather = WeatherService.selectByweather_id(weather_id);
        mmap.put("weather", weather);
        return prefix + "/edit";
    }
    /**
     * 修改保存Weather信息
     */
    @RequiresPermissions("iot:meteorinfo:edit")
    @Log(title = "Weather信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Weather weather)
    {
        return toAjax(WeatherService.updateWeather(weather));
    }
    /**
     * 删除Weather信息
     */
    @RequiresPermissions("iot:meteorinfo:remove")
    @Log(title = "删除Weather信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{weather_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("weather_id") String weather_id)
    {
        System.out.println("*******"+weather_id);
        return toAjax(WeatherService.deleteWeatherByids(weather_id));
    }
}