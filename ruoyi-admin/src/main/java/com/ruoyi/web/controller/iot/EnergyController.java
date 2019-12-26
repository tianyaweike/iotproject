package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Energy;
import com.ruoyi.iot.service.EnergyService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/energyinfo")
public class EnergyController extends BaseController {

    private String prefix = "iot/energyinfo";

    @Autowired
    private EnergyService EnergyService;

    @RequiresPermissions("iot:energyinfo:view")
    @GetMapping()
    public String Energy(){
        return prefix+"/energy";
    }

    /**
     * ENERGY列表
     * @param energy
     * @return
     */
    //@RequiresPermissions("iot:energyinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ENERGY energy){
        startPage();
        List<Energy> list = EnergyService.selectEnergyList(energy);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增ENERGY信息
     */
    @RequiresPermissions("iot:energyinfo:add")
    @Log(title = "ENERGY信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ENERGY energy)
    {
        return toAjax(EnergyService.insertenergy(energy));
    }
    /**
     * 修改ENERGY信息
     */
    @GetMapping("/edit/{eid}")
    public String edit(@PathVariable("eid") String eid, ModelMap mmap)
    {
        ENERGY energy = EnergyService.selectByeid(eid);
        mmap.put("energy", energy);
        return prefix + "/edit";
    }
    /**
     * 修改保存ENERGY信息
     */
    @RequiresPermissions("iot:energyinfo:edit")
    @Log(title = "ENERGY信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ENERGY energy)
    {
        return toAjax(EnergyService.updateEnergy(energy));
    }
    /**
     * 删除ENERGY信息
     */
    @RequiresPermissions("iot:energyinfo:remove")
    @Log(title = "删除ENERGY信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{eid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("eid") String eid)
    {
        System.out.println("*******"+eid);
        return toAjax(EnergyService.deleteEnergyByids(eid));
    }
}