package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Pollution;

import java.util.List;
/**
 * @program: PollutionSys
 * @description: 排污系统
 * @author: 饶泽敏
 * @create: 2019-12-25 19:20
 **/

public interface PollutionService {
    /**
     * 查询排污记录列表
     *
     * @return
     */
    public List<Pollution> selectPollutionList(Pollution pollution);

    /**
     * 根据pid批量删除数据
     * @param id
     */
    public int deletePollutionByids(String pid);

    /**
     * 添加排污公告数据
     * @param  Pollution
     * @return
     */
    public int insertPollution(Pollution pollution);
    /**
     * 根据pid选择数据
     * @param pid
     * @return
     */
    public Pollution selectBypid(String pid);
    /**
     * 保存用户修改
     * @param Pollution
     * @return
     */
    public int updatePollution(Pollution pollution);
    /**
     * 删除排污信息
     * @param pid
     * @return
     */
    public int deletePollutionByIds(String pid);
}
