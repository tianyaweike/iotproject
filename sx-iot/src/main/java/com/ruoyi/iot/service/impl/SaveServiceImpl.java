package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.SaveService;
import com.ruoyi.iot.domain.Save;
import com.ruoyi.iot.mapper.SaveMapper;
import com.ruoyi.iot.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SaveSys
 * @description: 安防惯例
 * @author: 饶泽敏
 * @create: 2019-12-24 15:40
 **/
@Service
public class SaveServiceImpl implements SaveService {
    @Autowired
    private SaveMapper saveMapper;

    /**
     * 查询安防记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Save> selectSaveList(Save save) {
        return saveMapper.selectSaveList(save);
    }

    /**
     * 根据id删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteSaveByids(String info_id) {
        return saveMapper.deleteSaveByids(Convert.toStrArray(info_id));
    }

    /**
     * 添加安防公告数据
     * @param  Save
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertSave(Save save) {
        return saveMapper.insertSave(save);
    }

    /**
     * 根据info_id选择数据
     * @param info_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Save selectByinfo_id(String info_id) {
        return saveMapper.selectByinfo_id(info_id);
    }

    /**
     * 批量删除安防信息
     * @param Save
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteSaveByIds(String info_id) {
        return saveMapper.deleteSaveByIds(info_id);
    }

    /**
     * 保存用户修改
     * @param Save
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateSave(Save save) {
        return saveMapper.updateSave(save);
    }

}
