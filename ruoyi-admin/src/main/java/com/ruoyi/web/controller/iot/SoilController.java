package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.LED;
import com.ruoyi.iot.domain.Soil;
import com.ruoyi.iot.service.SoilService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/soil")
public class SoilController extends BaseController {

    private String prefix = "iot/soil";

    @Autowired
    private SoilService SoilService;

    @RequiresPermissions("iot:soilinfo:view")
    @GetMapping()
    public String Soil(){
        return prefix+"/soil";
    }

    /**
     * Soil列表
     * @param soil
     * @return
     */
    @RequiresPermissions("iot:soilinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Soil soil){
        startPage();
        List<Soil> list = SoilService.selectSoilList(soil);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Soil信息
     */
    @RequiresPermissions("iot:soilinfo:add")
    @Log(title = "Soil信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Soil soil)
    {
        return toAjax(SoilService.insertSoil(soil));
    }
    /**
     * 修改Soil信息
     */
    @GetMapping("/edit/{sid}")
    public String edit(@PathVariable("sid") String sid, ModelMap mmap)
    {
        Soil soil = SoilService.selectBysid(sid);
        mmap.put("soil", soil);
        return prefix + "/edit";
    }
    /**
     * 修改保存Soil信息
     */
    @RequiresPermissions("iot:soilinfo:edit")
    @Log(title = "Soil信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Soil soil)
    {
        return toAjax(SoilService.updateSoil(soil));
    }
    /**
     * 删除Soil信息
     */
    @RequiresPermissions("iot:soilinfo:remove")
    @Log(title = "删除Soil信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        //System.out.println("*******"+sid);
        return toAjax(SoilService.deleteSoilByids(ids));
    }

}