package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
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
@RequestMapping("/iot/lightinfo")
public class LightController extends BaseController {

    private String prefix = "iot/lightinfo";

    @Autowired
    private LightService LightService;

    @RequiresPermissions("iot:lightinfo:view")
    @GetMapping()
    public String Light(){
        return prefix+"/Light";
    }

    /**
     * Light列表
     * @param Light
     * @return
     */
    //@RequiresPermissions("iot:lightinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Light Light){
        startPage();
        List<Light> list = LightService.selectLightList(Light);
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
    public AjaxResult addSave(Light Light)
    {
        return toAjax(LightService.insertLight(Light));
    }
    /**
     * 修改Light信息
     */
    @GetMapping("/edit/{nid}")
    public String edit(@PathVariable("nid") String nid, ModelMap mmap)
    {
        Light Light = LightService.selectBynid(nid);
        mmap.put("Light", Light);
        return prefix + "/edit";
    }
    /**
     * 修改保存Light信息
     */
    @RequiresPermissions("iot:lightinfo:edit")
    @Log(title = "Light信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Light Light)
    {
        return toAjax(LightService.updateLight(Light));
    }
    /**
     * 删除Light信息
     */
    @RequiresPermissions("iot:lightinfo:remove")
    @Log(title = "删除Light信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove/{nid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("nid") String nid)
    {
        System.out.println("*******"+nid);
        return toAjax(LightService.deleteLightByids(nid));
    }
}