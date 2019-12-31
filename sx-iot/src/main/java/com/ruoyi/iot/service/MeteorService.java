package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Meteor;

import java.util.List;

public interface MeteorService {
    /**
     * 查询气象记录列表
     *
     * @return
     */
    public List<Meteor> selectMeteorList(Meteor meteor);

    /**
     * 根据weather_id批量删除数据
     *
     */
    public int deleteMeteorByids(String[] weather_id);

    /**
     * 添加气象公告数据
     *
     */
    public int insertMeteor(Meteor meteor);
    /**
     * 根据weather_id选择数据
     *
     */
    public Meteor selectByid(String weather_id);
    /**
     * 保存用户修改
     *
     */
    public int updateMeteor(Meteor meteor);
    /**
     * 删除气象信息
     *
     */
    public int deleteMeteorByid(String weather_id);
}
