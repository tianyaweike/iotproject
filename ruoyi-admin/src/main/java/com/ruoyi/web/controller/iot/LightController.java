package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Light;
import com.ruoyi.iot.service.LightService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/light")
public class LightController extends BaseController {

    private String prefix = "iot/light";

    @Autowired
    private LightService LightService;

    @RequiresPermissions("iot:lightinfo:view")
    @GetMapping()
    public String Light(){
        return prefix+"/light";
    }
    /**
     * 导出终端运转列表
     */
    @Log(title = "Light", businessType = BusinessType.EXPORT)
    @RequiresPermissions("iot:lightinfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Light light)
    {
        List<Light> list = LightService.selectLightList(light);
        ExcelUtil<Light> util = new ExcelUtil<Light>(Light.class);
        return util.exportExcel(list, "light");
    }
    /**
     * Light列表
     * @param light
     * @return
     */
    //@RequiresPermissions("iot:lightinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Light light){
        startPage();
        List<Light> list = LightService.selectLightList(light);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Light信息
     */
    @RequiresPermissions("iot:lightinfo:add")
    @Log(title = "Light信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Light light)
    {
        return toAjax(LightService.insertLight(light));
    }
    /**
     * 修改Light信息
     */
    @GetMapping("/edit/{nid}")
    public String edit(@PathVariable("nid") String nid, ModelMap mmap)
    {
        Light light = LightService.selectBynid(nid);
        mmap.put("light", light);
        return prefix + "/edit";
    }
    /**
     * 修改保存Light信息
     */
    @RequiresPermissions("iot:lightinfo:edit")
    @Log(title = "Light信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Light light)
    {
        return toAjax(LightService.updateLight(light));
    }
    /**
     * 删除Light信息
     */
    @RequiresPermissions("iot:lightinfo:remove")
    @Log(title = "删除Light信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove( String ids)
    {
        System.out.println("*******"+ids);
        return toAjax(LightService.deleteLightByids(ids));
    }
}