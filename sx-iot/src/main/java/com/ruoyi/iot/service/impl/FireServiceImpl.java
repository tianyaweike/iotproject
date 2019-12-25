package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Fire;
import com.ruoyi.iot.mapper.FireMapper;
import com.ruoyi.iot.service.FireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  FireSys
 * @description: 火灾系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:20
 **/
@Service
public class FireServiceImpl implements FireService {
    @Autowired
    private FireMapper fireMapper;

    /**
     * 查询火灾记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Fire> selectFireList(Fire fire) {
        return fireMapper.selectFireList(fire);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteFireByids(String fid) {
        return fireMapper.deleteFireByids(Convert.toStrArray(fid));
    }

    /**
     * 添加火灾公告数据
     * @param  Fire
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertFire(Fire fire) {
        return fireMapper.insertFire(fire);
    }

    /**
     * 根据fid选择数据
     * @param fid
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Fire selectByfid(String fid) {
        return fireMapper.selectByfid(fid);
    }

    /**
     * 删除火灾信息
     * @param Fire
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteFireByIds(String fid) {
        return fireMapper.deleteFireByIds(fid);
    }

    /**
     * 保存用户修改
     * @param Fire
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateFire(Fire fire) {
        return fireMapper.updateFire(fire);
    }
}
