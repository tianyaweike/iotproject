package com.ruoyi.iot.service;


import com.ruoyi.iot.domain.Broad;

import java.util.List;

/**
 * @program: BroadSys
 * @description: 广播系统
 * @author: 饶泽敏
 * @create: 2019-12-24 15:40
 **/


public interface BroadService {
    /**
     * 查询广播记录列表
     *
     * @return
     */
    public List<Broad> selectBroadList(Broad broad);

    /**
     * 根据broad_id批量删除数据
     * @param id
     */
    public int deleteBroadByids(String broad_id);

    /**
     * 添加广播公告数据
     * @param  Broad
     * @return
     */
    public int insertBroad(Broad broad);
    /**
     * 根据infoid选择数据
     * @param broad_id
     * @return
     */
    public Broad selectBybroad_id(String broad_id);
    /**
     * 保存用户修改
     * @param Broad
     * @return
     */
    public int updateBroad(Broad Broad);
    /**
     * 删除广播信息
     * @param broad_id
     * @return
     */
    public int deleteBroadByIds(String broad_id);
}
