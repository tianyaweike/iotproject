package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Energy;
import com.ruoyi.iot.mapper.EnergyMapper;
import com.ruoyi.iot.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  EnergySys
 * @description: 能源管理系统
 * @author: 饶泽敏
 * @create: 2019-12-25 14:20
 **/
@Service
public class EnergyServiceImpl implements EnergyService {
    @Autowired
    private EnergyMapper energyMapper;

    /**
     * 查询能源管理记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Energy> selectEnergyList(Energy energy) {
        return energyMapper.selectEnergyList(energy);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteEnergyByids(String[] eid) {
        return energyMapper.deleteEnergyByids(eid);
    }

    /**
     * 添加能源管理公告数据
     * @param  Energy
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertEnergy(Energy energy) {
        return energyMapper.insertEnergy(energy);
    }

    /**
     * 根据eid选择数据
     * @param eid
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Energy selectByid(String eid) {
        return energyMapper.selectByid(eid);
    }

    /**
     * 删除能源管理信息
     * @param Energy
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteEnergyByid(String eid) {
        return energyMapper.deleteEnergyByid(eid);
    }

    /**
     * 保存用户修改
     * @param Energy
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updateEnergy(Energy energy) {
        return energyMapper.updateEnergy(energy);
    }

}
