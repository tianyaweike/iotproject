package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.domain.Flood;
import com.ruoyi.iot.mapper.FloodMapper;
import com.ruoyi.iot.service.FloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  MountainfloodSys
 * @description: 山洪系统
 * @author: 饶泽敏
 * @create: 2019-12-25 15:00
 **/
@Service
public class FloodServiceImpl implements FloodService {
    @Autowired
    private FloodMapper mountainfloodMapper;

    /**
     * 查询山洪记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Flood> selectMountainfloodList(Flood mountainflood) {
        return mountainfloodMapper.selectMountainfloodList(mountainflood);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteMountainfloodByids(String place_id) {
        return mountainfloodMapper.deleteMountainfloodByids(Convert.toStrArray(place_id));
    }

    /**
     * 添加山洪公告数据
     * @param  Mountainflood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertMountainflood(Flood mountainflood) {
        return mountainfloodMapper.insertMountainflood(mountainflood);
    }

    /**
     * 根据place_id选择数据
     * @param place_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Flood selectByplace_id(String place_id) {
        return mountainfloodMapper.selectByplace_id(place_id);
    }

    /**
     * 删除山洪信息
     * @param Mountainflood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteMountainfloodByIds(String place_id) {
        return mountainfloodMapper.deleteMountainfloodByIds(place_id);
    }

    /**
     * 保存用户修改
     * @param Mountainflood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateMountainflood(Flood mountainflood) {
        return mountainfloodMapper.updateMountainflood(mountainflood);
    }
}