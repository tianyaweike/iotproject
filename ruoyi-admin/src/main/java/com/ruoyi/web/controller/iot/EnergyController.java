package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.ExcelUtil;
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
@RequestMapping("/iot/energy")
public class EnergyController extends BaseController {

    private String prefix = "iot/energy";

    @Autowired
    private EnergyService EnergyService;

    @RequiresPermissions("iot:energyinfo:view")
    @GetMapping()
    public String Energy(){
        return prefix+"/energy";
    }

    /**
     * 导出终端运转列表
     */
    @Log(title = "Energy", businessType = BusinessType.EXPORT)
    @RequiresPermissions("iot:energyinfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Energy energy)
    {
        List<Energy> list = EnergyService.selectEnergyList(energy);
        ExcelUtil<Energy> util = new ExcelUtil<Energy>(Energy.class);
        return util.exportExcel(list, "led");
    }

    /**
     * Energy列表
     * @param energy
     * @return
     */
    //@RequiresPermissions("iot:energyinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Energy energy){
        startPage();
        List<Energy> list = EnergyService.selectEnergyList(energy);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Energy信息
     */
    @RequiresPermissions("iot:energyinfo:add")
    @Log(title = "Energy信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Energy energy)
    {
        return toAjax(EnergyService.insertEnergy(energy));
    }
    /**
     * 修改Energy信息
     */
    @GetMapping("/edit/{eid}")
    public String edit(@PathVariable("eid") String eid, ModelMap mmap)
    {
        Energy energy = EnergyService.selectByeid(eid);
        mmap.put("energy", energy);
        return prefix + "/edit";
    }
    /**
     * 修改保存Energy信息
     */
    @RequiresPermissions("iot:energyinfo:edit")
    @Log(title = "Energy信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Energy energy)
    {
        return toAjax(EnergyService.updateEnergy(energy));
    }
    /**
     * 删除Energy信息
     */
    @RequiresPermissions("iot:energyinfo:remove")
    @Log(title = "删除Energy信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove( String ids)
    {
        //System.out.println("*******"+ids);
        return toAjax(EnergyService.deleteEnergyByids(ids));
    }
}