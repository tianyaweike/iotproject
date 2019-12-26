package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Broad;

import java.util.List;
public interface BroadMapper {
    /**
     * 广播记录列表
     *
     * @return
     */
    List<Broad> selectBroadList(Broad broad);

    /**
     * 根据broad_id批量删除数据
     * @param broad_id
     */
    int deleteBroadByids(String[] broad_id);

    /**
     * 添加广播信息
     * @param broad
     * @return
     */
    int insertBroad(Broad broad);

    /**
     * 根据broad_id选择数据
     * @param broad_id
     * @return
     */
    Broad selectByid(String broad_id);

    /**
     * 保存用户修改
     * @param broad
     * @return
     */
    int updateBroad(Broad broad);

    /**
     * 删除广播信息
     * @param broad_id
     * @return
     */
    int deleteBroadByid(String broad_id);
}
