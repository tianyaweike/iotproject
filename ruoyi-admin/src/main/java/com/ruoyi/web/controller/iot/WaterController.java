package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Water;
import com.ruoyi.iot.service.WaterService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/waterinfo")
public class WaterController extends BaseController {

    private String prefix = "iot/waterinfo";

    @Autowired
    private WaterService WaterService;

    @RequiresPermissions("iot:waterinfo:view")
    @GetMapping()
    public String Water(){
        return prefix+"/water";
    }

    /**
     * WATER列表
     * @param water
     * @return
     */
    //@RequiresPermissions("iot:waterinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WATER water){
        startPage();
        List<Water> list = WaterService.selectWaterList(water);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增WATER信息
     */
    @RequiresPermissions("iot:waterinfo:add")
    @Log(title = "WATER信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WATER water)
    {
        return toAjax(WaterService.insertwater(water));
    }
    /**
     * 修改WATER信息
     */
    @GetMapping("/edit/{wid}")
    public String edit(@PathVariable("wid") String wid, ModelMap mmap)
    {
        WATER water = WaterService.selectBywid(wid);
        mmap.put("water", water);
        return prefix + "/edit";
    }
    /**
     * 修改保存WATER信息
     */
    @RequiresPermissions("iot:waterinfo:edit")
    @Log(title = "WATER信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WATER water)
    {
        return toAjax(WaterService.updateWater(water));
    }
    /**
     * 删除WATER信息
     */
    @RequiresPermissions("iot:waterinfo:remove")
    @Log(title = "删除WATER信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{wid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("wid") String wid)
    {
        System.out.println("*******"+wid);
        return toAjax(WaterService.deleteWaterByids(wid));
    }
}