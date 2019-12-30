package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Meteor;

import java.util.List;
/**
 * @program: MeteorSys
 * @description: 气象系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:50
 **/
public interface MeteorService {
    /**
     * 查询气象记录列表
     *
     * @return
     */
    public List<Meteor> selectMeteorList(Meteor meteor);

    /**
     * 根据weather_id批量删除数据
     * @param id
     */
    public int deleteMeteorByids(String[] weather_id);

    /**
     * 添加气象公告数据
     * @param  Meteor
     * @return
     */
    public int insertMeteor(Meteor meteor);
    /**
     * 根据weather_id选择数据
     * @param weather_id
     * @return
     */
    public Meteor selectByid(String weather_id);
    /**
     * 保存用户修改
     * @param Meteor
     * @return
     */
    public int updateMeteor(Meteor meteor);
    /**
     * 删除气象信息
     * @param weather_id
     * @return
     */
    public int deleteMeteorByid(String weather_id);
}