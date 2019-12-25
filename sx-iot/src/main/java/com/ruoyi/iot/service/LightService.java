package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Light;

import java.util.List;
/**
 * @program: LightSys
 * @description: 路灯系统
 * @author: 饶泽敏
 * @create: 2019-12-25 14:40
 **/
public interface LightService {
    /**
     * 查询路灯记录列表
     *
     * @return
     */
    public List<Light> selectLightList(Light light);

    /**
     * 根据nid批量删除数据
     * @param id
     */
    public int deleteLightByids(String nid);

    /**
     * 添加路灯公告数据
     * @param  Light
     * @return
     */
    public int insertLight(Light light);
    /**
     * 根据nid选择数据
     * @param nid
     * @return
     */
    public Light selectBynid(String nid);
    /**
     * 保存用户修改
     * @param Light
     * @return
     */
    public int updateLight(Light light);
    /**
     * 删除路灯信息
     * @param nid
     * @return
     */
    public int deleteLightByIds(String nid);
}
