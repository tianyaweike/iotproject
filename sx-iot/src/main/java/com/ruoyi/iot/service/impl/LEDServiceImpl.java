package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.LEDgetPa;
import com.ruoyi.iot.mapper.LEDMapper;
import com.ruoyi.iot.service.ILEDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iot.domain.LED;
import com.ruoyi.common.support.Convert;


@Service
public class LEDServiceImpl implements ILEDService {
    @Autowired
    private LEDMapper LEDMapper;
    /**
     * 查询终端运转信息
     *
     * @param LED_id 终端运转ID
     * @return 终端运转信息
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public LED selectLedById(String LED_id)
    {
        return LEDMapper.selectLedById(LED_id);
    }

    /**
     * 查询终端运转列表
     *
     * @param LED 终端运转信息
     * @return 终端运转集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<LED> selectLedList(LED LED)
    {
        return LEDMapper.selectLedList(LED);
    }

    /**
     * 新增终端运转
     *
     * @param LED 终端运转信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int insertLed(LED LED)
    {
        return LEDMapper.insertLed(LED);
    }

    /**
     * 修改终端运转
     *
     * @param torrent 终端运转信息
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int updateLed(LED LED)
    {
        return LEDMapper.updateLed(LED);
    }

    /**
     * 删除终端运转对象
     *
     * @param id 需要删除的数据ID
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteLedById(String id)
    {
        return LEDMapper.deleteLedById(id);
    }

    /**
     * 删除终端运转对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public int deleteLedByIds(String led_ids)
    {
        return LEDMapper.deleteLedByIds(led_ids);
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
        return LEDMapper.countall();
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
        return LEDMapper.devicecount();
    }

    /**
     * 根据IMEI号和时间范围和查询条数统计物联网数据
     *
     * @param LED 终端信息
     * @return 终端信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<LED> selectLedByitl(LEDgetPa ledgetPa)
    {
        return LEDMapper.selectLedByitl(ledgetPa);
    }
}