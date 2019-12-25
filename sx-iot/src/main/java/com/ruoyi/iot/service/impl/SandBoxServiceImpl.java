package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.SandBox;
import com.ruoyi.iot.mapper.SandBoxMapper;
import com.ruoyi.iot.service.SandBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  SandBoxSys
 * @description: 沙盘系统
 * @author: 饶泽敏
 * @create: 2019-12-25 15:10
 **/
@Service
public class SandBoxServiceImpl implements SandBoxService{
    @Autowired
    private SandBoxMapper sandBoxMapper;

    /**
     * 查询沙盘记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<SandBox> selectSandBoxList(SandBox sandBox) {
        return sandBoxMapper.selectSandBoxList(sandBox);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteSandBoxByids(String switch_id) {
        return sandBoxMapper.deleteSandBoxByids(Convert.toStrArray(switch_id));
    }

    /**
     * 添加沙盘公告数据
     * @param  SandBox
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertSandBox(SandBox sandBox) {
        return sandBoxMapper.insertSandBox(sandBox);
    }

    /**
     * 根据switch_id选择数据
     * @param switch_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public SandBox selectByswitch_id(String switch_id) {
        return sandBoxMapper.selectByswitch_id(switch_id);
    }

    /**
     * 删除沙盘信息
     * @param SandBox
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteSandBoxByIds(String switch_id) {
        return sandBoxMapper.deleteSandBoxByIds(switch_id);
    }

    /**
     * 保存用户修改
     * @param SandBox
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateSandBox(SandBox sandBox) {
        return sandBoxMapper.updateSandBox(sandBox);
    }

}
