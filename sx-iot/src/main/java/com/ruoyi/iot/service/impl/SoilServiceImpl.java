package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.SoilService;
import com.ruoyi.iot.domain.Soil;
import com.ruoyi.iot.mapper.SoilMapper;
import com.ruoyi.iot.service.SoilService;
import com.ruoyi.iot.service.SoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SoilSys
 * @description: 土壤系统
 * @author: 饶泽敏
 * @create: 2019-12-25 13:40
 **/
@Service
public class SoilServiceImpl implements SoilService {
    @Autowired
    private SoilMapper soilMapper;

    /**
     * 查询土壤记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Soil> selectSoilList(Soil soil) {
        return soilMapper.selectSoilList(soil);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteSoilByids(String sid) {
        return soilMapper.deleteSoilByids(Convert.toStrArray(sid));
    }

    /**
     * 添加土壤公告数据
     * @param  Soil
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertSoil(Soil soil) {
        return soilMapper.insertSoil(soil);
    }

    /**
     * 根据sid选择数据
     * @param sid
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Soil selectBysid(String sid) {
        return soilMapper.selectBysid(sid);
    }

    /**
     * 删除土壤信息
     * @param Soil
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteSoilByIds(String sid) {
        return soilMapper.deleteSoilByIds(sid);
    }

    /**
     * 保存用户修改
     * @param Soil
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateSoil(Soil soil) {
        return soilMapper.updateSoil(soil);
    }

}
