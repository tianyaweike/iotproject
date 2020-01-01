package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Blowdown;
import com.ruoyi.iot.service.BlowdownService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.ruoyi.common.utils.ExcelUtil;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/blowdown")
public class BlowdownController extends BaseController {

    private String prefix = "iot/blowdown";

    @Autowired
    private BlowdownService BlowdownService;

    @RequiresPermissions("iot:blowdowninfo:view")
    @GetMapping()
    public String Blowdown(){
        return prefix+"/blowdown";
    }

    /**
     * Blowdown列表
     * @param blowdown
     * @return
     */
    @RequiresPermissions("iot:blowdowninfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Blowdown blowdown){
        startPage();
        List<Blowdown> list = BlowdownService.selectBlowdownList(blowdown);
        return getDataTable(list);
    }
    /**
     * 导出终端运转列表
     */
    @Log(title = "Blowdown", businessType = BusinessType.EXPORT)
    @RequiresPermissions("iot:Blowdowninfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Blowdown blowdown)
    {
        List<Blowdown> list = BlowdownService.selectBlowdownList(blowdown);
        ExcelUtil<Blowdown> util = new ExcelUtil<Blowdown>(Blowdown.class);
        return util.exportExcel(list, "blowdown");
    }
    /**
     * 新增
     */
    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增保存Blowdown信息
     */
    @RequiresPermissions("iot:blowdowninfo:add")
    @Log(title = "Blowdown信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Blowdown blowdown)
    {
        return toAjax(BlowdownService.insertBlowdown(blowdown));
    }
    /**
     * 修改Blowdown信息
     */
    @GetMapping("/edit/{pid}")
    public String edit(@PathVariable("pid") String pid, ModelMap mmap)
    {
        Blowdown blowdown = BlowdownService.selectByid(pid);
        mmap.put("blowdown", blowdown);
        return prefix + "/edit";
    }
    /**
     * 修改保存Blowdown信息
     */
    @RequiresPermissions("iot:blowdowninfo:edit")
    @Log(title = "Blowdown信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Blowdown blowdown)
    {
        return toAjax(BlowdownService.updateBlowdown(blowdown));
    }
    /**
     * 删除Blowdown信息
     */
    @RequiresPermissions("iot:blowdowninfo:remove")
    @Log(title = "删除Blowdown信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove( String ids)
    {
        return toAjax(BlowdownService.deleteBlowdownByids(ids));
    }
}