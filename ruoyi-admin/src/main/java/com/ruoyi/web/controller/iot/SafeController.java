package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Safe;
import com.ruoyi.iot.service.SafeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/safeinfo")
public class SafeController extends BaseController {

    private String prefix = "iot/safeinfo";

    @Autowired
    private SafeService SafeService;

    @RequiresPermissions("iot:safeinfo:view")
    @GetMapping()
    public String Safe(){
        return prefix+"/safe";
    }

    /**
     * Safe列表
     * @param Safe
     * @return
     */
    //@RequiresPermissions("iot:safeinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Safe Safe){
        startPage();
        List<Safe> list = SafeService.selectSafeList(Safe);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Safe信息
     */
    @RequiresPermissions("iot:Safeinfo:add")
    @Log(title = "Safe信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Safe Safe)
    {
        return toAjax(SafeService.insertSafe(Safe));
    }
    /**
     * 修改Safe信息
     */
    @GetMapping("/edit/{safeid}")
    public String edit(@PathVariable("safe_id") String safe_id, ModelMap mmap)
    {
        Safe Safe = SafeService.selectBySafeid(safe_id);
        mmap.put("Safe", Safe);
        return prefix + "/edit";
    }
    /**
     * 修改保存Safe信息
     */
    @RequiresPermissions("iot:safeinfo:edit")
    @Log(title = "Safe信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Safe Safe)
    {
        return toAjax(SafeService.updateSafe(Safe));
    }
    /**
     * 删除Safe信息
     */
    @RequiresPermissions("iot:safeinfo:remove")
    @Log(title = "删除Safe信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove/{safeid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("safe_id") String safe_id)
    {
        System.out.println("*******"+safe_id);
        return toAjax(SafeService.deleteSafeByids(safe_id));
    }
}