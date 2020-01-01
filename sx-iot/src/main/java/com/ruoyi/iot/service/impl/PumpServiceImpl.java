package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Pump;
import com.ruoyi.iot.mapper.PumpMapper;
import com.ruoyi.iot.service.PumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  PumpSys
 * @description: 水泵系统
 * @author: 饶泽敏
 * @create: 2019-12-25 14:40
 **/
@Service
public class PumpServiceImpl implements PumpService{
    @Autowired
    private PumpMapper pumpMapper;

    /**
     * 查询水泵记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Pump> selectPumpList(Pump pump) {
        return pumpMapper.selectPumpList(pump);
    }
    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deletePumpByids(String id) {
        return pumpMapper.deletePumpByids(Convert.toStrArray(id));
    }

    /**
     * 添加水泵公告数据
     * @param  Pump
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertPump(Pump pump) {
        return pumpMapper.insertPump(pump);
    }

    /**
     * 根据id选择数据
     * @param id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Pump selectByid(String id) {
        return pumpMapper.selectByid(id);
    }

    /**
     * 删除水泵信息
     * @param Pump
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deletePumpByid(String id) {
        return pumpMapper.deletePumpByid(id);
    }

    /**
     * 保存用户修改
     * @param Pump
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updatePump(Pump pump) {
        return pumpMapper.updatePump(pump);
    }
}
