package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.IotgetPa;
import com.ruoyi.iot.mapper.LedMapper;
import com.ruoyi.iot.service.ILedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iot.domain.Led;
import com.ruoyi.common.support.Convert;
@Service
public class LedServiceImpl implements ILedService {
    @Autowired
    private LedMapper ledMapper;
    /**
     * 查询终端运转信息
     *
     * @param Led 终端运转ID
     * @return 终端运转信息
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Led selectLedById(Integer Led_id)
    {
        return ledMapper.selectLedById(Led_id);
    }

    /**
     * 查询终端运转列表
     *
     * @param Led 终端运转信息
     * @return 终端运转集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Led> selectLedList(Led led)
    {
        return ledMapper.selectLedList(led);
    }

    /**
     * 新增终端运转
     *
     * @param Led 终端运转信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertLed(Led led)
    {
        return ledMapper.insertLed(led);
    }

    /**
     * 修改终端运转
     *
     * @param torrent 终端运转信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updateLed(Led led)
    {
        return ledMapper.updateLed(led);
    }

    /**
     * 删除终端运转对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteLedByIds(String ids)
    {
        return ledMapper.deleteLedByIds(Convert.toStrArray(ids));
    }

    /**
     * 统计物联网数据条目
     *
     * @param dataid 终端运转ID
     * @return 终端运转信息
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int countall(){
        return ledMapper.countall();
    }

    /**
     * 统计物联网设备数量
     *
     * @param dataid 终端运转ID
     * @return 终端运转信息
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int devicecount(){
        return ledMapper.devicecount();
    }

    /**
     * 根据IMEI号和时间范围和查询条数统计物联网数据
     *
     * @param Led 终端信息
     * @return 终端信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Led> selectTorrentByitl(IotgetPa iotgetPa)
    {
        return ledMapper.selectLedByitl(iotgetPa);
    }
}
