package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Environl;

import java.util.List;
public interface EnvironlMapper {
    /**
     * 环境终端检测记录列表
     *
     * @return
     */
    List<Environl> selectEnvironlList(Environl environl);

    /**
     * 根据hid批量删除数据
     * @param hid
     */
    int deleteEnvironlByids(String[] hid);

    /**
     * 添加环境终端检测信息
     * @param environl
     * @return
     */
    int insertEnvironl(Environl environl);

    /**
     * 根据hid选择数据
     * @param hid
     * @return
     */
    Environl selectByid(String hid);

    /**
     * 保存用户修改
     * @param environl
     * @return
     */
    int updateEnvironl(Environl environl);

    /**
     * 删除环境终端检测信息
     * @param hid
     * @return
     */
    int deleteEnvironlByid(String hid);
}
