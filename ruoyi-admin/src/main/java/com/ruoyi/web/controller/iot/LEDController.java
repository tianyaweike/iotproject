package com.ruoyi.web.controller.iot;

import java.util.List;

import com.ruoyi.iot.service.ILEDService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.iot.domain.LED;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;

/**
 * 终端运转 信息操作处理
 *
 * @author 张超
 * @date 2019-03-03
 */
@Controller
@RequestMapping (value={"/iot/led"})
public class LEDController extends BaseController
{
    private String prefix = "iot/led";

    @Autowired
    private ILEDService ledService;

    @RequiresPermissions("iot:ledinfo:view")
    @GetMapping()
    public String operlog() { return prefix + "/led"; }

    /**
     * 查询终端运转列表
     */
    @RequiresPermissions("iot:ledinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LED led)
    {
        startPage();
        List<LED> list = ledService.selectLedList(led);
        return getDataTable(list);
    }


    /**
     * 导出终端运转列表
     */
    @Log(title = "LED", businessType = BusinessType.EXPORT)
    @RequiresPermissions("iot:ledinfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LED led)
    {
        List<LED> list = ledService.selectLedList(led);
        ExcelUtil<LED> util = new ExcelUtil<LED>(LED.class);
        return util.exportExcel(list, "led");
    }
    /**
     * 新增
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存
     */
    @RequiresPermissions("iot:ledinfo:add")
    @Log(title = "LED", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LED led)
    {
        return toAjax(ledService.insertLed(led));
    }

    /**
     * 修改终端运转
     */
    @GetMapping("/edit/{led_id}")
    public String edit(@PathVariable("led_id") String led_id, ModelMap mmap)
    {
        LED led = ledService.selectLedById(led_id);
        mmap.put("led", led);
        return prefix + "/edit";
    }

    /**
     * 修改保存终端运转
     */
    @RequiresPermissions("iot:ledinfo:edit")
    @Log(title = "终端运转", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LED led)
    {
        return toAjax(ledService.updateLed(led));
    }

    /**
     * 删除终端运转
     */
    @RequiresPermissions("iot:ledinfo:remove")
    @Log(title = "LED", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ledService.deleteLedByIds(ids));
    }


    /*public AjaxResult remove(String led_ids)
    {
        return toAjax(ledService.deleteLedByIds(led_ids));
    }*/

}
