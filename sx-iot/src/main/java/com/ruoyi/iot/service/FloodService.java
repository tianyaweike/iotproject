package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Flood;

import java.util.List;
/**
 * @program: FloodSys
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
    public List<Flood> selectFloodList(Flood flood);

    /**
     * 根据place_id批量删除数据
     * @param id
     */
    public int deleteFloodByids(String place_id);

    /**
     * 添加山洪公告数据
     * @param  Flood
     * @return
     */
    public int insertFlood(Flood flood);
    /**
     * 根据place_id选择数据
     * @param place_id
     * @return
     */
    public Flood selectByid(String place_id);
    /**
     * 保存用户修改
     * @param Flood
     * @return
     */
    public int updateFlood(Flood flood);
    /**
     * 删除山洪信息
     * @param place_id
     * @return
     */
    public int deleteFloodByid(String place_id);
}