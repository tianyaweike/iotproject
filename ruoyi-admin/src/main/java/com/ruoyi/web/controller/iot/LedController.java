package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Led;
import com.ruoyi.iot.service.LedService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/ledinfo")
public class LEDController extends BaseController {

    private String prefix = "iot/ledinfo";

    @Autowired
    private LedService LedService;

    @RequiresPermissions("iot:ledinfo:view")
    @GetMapping()
    public String Led(){
        return prefix+"/led";
    }

    /**
     * LED列表
     * @param led
     * @return
     */
    //@RequiresPermissions("iot:ledinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LED led){
        startPage();
        List<Led> list = LedService.selectLedList(led);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增LED信息
     */
    @RequiresPermissions("iot:ledinfo:add")
    @Log(title = "LED信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LED led)
    {
        return toAjax(LedService.insertled(led));
    }
    /**
     * 修改LED信息
     */
    @GetMapping("/edit/{ledid}")
    public String edit(@PathVariable("led_id") String led_id, ModelMap mmap)
    {
        LED led = LedService.selectByledid(led_id);
        mmap.put("led", led);
        return prefix + "/edit";
    }
    /**
     * 修改保存LED信息
     */
    @RequiresPermissions("iot:ledinfo:edit")
    @Log(title = "LED信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LED led)
    {
        return toAjax(LedService.updateLed(led));
    }
    /**
     * 删除LED信息
     */
    @RequiresPermissions("iot:ledinfo:remove")
    @Log(title = "删除LED信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove/{ledid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("led_id") String led_id)
    {
        System.out.println("*******"+led_id);
        return toAjax(LedService.deleteLedByIds(led_id));
    }
}