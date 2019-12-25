package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Pollution;
import com.ruoyi.iot.mapper.PollutionMapper;
import com.ruoyi.iot.service.PollutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  PollutionSys
 * @description: 排污系统
 * @author: 饶泽敏
 * @create: 2019-12-25 19:20
 **/
@Service
public class PollutionServiceImpl implements PollutionService{
    @Autowired
    private PollutionMapper pollutionMapper;

    /**
     * 查询排污记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Pollution> selectPollutionList(Pollution pollution) {
        return pollutionMapper.selectPollutionList(pollution);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deletePollutionByids(String pid) {
        return pollutionMapper.deletePollutionByids(Convert.toStrArray(pid));
    }

    /**
     * 添加排污公告数据
     * @param  Pollution
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertPollution(Pollution pollution) {
        return pollutionMapper.insertPollution(pollution);
    }

    /**
     * 根据pid选择数据
     * @param pid
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Pollution selectBypid(String pid) {
        return pollutionMapper.selectBypid(pid);
    }

    /**
     * 删除排污信息
     * @param Pollution
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deletePollutionByIds(String pid) {
        return pollutionMapper.deletePollutionByIds(pid);
    }

    /**
     * 保存用户修改
     * @param Pollution
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updatePollution(Pollution pollution) {
        return pollutionMapper.updatePollution(pollution);
    }
}
