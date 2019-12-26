package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Flood;

import java.util.List;
/**
 * @program: MountainfloodSys
 * @description: 山洪系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:00
 **/
public interface FloodService {
    /**
     * 查询山洪记录列表
     *
     * @return
     */
    public List<Flood> selectMountainfloodList(Flood mountainflood);

    /**
     * 根据place_id批量删除数据
     * @param id
     */
    public int deleteMountainfloodByids(String place_id);

    /**
     * 添加山洪公告数据
     * @param  Mountainflood
     * @return
     */
    public int insertMountainflood(Flood mountainflood);
    /**
     * 根据place_id选择数据
     * @param place_id
     * @return
     */
    public Flood selectByplace_id(String place_id);
    /**
     * 保存用户修改
     * @param Mountainflood
     * @return
     */
    public int updateMountainflood(Flood mountainflood);
    /**
     * 删除山洪信息
     * @param place_id
     * @return
     */
    public int deleteMountainfloodByIds(String place_id);
}