package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Flood;

import java.util.List;
public interface FloodMapper {
    /**
     * 山洪灾害记录列表
     *
     * @return
     */
    List<Flood> selectFloodList(Flood flood);

    /**
     * 根据place_id删除数据
     * @param place_id
     */
    int deleteFloodByids(String[] place_id);

    /**
     * 添加山洪灾害信息
     * @param flood
     * @return
     */
    int insertFlood(Flood flood);

    /**
     * 根据place_id选择数据
     * @param place_id
     * @return
     */
    Flood selectByplace_id(String place_id);

    /**
     * 保存用户修改
     * @param flood
     * @return
     */
    int updateFlood(Flood flood);

    /**
     * 删除山洪灾害信息
     * @param place_id
     * @return
     */
    int deleteFloodByIds(String place_id);
}
