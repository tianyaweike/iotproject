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
@RequestMapping("/iot/environinfo")
public class EnvironlController extends BaseController {

    private String prefix = "iot/environinfo";

    @Autowired
    private EnvironlService EnvironlService;

    @RequiresPermissions("iot:environinfo:view")
    @GetMapping()
    public String Environl(){
        return prefix+"/environl";
    }

    /**
     * ENVIRONL列表
     * @param environl
     * @return
     */
    //@RequiresPermissions("iot:environinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ENVIRONL environl){
        startPage();
        List<Environl> list = EnvironlService.selectEnvironlList(environl);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增ENVIRONL信息
     */
    @RequiresPermissions("iot:environinfo:add")
    @Log(title = "ENVIRONL信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ENVIRONL environl)
    {
        return toAjax(EnvironlService.insertenvironl(environl));
    }
    /**
     * 修改ENVIRONL信息
     */
    @GetMapping("/edit/{hid}")
    public String edit(@PathVariable("hid") String hid, ModelMap mmap)
    {
        ENVIRONL environl = EnvironlService.selectByhid(hid);
        mmap.put("environl", environl);
        return prefix + "/edit";
    }
    /**
     * 修改保存ENVIRONL信息
     */
    @RequiresPermissions("iot:environinfo:edit")
    @Log(title = "ENVIRONL信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ENVIRONL environl)
    {
        return toAjax(EnvironlService.updateEnvironl(environl));
    }
    /**
     * 删除ENVIRONL信息
     */
    @RequiresPermissions("iot:environinfo:remove")
    @Log(title = "删除ENVIRONL信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{hid}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("hid") String hid)
    {
        System.out.println("*******"+hid);
        return toAjax(EnvironlService.deleteEnvironlByids(hid));
    }
}