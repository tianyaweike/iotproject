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
        return prefix+"/Energy";
    }

    /**
     * Energy列表
     * @param Energy
     * @return
     */
    //@RequiresPermissions("iot:energyinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Energy Energy){
        startPage();
        List<Energy> list = EnergyService.selectEnergyList(Energy);
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
    public AjaxResult addSave(Energy Energy)
    {
        return toAjax(EnergyService.insertEnergy(Energy));
    }
    /**
     * 修改Energy信息
     */
    @GetMapping("/edit/{eid}")
    public String edit(@PathVariable("eid") String eid, ModelMap mmap)
    {
        Energy Energy = EnergyService.selectByeid(eid);
        mmap.put("Energy", Energy);
        return prefix + "/edit";
    }
    /**
     * 修改保存Energy信息
     */
    @RequiresPermissions("iot:energyinfo:edit")
    @Log(title = "Energy信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Energy Energy)
    {
        return toAjax(EnergyService.updateEnergy(Energy));
    }
    /**
     * 删除Energy信息
     */
    @RequiresPermissions("iot:energyinfo:remove")
    @Log(title = "删除Energy信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove/{eid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("eid") String eid)
    {
        System.out.println("*******"+eid);
        return toAjax(EnergyService.deleteEnergyByids(eid));
    }
}