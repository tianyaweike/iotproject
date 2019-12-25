package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.SandBox;

import java.util.List;
/**
 * @program: SandBoxSys
 * @description: 沙盘系统
 * @author: 饶泽敏
 * @create: 2019-12-25 15:20
 **/

public interface  SandBoxService {
    /**
     * 查询沙盘记录列表
     *
     * @return
     */
    public List<SandBox> selectSandBoxList(SandBox sandBox);

    /**
     * 根据switch_id批量删除数据
     * @param switch_id
     */
    public int deleteSandBoxByids(String switch_id);

    /**
     * 添加沙盘公告数据
     * @param  SandBox
     * @return
     */
    public int insertSandBox(SandBox sandBox);
    /**
     * 根据switch_id选择数据
     * @param switch_id
     * @return
     */
    public SandBox selectByswitch_id(String switch_id);
    /**
     * 保存用户修改
     * @param SandBox
     * @return
     */
    public int updateSandBox(SandBox sandBox);
    /**
     * 删除沙盘信息
     * @param switch_id
     * @return
     */
    public int deleteSandBoxByIds(String switch_id);
}
