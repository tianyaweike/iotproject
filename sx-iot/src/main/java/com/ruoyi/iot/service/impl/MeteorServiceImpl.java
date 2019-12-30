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

/**
 * @program:  MeteorSys
 * @description: 气象系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:50
 **/
@Service
public class MeteorServiceImpl implements MeteorService {
    @Autowired
    private MeteorMapper meteorMapper;

    /**
     * 查询气象记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Meteor> selectMeteorList(Meteor meteor) {
        return meteorMapper.selectMeteorList(meteor);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteMeteorByids(String[] weather_id) {
        return meteorMapper.deleteMeteorByids(weather_id);
    }

    /**
     * 添加气象公告数据
     * @param  Meteor
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertMeteor(Meteor meteor) {
        return meteorMapper.insertMeteor(meteor);
    }

    /**
     * 根据weather_id选择数据
     * @param weather_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Meteor selectByid(String weather_id) {
        return meteorMapper.selectByid(weather_id);
    }

    /**
     * 删除气象信息
     * @param Meteor
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteMeteorByid(String weather_id) {
        return meteorMapper.deleteMeteorByid(weather_id);
    }

    /**
     * 保存用户修改
     * @param Meteor
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateMeteor(Meteor meteor) {
        return meteorMapper.updateMeteor(meteor);
    }
}
