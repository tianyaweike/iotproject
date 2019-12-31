package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Fire;
import java.util.List;
public interface FireMapper {
    /**
     * 火灾探头终端记录列表
     *
     * @return
     */
    List<Fire> selectFireList(Fire fire);

    /**
     * 根据fid批量删除数据
     * @param fid
     */
    int deleteFireByids(String[] fid);
    /**
     * 添加火灾探头终端信息
     * @param fire
     * @return
     */
    int insertFire(Fire fire);
    /**
     * 根据fid选择数据
     * @param fid
     * @return
     */
    Fire selectByid(String fid);

    /**
     * 保存用户修改
     * @param fire
     * @return
     */
    int updateFire(Fire fire);
    /**
     * 删除火灾探头终端信息
     * @param fid
     * @return
     */
    int deleteFireByid(String fid);
}