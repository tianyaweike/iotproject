package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Flood;
import com.ruoyi.iot.service.FloodService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/flood")
public class FloodController extends BaseController {

    private String prefix = "/iot/flood";

    @Autowired
    private FloodService FloodService;

    @RequiresPermissions("iot:floodinfo:view")
    @GetMapping()
    public String Flood(){
        return prefix+"/flood";
    }

    /**
     * Flood列表
     * @param flood
     * @return
     */
    @RequiresPermissions("iot:floodinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Flood flood){
        startPage();
        List<Flood> list = FloodService.selectFloodList(flood);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Flood信息
     */
    @RequiresPermissions("iot:floodinfo:add")
    @Log(title = "Flood信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Flood flood)
    {
        return toAjax(FloodService.insertFlood(flood));
    }
    /**
     * 修改Flood信息
     */
    @GetMapping("/edit/{place_id}")
    public String edit(@PathVariable("place_id") String place_id, ModelMap mmap)
    {
        Flood flood = FloodService.selectByid(place_id);
        mmap.put("flood", flood);
        return prefix + "/edit";
    }
    /**
     * 修改保存Flood信息
     */
    @RequiresPermissions("iot:floodinfo:edit")
    @Log(title = "Flood信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Flood flood)
    {
        return toAjax(FloodService.updateFlood(flood));
    }
    /**
     * 删除Flood信息
     */
    @RequiresPermissions("iot:floodinfo:remove")
    @Log(title = "删除Flood信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove( String ids)
    {
        //System.out.println("*******"+place_id);
        return toAjax(FloodService.deleteFloodByids(ids));
    }
}