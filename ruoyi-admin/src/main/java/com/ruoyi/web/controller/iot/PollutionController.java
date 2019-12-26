package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Pollution;
import com.ruoyi.iot.service.PollutionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/blowdowninfo")
public class PollutionController extends BaseController {

    private String prefix = "iot/blowdowninfo";

    @Autowired
    private PollutionService PollutionService;

    @RequiresPermissions("iot:blowdowninfo:view")
    @GetMapping()
    public String Pollution(){
        return prefix+"/pollution";
    }

    /**
     * Pollution列表
     * @param pollution
     * @return
     */
    //@RequiresPermissions("iot:blowdowninfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Pollution pollution){
        startPage();
        List<Pollution> list = PollutionService.selectPollutionList(pollution);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增Pollution信息
     */
    @RequiresPermissions("iot:blowdowninfo:add")
    @Log(title = "Pollution信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Pollution pollution)
    {
        return toAjax(PollutionService.insertpollution(pollution));
    }
    /**
     * 修改Pollution信息
     */
    @GetMapping("/edit/{pid}")
    public String edit(@PathVariable("pid") String pid, ModelMap mmap)
    {
        Pollution pollution = PollutionService.selectBypid(pid);
        mmap.put("pollution", pollution);
        return prefix + "/edit";
    }
    /**
     * 修改保存Pollution信息
     */
    @RequiresPermissions("iot:blowdowninfo:edit")
    @Log(title = "Pollution信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Pollution pollution)
    {
        return toAjax(PollutionService.updatePollution(pollution));
    }
    /**
     * 删除Pollution信息
     */
    @RequiresPermissions("iot:blowdowninfo:remove")
    @Log(title = "删除Pollution信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{pid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("pid") String pid)
    {
        System.out.println("*******"+pid);
        return toAjax(PollutionService.deletePollutionByids(pid));
    }
}