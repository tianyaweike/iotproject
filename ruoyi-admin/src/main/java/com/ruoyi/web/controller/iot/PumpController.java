package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Pump;
import com.ruoyi.iot.service.PumpService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/pumpinfo")
public class PumpController extends BaseController {

    private String prefix = "iot/pumpinfo";

    @Autowired
    private PumpService PumpService;

    @RequiresPermissions("iot:pumpinfo:view")
    @GetMapping()
    public String Pump(){
        return prefix+"/Pump";
    }

    /**
     * Pump列表
     * @param Pump
     * @return
     */
    //@RequiresPermissions("iot:pumpinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Pump Pump){
        startPage();
        List<Pump> list = PumpService.selectPumpList(Pump);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Pump信息
     */
    @RequiresPermissions("iot:pumpinfo:add")
    @Log(title = "Pump信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Pump Pump)
    {
        return toAjax(PumpService.insertPump(Pump));
    }
    /**
     * 修改Pump信息
     */
    @GetMapping("/edit/{pump_id}")
    public String edit(@PathVariable("pump_id") String pump_id, ModelMap mmap)
    {
        Pump Pump = PumpService.selectBypump_id(pump_id);
        mmap.put("Pump", Pump);
        return prefix + "/edit";
    }
    /**
     * 修改保存Pump信息
     */
    @RequiresPermissions("iot:pumpinfo:edit")
    @Log(title = "Pump信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Pump Pump)
    {
        return toAjax(PumpService.updatePump(Pump));
    }
    /**
     * 删除Pump信息
     */
    @RequiresPermissions("iot:pumpinfo:remove")
    @Log(title = "删除Pump信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove/{pump_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("pump_id") String pump_id)
    {
        System.out.println("*******"+pump_id);
        return toAjax(PumpService.deletePumpByids(pump_id));
    }
}