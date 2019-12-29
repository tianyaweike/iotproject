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
 * @program:  FloodSys
 * @description: 山洪系统
 * @author: 饶泽敏
 * @create: 2019-12-25 15:00
 **/
@Service
public class FloodServiceImpl implements FloodService {
    @Autowired
    private FloodMapper floodMapper;

    /**
     * 查询山洪记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Flood> selectFloodList(Flood flood) {
        return floodMapper.selectFloodList(flood);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteFloodByids(String place_id) {
        return floodMapper.deleteFloodByids(Convert.toStrArray(place_id));
    }

    /**
     * 添加山洪公告数据
     * @param  Flood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertFlood(Flood flood) {
        return floodMapper.insertFlood(flood);
    }

    /**
     * 根据place_id选择数据
     * @param place_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Flood selectByid(String place_id) {
        return floodMapper.selectByid(place_id);
    }

    /**
     * 删除山洪信息
     * @param Flood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteFloodByid(String place_id) {
        return floodMapper.deleteFloodByid(place_id);
    }

    /**
     * 保存用户修改
     * @param Flood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updateFlood(Flood flood) {
        return floodMapper.updateFlood(flood);
    }
}
