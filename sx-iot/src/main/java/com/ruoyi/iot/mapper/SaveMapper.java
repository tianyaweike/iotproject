package com.ruoyi.iot.mapper;
import com.ruoyi.iot.domain.Save;
import java.util.List;

public interface SaveMapper {
    /**
     * 安防记录列表
     *
     * @return
     */
    List<Save> selectSaveList(Save save);

    /**
     * 根据info_id删除数据
     * @param info_id
     */
    int deleteSaveByids(String[] info_id);

    /**
     * 添加安防信息
     * @param save
     * @return
     */
    int insertSave(Save save);

    /**
     * 根据info_id选择数据
     * @param info_id
     * @return
     */
    Save selectByinfo_id(String info_id);

    /**
     * 保存用户修改
     * @param save
     * @return
     */
    int updateSave(Save save);

    /**
     * 删除安防信息
     * @param info_id
     * @return
     */
    int deleteSaveByIds(String info_id);
}
