package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.domain.Meteor;
import com.ruoyi.iot.mapper.MeteorMapper;
import com.ruoyi.iot.service.MeteorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MeteorServiceImpl implements MeteorService {
    @Autowired
    private MeteorMapper meteorMapper;

    /**
     * 查询气象记录列表
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Meteor> selectMeteorList(Meteor meteor) {
        return meteorMapper.selectMeteorList(meteor);
    }

    /**
     * 根据id批量删除数据
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteMeteorByid(String weather_id) {
        return meteorMapper.deleteMeteorByid(weather_id);
    }

    /**
     * 添加气象公告数据
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertMeteor(Meteor meteor) {
        return meteorMapper.insertMeteor(meteor);
    }

    /**
     * 根据weather_id选择数据
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Meteor selectByweather_id(String weather_id) {
        return meteorMapper.selectByweather_id(weather_id);
    }

    /**
     * 删除气象信息
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteMeteorByids(String weather_id) {
        return meteorMapper.deleteMeteorByids(Convert.toStrArray(weather_id));
    }

    /**
     * 保存用户修改
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updateMeteor(Meteor meteor) {
        return meteorMapper.updateMeteor(meteor);
    }
}
