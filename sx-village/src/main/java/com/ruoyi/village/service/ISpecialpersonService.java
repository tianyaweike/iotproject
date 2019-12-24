package com.ruoyi.village.service;

import com.ruoyi.village.domain.Specialperson;
import com.ruoyi.village.domain.pubObjApi;

import java.util.List;

/**
 * 特殊人员监控表管理 服务层
 *
 * @author 薛莎莎
 * @date 2019-12-15
 */
public interface ISpecialpersonService {
    /**
     * 查询特殊人员监控表信息
     *
     * @param id 特殊人员监控表ID
     * @return 特殊人员监控表信息
     */
    public Specialperson selectSpecialpersonById(Integer id);
    /**
     * 查询特殊人员监控表信息列表
     *
     * @param specialperson 特殊人员监控表
     * @return 特殊人员监控表信息集合
     */
    public List<Specialperson> selectSpecialpersonList(Specialperson specialperson);

    public List<Specialperson> selectSpecialpersonListById(pubObjApi specialperson);
}