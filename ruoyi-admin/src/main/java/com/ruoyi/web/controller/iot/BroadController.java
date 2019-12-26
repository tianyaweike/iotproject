package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Broad;
import com.ruoyi.iot.service.BroadService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/Broadinfo")
public class BroadController extends BaseController {

    private String prefix = "iot/Broadinfo";

    @Autowired
    private BroadService BroadService;

    @RequiresPermissions("iot:Broadinfo:view")
    @GetMapping()
    public String Broad(){
        return prefix+"/broad";
    }

    /**
     * Broad列表
     * @param Broad
     * @return
     */
    //@RequiresPermissions("iot:Broadinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Broad Broad){
        startPage();
        List<Broad> list = BroadService.selectBroadList(Broad);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Broad信息
     */
    @RequiresPermissions("iot:Broadinfo:add")
    @Log(title = "Broad信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Broad Broad)
    {
        return toAjax(BroadService.insertBroad(Broad));
    }
    /**
     * 修改Broad信息
     */
    @GetMapping("/edit/{broad_id}")
    public String edit(@PathVariable("broad_id") String broad_id, ModelMap mmap)
    {
        Broad Broad = BroadService.selectBybroad_id(broad_id);
        mmap.put("Broad", Broad);
        return prefix + "/edit";
    }
    /**
     * 修改保存Broad信息
     */
    @RequiresPermissions("iot:Broadinfo:edit")
    @Log(title = "Broad信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Broad Broad)
    {
        return toAjax(BroadService.updateBroad(Broad));
    }
    /**
     * 删除Broad信息
     */
    @RequiresPermissions("iot:Broadinfo:remove")
    @Log(title = "删除Broad信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove/{broad_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("broad_id") String broad_id)
    {
        System.out.println("*******"+broad_id);
        return toAjax(BroadService.deleteBroadByids(broad_id));
    }
}