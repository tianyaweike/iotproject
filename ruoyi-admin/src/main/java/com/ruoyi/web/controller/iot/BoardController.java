package com.ruoyi.web.controller.iot;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Board;
import com.ruoyi.iot.service.BoardService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/boardinfo")
public class BoardController extends BaseController {

    private String prefix = "iot/boardinfo";

    @Autowired
    private BoardService BoardService;

    @RequiresPermissions("iot:boardinfo:view")
    @GetMapping()
    public String Board(){
        return prefix+"/board";
    }

    /**
     * BOARD列表
     * @param board
     * @return
     */
    //@RequiresPermissions("iot:boardinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BOARD board){
        startPage();
        List<Board> list = BoardService.selectBoardList(board);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(){
        return prefix+"/add";
    }

    /**
     * 新增BOARD信息
     */
    @RequiresPermissions("iot:boardinfo:add")
    @Log(title = "BOARD信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BOARD board)
    {
        return toAjax(BoardService.insertboard(board));
    }
    /**
     * 修改BOARD信息
     */
    @GetMapping("/edit/{billboard_id}")
    public String edit(@PathVariable("billboard_id") String billboard_id, ModelMap mmap)
    {
        BOARD board = BoardService.selectBybillboard_id(billboard_id);
        mmap.put("board", board);
        return prefix + "/edit";
    }
    /**
     * 修改保存BOARD信息
     */
    @RequiresPermissions("iot:boardinfo:edit")
    @Log(title = "BOARD信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BOARD board)
    {
        return toAjax(BoardService.updateBoard(board));
    }
    /**
     * 删除BOARD信息
     */
    @RequiresPermissions("iot:boardinfo:remove")
    @Log(title = "删除BOARD信息", businessType = BusinessType.DELETE)

    @PostMapping( "/remove/{billboard_id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("billboard_id") String billboard_id)
    {
        System.out.println("*******"+billboard_id);
        return toAjax(BoardService.deleteBoardByids(billboard_id));
    }
}