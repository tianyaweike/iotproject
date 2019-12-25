package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Soil;

import java.util.List;
/**
 * @program: SoilSys
 * @description: 土壤系统
 * @author: 饶泽敏
 * @create: 2019-12-25 13:40
 **/
public interface SoilService {
    /**
     * 查询土壤记录列表
     *
     * @return
     */
    public List<Soil> selectSoilList(Soil soil);

    /**
     * 根据sid批量删除数据
     * @param id
     */
    public int deleteSoilByids(String sid);

    /**
     * 添加土壤公告数据
     * @param  Soil
     * @return
     */
    public int insertSoil(Soil soil);
    /**
     * 根据sid选择数据
     * @param sid
     * @return
     */
    public Soil selectBysid(String sid);
    /**
     * 保存用户修改
     * @param Soil
     * @return
     */
    public int updateSoil(Soil soil);
    /**
     * 删除土壤信息
     * @param sid
     * @return
     */
    public int deleteSoilByIds(String sid);
}
