package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.SandBox;
import com.ruoyi.iot.service.SandBoxService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/sandBoxinfo")
public class SandBoxController extends BaseController {

    private String prefix = "iot/sandBoxinfo";

    @Autowired
    private SandBoxService SandBoxService;

    @RequiresPermissions("iot:sandBoxinfo:view")
    @GetMapping()
    public String SandBox(){
        return prefix+"/sandBox";
    }

    /**
     *  SandBox列表
     * @param sandBox
     * @return
     */
    //@RequiresPermissions("iot:sandBoxinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list( SandBox sandBox){
        startPage();
        List<SandBox> list = SandBoxService.selectSandBoxList(sandBox);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增 SandBox信息
     */
    @RequiresPermissions("iot:sandBoxinfo:add")
    @Log(title = " SandBox信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave( SandBox sandBox)
    {
        return toAjax(SandBoxService.insertsandBox(sandBox));
    }
    /**
     * 修改 SandBox信息
     */
    @GetMapping("/edit/{switch_id}")
    public String edit(@PathVariable("switch_id") String switch_id, ModelMap mmap)
    {
         SandBox sandBox = SandBoxService.selectByswitch_id(switch_id);
        mmap.put("sandBox", sandBox);
        return prefix + "/edit";
    }
    /**
     * 修改保存 SandBox信息
     */
    @RequiresPermissions("iot:sandBoxinfo:edit")
    @Log(title = " SandBox信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave( SandBox sandBox)
    {
        return toAjax(SandBoxService.updateSandBox(sandBox));
    }
    /**
     * 删除 SandBox信息
     */
    @RequiresPermissions("iot:sandBoxinfo:remove")
    @Log(title = "删除 SandBox信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{switch_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("switch_id") String switch_id)
    {
        System.out.println("*******"+switch_id);
        return toAjax(SandBoxService.deleteSandBoxByids(switch_id));
    }
}