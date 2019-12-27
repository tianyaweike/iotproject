package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Meteor;
import com.ruoyi.iot.service.MeteorService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/meteorinfo")
public class MeteorController extends BaseController {

    private String prefix = "iot/meteorinfo";

    @Autowired
    private MeteorService MeteorService;

    @RequiresPermissions("iot:meteorinfo:view")
    @GetMapping()
    public String Meteor(){
        return prefix+"/meteor";
    }

    /**
     * Meteor列表
     * @param meteor
     * @return
     */
    //@RequiresPermissions("iot:meteorinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Meteor meteor){
        startPage();
        List<Meteor> list = MeteorService.selectMeteorList(meteor);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Meteor信息
     */
    @RequiresPermissions("iot:meteorinfo:add")
    @Log(title = "Meteor信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Meteor meteor)
    {
        return toAjax(MeteorService.insertmeteor(meteor));
    }
    /**
     * 修改Meteor信息
     */
    @GetMapping("/edit/{meteor_id}")
    public String edit(@PathVariable("meteor_id") String meteor_id, ModelMap mmap)
    {
        Meteor meteor = MeteorService.selectBymeteor_id(meteor_id);
        mmap.put("meteor", meteor);
        return prefix + "/edit";
    }
    /**
     * 修改保存Meteor信息
     */
    @RequiresPermissions("iot:meteorinfo:edit")
    @Log(title = "Meteor信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Meteor meteor)
    {
        return toAjax(MeteorService.updateMeteor(meteor));
    }
    /**
     * 删除Meteor信息
     */
    @RequiresPermissions("iot:meteorinfo:remove")
    @Log(title = "删除Meteor信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{meteor_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("meteor_id") String meteor_id)
    {
        System.out.println("*******"+meteor_id);
        return toAjax(MeteorService.deleteMeteorByids(meteor_id));
    }
}