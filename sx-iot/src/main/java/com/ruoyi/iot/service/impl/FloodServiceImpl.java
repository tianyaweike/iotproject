package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.domain.Flood;
import com.ruoyi.iot.domain.Floodbytl;
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
    public int deleteFloodByids(String id) {
        return floodMapper.deleteFloodByids(Convert.toStrArray(id));
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
     * 根据id选择数据
     * @param id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Flood selectByid(String id) {
        return floodMapper.selectByid(id);
    }

    /**
     * 删除山洪信息
     * @param Flood
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteFloodByid(String id) {
        return floodMapper.deleteFloodByid(id);
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

    /**
     * 查询山洪监测列表 前20条数据
     *
     * @param envData 山洪监测信息
     * @return 山洪监测集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Flood> selectFloodListLimit(String rid){
        return floodMapper.selectFloodListLimit(rid);
    }

    /**
     * 统计山洪数据总数
     * @author 饶泽敏 teavamc
     * @date 2019/12/30
     * @param []
     * @return int
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int countall(String rid){
        return floodMapper.countall(rid);
    }


    /**
     * 根据时间范围和查询条数统计山洪数据
     *
     * @param envData 山洪监测信息
     * @return 山洪监测集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Flood> selectFloodListbytl(Floodbytl floodbytl){
        return floodMapper.selectFloodListbytl(floodbytl);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Flood> selectFloodList1(Flood flood) {
        return floodMapper.selectFloodList1(flood);
    }
}
