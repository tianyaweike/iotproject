package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Blowdown;

import java.util.List;


public interface BlowdownService {
    /**
     * 查询排污记录列表
     *
     * @return
     */
    public List<Blowdown> selectBlowdownList(Blowdown blowdown);

    /**
     * 根据pid批量删除数据
     *
     */
    public int deleteBlowdownByids(String ids);

    /**
     * 添加排污公告数据
     *
     */
    public int insertBlowdown(Blowdown blowdown);
    /**
     * 根据pid选择数据
     *
     */
    public Blowdown selectBypid(String pid);
    /**
     * 保存用户修改
     *
     */
    public int updateBlowdown(Blowdown blowdown);
    /**
     * 删除排污信息
     *
     */
    public int deleteBlowdownByid(String pid);
}
