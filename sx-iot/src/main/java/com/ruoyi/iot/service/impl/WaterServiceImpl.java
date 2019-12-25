package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.WaterService;
import com.ruoyi.iot.domain.Water;
import com.ruoyi.iot.mapper.WaterMapper;
import com.ruoyi.iot.service.WaterService;
import com.ruoyi.iot.service.WaterService;
import com.ruoyi.iot.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SoilSys
 * @description: 水质系统
 * @author: 饶泽敏
 * @create: 2019-12-25 14:00
 **/
@Service
public class WaterServiceImpl implements WaterService {
    @Autowired
    private WaterMapper waterMapper;

    /**
     * 查询水质记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Water> selectWaterList(Water water) {
        return waterMapper.selectWaterList(water);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteWaterByids(String wid) {
        return waterMapper.deleteWaterByids(Convert.toStrArray(wid));
    }

    /**
     * 添加水质公告数据
     * @param  Water
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertWater(Water water) {
        return waterMapper.insertWater(water);
    }

    /**
     * 根据wid选择数据
     * @param wid
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Water selectBywid(String wid) {
        return waterMapper.selectBywid(wid);
    }

    /**
     * 删除水质信息
     * @param Water
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteWaterByIds(String wid) {
        return waterMapper.deleteWaterByIds(wid);
    }

    /**
     * 保存用户修改
     * @param Water
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateWater(Water water) {
        return waterMapper.updateWater(water);
    }
}
