package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Environl;

import java.util.List;


public interface EnvironlService {
    /**
     * 查询环境记录列表
     *
     * @return
     */
    public List<Environl> selectEnvironlList(Environl environl);

    /**
     * 根据hid批量删除数据
     *
     */
    public int deleteEnvironlByid(String hid);

    /**
     * 添加环境公告数据
     *
     */
    public int insertEnvironl(Environl environl);
    /**
     * 根据hid选择数据
     *
     */
    public Environl selectByhid(String hid);
    /**
     * 保存用户修改
     *
     */
    public int updateEnvironl(Environl environl);
    /**
     * 删除环境信息
     *
     */
    public int deleteEnvironlByids(String hid);
}