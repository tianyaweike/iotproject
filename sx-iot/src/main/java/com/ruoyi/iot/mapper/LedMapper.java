package com.ruoyi.iot.mapper;
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
     * led终端记录列表
     *
     * @return
     */
    List<Led> selectLedList(Led led);

    /**
     * 根据led_id批量删除数据
     * @param led_id
     */
    int deleteLedByids(String[] led_id);

    /**
     * 添加led终端信息
     * @param led
     * @return
     */
    int insertLed(Led led);

    /**
     * 根据led_id选择数据
     * @param led_id
     * @return
     */
    Led selectByid(String led_id);

    /**
     * 保存用户修改
     * @param led
     * @return
     */
    int updateLed(Led led);

    /**
     * 删除led终端信息
     * @param led_id
     * @return
     */
    int deleteLedByid(String led_id);

}
