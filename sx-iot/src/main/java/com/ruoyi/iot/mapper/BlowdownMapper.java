package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Blowdown;

import java.util.List;
public interface BlowdownMapper {
    /**
     * 排污检测记录列表
     *
     * @return
     */
    List<Blowdown> selectBlowdownList(Blowdown blowdown);

    /**
     * 根据pid批量删除数据
     * @param pid
     */
    int deleteBlowdownByids(String[] pid);

    /**
     * 添加排污检测信息
     * @param blowdown
     * @return
     */
    int insertBlowdown(Blowdown blowdown);

    /**
     * 根据pid选择数据
     * @param pid
     * @return
     */
    Blowdown selectBypid(String pid);

    /**
     * 保存用户修改
     * @param blowdown
     * @return
     */
    int updateBlowdown(Blowdown blowdown);

    /**
     * 删除排污检测信息
     * @param pid
     * @return
     */
    int deleteBlowdownById(String pid);
}
