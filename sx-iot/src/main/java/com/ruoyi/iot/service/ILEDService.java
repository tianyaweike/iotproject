package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.LEDgetPa;
import com.ruoyi.iot.domain.LED;
import java.util.List;

public interface ILEDService {

    /**
     * 查询终端运转列表
     *
     * @param led 终端运转信息
     * @return 终端运转集合
     */
    public List<LED> selectLedList(LED led);
    //public List<LED> selectLedtAll();

    /**
     * 查询终端运转信息
     *
     * @param led_id 终端运转ID
     * @return 终端运转信息
     */
    public LED selectLedById(String led_id);


    /**
     * 统计物联网数据条目
     *
     * @param led_id 终端运转ID
     * @return 终端运转信息
     */
   // public int countall();

    /**
     * 统计物联网设备数量
     *
     * @param led_id 终端运转ID
     * @return 终端运转信息
     */
    //public int devicecount();



    /**
     * 新增终端运转
     *
     * @param led 终端运转信息
     * @return 结果
     */
    public int insertLed(LED led);

    /**
     * 修改终端运转
     *
     * @param led 终端运转信息
     * @return 结果
     */
    public int updateLed(LED led);

    /**
     * 删除终端运转信息
     *
     * @param id 需要删除的数据ID
     * @return 结果
     */
   // public int deleteLedById(String led_id);

    /**
     * 删除终端运转信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     * * @throws Exception 异常
     */
    public int deleteLedByIds(String ids) ;


}
