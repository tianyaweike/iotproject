package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Environl;

import java.util.List;
/**
 * @program: EnvironlSys
 * @description: 环境系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:30
 **/

public interface EnvironlService {
    /**
     * 查询环境记录列表
     *
     * @return
     */
    public List<Environl> selectEnvironlList(Environl environl);

    /**
     * 根据hid批量删除数据
     * @param id
     */
    public int deleteEnvironlByids(String hid);

    /**
     * 添加环境公告数据
     * @param  Environl
     * @return
     */
    public int insertEnvironl(Environl environl);
    /**
     * 根据hid选择数据
     * @param hid
     * @return
     */
    public Environl selectByhid(String hid);
    /**
     * 保存用户修改
     * @param Environl
     * @return
     */
    public int updateEnvironl(Environl environl);
    /**
     * 删除环境信息
     * @param hid
     * @return
     */
    public int deleteEnvironlByIds(String hid);
}
