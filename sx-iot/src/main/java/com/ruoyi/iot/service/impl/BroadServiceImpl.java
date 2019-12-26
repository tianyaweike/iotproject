package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.BroadService;
import com.ruoyi.iot.domain.Broad;
import com.ruoyi.iot.mapper.BroadMapper;
import com.ruoyi.iot.service.BroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: BroadSys
 * @description: 广播系统
 * @author: 饶泽敏
 * @create: 2019-12-24 15:40
 **/
@Service
public class BroadServiceImpl implements BroadService {
    @Autowired
    private BroadMapper broadMapper;

    /**
     * 查询广播记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Broad> selectBroadList(Broad Broad) {
        return broadMapper.selectBroadList(Broad);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteBroadByids(String broad_id) {
        return broadMapper.deleteBroadByids(Convert.toStrArray(broad_id));
    }

    /**
     * 添加广播公告数据
     * @param  Broad
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertBroad(Broad Broad) {
        return broadMapper.insertBroad(Broad);
    }

    /**
     * 根据broad_id选择数据
     * @param broad_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Broad selectBybroad_id(String broad_id) {
        return broadMapper.selectBybroad_id(broad_id);
    }

    /**
     * 删除广播信息
     * @param Broad
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteBroadByIds(String broad_id) {
        return broadMapper.deleteBroadByIds(broad_id);
    }

    /**
     * 保存用户修改
     * @param Broad
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateBroad(Broad broad) {
        return broadMapper.updateBroad(broad);
    }

}
