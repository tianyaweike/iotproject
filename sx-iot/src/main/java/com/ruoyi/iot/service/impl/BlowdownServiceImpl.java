package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.domain.Blowdown;
import com.ruoyi.iot.mapper.BlowdownMapper;
import com.ruoyi.iot.service.BlowdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlowdownServiceImpl implements BlowdownService {
    @Autowired
    private BlowdownMapper blowdownMapper;

    /**
     * 查询排污记录列表
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Blowdown> selectBlowdownList(Blowdown blowdown) {
        return blowdownMapper.selectBlowdownList(blowdown);
    }

    /**
     * 根据id批量删除数据
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteBlowdownByids(String ids) {
        return blowdownMapper.deleteBlowdownByids(ids);
    }

    /**
     * 添加排污公告数据
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertBlowdown(Blowdown blowdown) {
        return blowdownMapper.insertBlowdown(blowdown);
    }

    /**
     * 根据pid选择数据
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Blowdown selectBypid(String pid) {
        return blowdownMapper.selectBypid(pid);
    }

    /**
     * 删除排污信息
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteBlowdownByid(String pid) {
        return blowdownMapper.deleteBlowdownByid(pid);
    }

    /**
     * 保存用户修改
     *
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updateBlowdown(Blowdown blowdown) {
        return blowdownMapper.updateBlowdown(blowdown);
    }
}
