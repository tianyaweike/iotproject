package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Environl;
import com.ruoyi.iot.service.EnvironlService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/environl")
public class EnvironlController extends BaseController {

    private String prefix = "iot/environl";

    @Autowired
    private EnvironlService EnvironlService;

    @RequiresPermissions("iot:environlinfo:view")
    @GetMapping()
    public String Environl(){
        return prefix+"/environl";
    }

    /**
     * Environl列表
     * @param environl
     * @return
     */
    @RequiresPermissions("iot:environlinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Environl environl){
        startPage();
        List<Environl> list = EnvironlService.selectEnvironlList(environl);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Environl信息
     */
    @RequiresPermissions("iot:environlinfo:add")
    @Log(title = "Environl信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Environl environl)
    {
        return toAjax(EnvironlService.insertEnvironl(environl));
    }
    /**
     * 修改Environl信息
     */
    @GetMapping("/edit/{hid}")
    public String edit(@PathVariable("hid") String hid, ModelMap mmap)
    {
        Environl environl = EnvironlService.selectByhid(hid);
        mmap.put("environl", environl);
        return prefix + "/edit";
    }
    /**
     * 修改保存Environl信息
     */
    @RequiresPermissions("iot:environlinfo:edit")
    @Log(title = "Environl信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Environl environl)
    {
        return toAjax(EnvironlService.updateEnvironl(environl));
    }

    /**
     * 删除Environl信息
     */
    @RequiresPermissions("iot:environlinfo:remove")
    @Log(title = "删除Environl信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{hid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("hid") String hid)
    {
        //System.out.println("*******"+hid);
        return toAjax(EnvironlService.deleteEnvironlByids(hid));
    }
}