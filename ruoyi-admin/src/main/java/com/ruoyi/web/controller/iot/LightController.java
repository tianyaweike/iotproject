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
        return prefix+"/light";
    }

    /**
     * LIGHT列表
     * @param light
     * @return
     */
    //@RequiresPermissions("iot:lightinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LIGHT light){
        startPage();
        List<Light> list = LightService.selectLightList(light);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增LIGHT信息
     */
    @RequiresPermissions("iot:lightinfo:add")
    @Log(title = "LIGHT信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LIGHT light)
    {
        return toAjax(LightService.insertlight(light));
    }
    /**
     * 修改LIGHT信息
     */
    @GetMapping("/edit/{nid}")
    public String edit(@PathVariable("nid") String nid, ModelMap mmap)
    {
        LIGHT light = LightService.selectBynid(nid);
        mmap.put("light", light);
        return prefix + "/edit";
    }
    /**
     * 修改保存LIGHT信息
     */
    @RequiresPermissions("iot:lightinfo:edit")
    @Log(title = "LIGHT信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LIGHT light)
    {
        return toAjax(LightService.updateLight(light));
    }
    /**
     * 删除LIGHT信息
     */
    @RequiresPermissions("iot:lightinfo:remove")
    @Log(title = "删除LIGHT信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{nid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("nid") String nid)
    {
        System.out.println("*******"+nid);
        return toAjax(LightService.deleteLightByids(nid));
    }
}