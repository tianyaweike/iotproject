package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Mountainflood;
import com.ruoyi.iot.service.MountainfloodService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/mountainfloodinfo")
public class MountainfloodController extends BaseController {

    private String prefix = "iot/mountainfloodinfo";

    @Autowired
    private MountainfloodService MountainfloodService;

    @RequiresPermissions("iot:mountainfloodinfo:view")
    @GetMapping()
    public String Mountainflood(){
        return prefix+"/mountainflood";
    }

    /**
     * Mountainflood列表
     * @param mountainflood
     * @return
     */
    //@RequiresPermissions("iot:mountainfloodinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Mountainflood mountainflood){
        startPage();
        List<Mountainflood> list = MountainfloodService.selectMountainfloodList(mountainflood);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Mountainflood信息
     */
    @RequiresPermissions("iot:mountainfloodinfo:add")
    @Log(title = "Mountainflood信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Mountainflood mountainflood)
    {
        return toAjax(MountainfloodService.insertmountainflood(mountainflood));
    }
    /**
     * 修改Mountainflood信息
     */
    @GetMapping("/edit/{place_id}")
    public String edit(@PathVariable("place_id") String place_id, ModelMap mmap)
    {
        Mountainflood mountainflood = MountainfloodService.selectByplace_id(place_id);
        mmap.put("mountainflood", mountainflood);
        return prefix + "/edit";
    }
    /**
     * 修改保存Mountainflood信息
     */
    @RequiresPermissions("iot:mountainfloodinfo:edit")
    @Log(title = "Mountainflood信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Mountainflood mountainflood)
    {
        return toAjax(MountainfloodService.updateMountainflood(mountainflood));
    }
    /**
     * 删除Mountainflood信息
     */
    @RequiresPermissions("iot:mountainfloodinfo:remove")
    @Log(title = "删除Mountainflood信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{place_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("place_id") String place_id)
    {
        System.out.println("*******"+place_id);
        return toAjax(MountainfloodService.deleteMountainfloodByids(place_id));
    }
}