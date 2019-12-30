package com.ruoyi.village.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.village.domain.Energyshow;
import com.ruoyi.village.domain.pubObjApi;
import com.ruoyi.village.mapper.EnergyshowMapper;
import com.ruoyi.village.service.IEnergyshowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 能源管理终端采集信息 服务层实现
 *
 * @author 薛莎莎
 * @date 2019-11-23
 */
@Service
public class EnergyshowServiceImpl implements IEnergyshowService{
    @Autowired
    private EnergyshowMapper energyshowMapper;
    /**
     * 查询能源管理终端采集信息
     *
     * @param id 能源管理终端采集信息ID
     * @return 能源管理终端采集信息
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Energyshow selectEnergyshowById(Integer id)
    {
        return energyshowMapper.selectEnergyshowById(id);
    }
    /**
     * 查询能源管理终端采集信息列表
     *
     * @param energyshow 能源管理终端采集信息
     * @return 能源管理终端采集信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Energyshow> selectEnergyshowList(Energyshow energyshow) {
        return energyshowMapper.selectEnergyshowList(energyshow);
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Energyshow> selectEnergyshowListById(pubObjApi energyshow) {
        return energyshowMapper.selectEnergyshowListById(energyshow);
    }


}
