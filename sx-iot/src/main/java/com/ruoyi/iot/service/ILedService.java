package com.ruoyi.iot.service;


import com.ruoyi.iot.domain.IotgetPa;
import com.ruoyi.iot.domain.Led;
import java.util.List;
public interface ILedService {

    /**
     * 查询终端运转信息
     *
     * @param dataid 终端运转ID
     * @return 终端运转信息
     */
    public Led selectLedById(Integer Led_id);


    /**
     * 统计物联网数据条目
     *
     * @param dataid 终端运转ID
     * @return 终端运转信息
     */
    public int countall();

    /**
     * 统计物联网设备数量
     *
     * @param dataid 终端运转ID
     * @return 终端运转信息
     */
    public int devicecount();

    /**
     * 查询终端运转列表
     *
     * @param Led 终端运转信息
     * @return 终端运转集合
     */
    public List<Led> selectLedList(Led led);

    /**
     * 新增终端运转
     *
     * @param Led 终端运转信息
     * @return 结果
     */
    public int insertLed(Led led);

    /**
     * 修改终端运转
     *
     * @param Led 终端运转信息
     * @return 结果
     */
    public int updateLed(Led led);

    /**
     * 删除终端运转信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLedByIds(String ids);

    /**
     * 根据IMEI号和时间范围和查询条数统计物联网数据
     *
     * @param Led 终端信息
     * @return 终端信息集合
     */
    public List<Led> selectLedByitl(IotgetPa iotgetPa);
}
