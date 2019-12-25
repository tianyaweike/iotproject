package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Environl;
import com.ruoyi.iot.mapper.EnvironlMapper;
import com.ruoyi.iot.service.EnvironlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  EnvironlSys
 * @description: 环境系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:30
 **/
@Service
public class EnvironlServiceImpl implements EnvironlService {
    @Autowired
    private EnvironlMapper environlMapper;

    /**
     * 查询环境记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Environl> selectEnvironlList(Environl environl) {
        return environlMapper.selectEnvironlList(environl);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteEnvironlByids(String hid) {
        return environlMapper.deleteEnvironlByids(Convert.toStrArray(hid));
    }

    /**
     * 添加环境公告数据
     * @param  Environl
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertEnvironl(Environl environl) {
        return environlMapper.insertEnvironl(environl);
    }

    /**
     * 根据hid选择数据
     * @param hid
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Environl selectByhid(String hid) {
        return environlMapper.selectByhid(hid);
    }

    /**
     * 删除环境信息
     * @param Environl
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteEnvironlByIds(String hid) {
        return environlMapper.deleteEnvironlByIds(hid);
    }

    /**
     * 保存用户修改
     * @param Environl
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateEnvironl(Environl environl) {
        return environlMapper.updateEnvironl(environl);
    }
}
