package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.IotgetPa;
import com.ruoyi.iot.domain.Led;

import java.util.List;

/**
 * 终端运转 数据层
 *
 * @author 高彭
 * @date 2019-12-20
 */
public interface LedMapper {
    /**
     * 查询终端运转信息
     *
     * @param led_id 终端运转ID
     * @return 终端运转信息
     */
    public Led selectLedById(Integer led_id);

    /**
     * 统计物联网数据条目
     *
     * @param led_id 终端运转ID
     * @return 终端运转信息
     */
    public int countall();

    /**
     * 统计物联网设备数量
     *
     * @param led_id 终端运转ID
     * @return 终端运转信息
     */
    public int devicecount();

    /**
     * 查询终端运转列表
     *
     * @param led 终端运转信息
     * @return 终端运转集合
     */
    public List<Led> selectLedList(Led led);

    /**
     * 新增终端运转
     *
     * @param led 终端运转信息
     * @return 结果
     */
    public int insertLed(Led led);

    /**
     * 修改终端运转
     *
     * @param led 终端运转信息
     * @return 结果
     */
    public int updateLed(Led led);

    /**
     * 删除终端运转
     *
     * @param led_id 终端运转ID
     * @return 结果
     */
    public int deleteLedById(Integer led_id);

    /**
     * 批量删除终端运转
     *
     * @param led_ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLedByIds(String[] led_ids);

    /**
     * 根据IMEI号和时间范围和查询条数统计物联网数据
     *
     * @param led 终端信息
     * @return 终端信息集合
     */
    public List<Led> selectLedByitl(IotgetPa iotgetPa);
}
