package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Meteor;
import java.util.List;
public interface MeteorMapper {
    /**
     * 气象监测记录列表
     *
     * @return
     */
    List<Meteor> selectMeteorList(Meteor meteor);
    /**
     * 根据weather_id批量删除数据
     * @param weather_id
     */
    int deleteMeteorByids(String[] weather_id);
    /**
     * 添加气象监测信息
     * @param meteor
     * @return
     */
    int insertMeteor(Meteor meteor);
    /**
     * 根据weather_id选择数据
     * @param weather_id
     * @return
     */
    Meteor selectByweather_id(String weather_id);

    /**
     * 保存用户修改
     * @param meteor
     * @return
     */
    int updateMeteor(Meteor meteor);
    /**
     * 删除气象监测信息
     * @param weather_id
     * @return
     */
    int deleteMeteorByid(String weather_id);
}