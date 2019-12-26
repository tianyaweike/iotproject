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
@RequestMapping("/iot/broadinfo")
public class BroadController extends BaseController {

    private String prefix = "iot/broadinfo";

    @Autowired
    private BroadService BroadService;

    @RequiresPermissions("iot:broadinfo:view")
    @GetMapping()
    public String Broad(){
        return prefix+"/broad";
    }

    /**
     * BROAD列表
     * @param broad
     * @return
     */
    //@RequiresPermissions("iot:broadinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BROAD broad){
        startPage();
        List<Broad> list = BroadService.selectBroadList(broad);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增BROAD信息
     */
    @RequiresPermissions("iot:broadinfo:add")
    @Log(title = "BROAD信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BROAD broad)
    {
        return toAjax(BroadService.insertbroad(broad));
    }
    /**
     * 修改BROAD信息
     */
    @GetMapping("/edit/{broad_id}")
    public String edit(@PathVariable("broad_id") String broad_id, ModelMap mmap)
    {
        BROAD broad = BroadService.selectBybroad_id(broad_id);
        mmap.put("broad", broad);
        return prefix + "/edit";
    }
    /**
     * 修改保存BROAD信息
     */
    @RequiresPermissions("iot:broadinfo:edit")
    @Log(title = "BROAD信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BROAD broad)
    {
        return toAjax(BroadService.updateBroad(broad));
    }
    /**
     * 删除BROAD信息
     */
    @RequiresPermissions("iot:broadinfo:remove")
    @Log(title = "删除BROAD信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{broad_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("broad_id") String broad_id)
    {
        System.out.println("*******"+broad_id);
        return toAjax(BroadService.deleteBroadByids(broad_id));
    }
}