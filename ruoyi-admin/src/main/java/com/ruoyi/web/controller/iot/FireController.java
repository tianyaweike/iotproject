package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Fire;

import com.ruoyi.iot.service.FireService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/fire")
public class FireController extends BaseController {

    private String prefix = "iot/fire";

    @Autowired
    private FireService FireService;

    @RequiresPermissions("iot:fireinfo:view")
    @GetMapping()
    public String Fire(){
        return prefix+"/fire";
    }

    /**
     * Fire列表
     * @param fire
     * @return
     */
    @RequiresPermissions("iot:fireinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Fire fire){
        startPage();
        List<Fire> list = FireService.selectFireList(fire);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Fire信息
     */
    @RequiresPermissions("iot:fireinfo:add")
    @Log(title = "Fire信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Fire fire)
    {
        return toAjax(FireService.insertFire(fire));
    }
    /**
     * 修改Fire信息
     */
    @GetMapping("/edit/{fid}")
    public String edit(@PathVariable("fid") String fid, ModelMap mmap)
    {
        Fire fire = FireService.selectByfid(fid);
        mmap.put("fire", fire);
        return prefix + "/edit";
    }
    /**
     * 修改保存Fire信息
     */
    @RequiresPermissions("iot:fireinfo:edit")
    @Log(title = "Fire信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Fire fire)
    {
        return toAjax(FireService.updateFire(fire));
    }
    /**
     * 删除Fire信息
     */
    @RequiresPermissions("iot:fireinfo:remove")
    @Log(title = "删除Fire信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        //System.out.println("*******"+fid);
        return toAjax(FireService.deleteFireByids(ids));
    }




}