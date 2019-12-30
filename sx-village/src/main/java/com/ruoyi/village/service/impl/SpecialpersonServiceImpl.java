package com.ruoyi.village.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Specialperson;
import com.ruoyi.village.domain.pubObjApi;
import com.ruoyi.village.mapper.SpecialpersonMapper;
import com.ruoyi.village.service.ISpecialpersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 特殊人员监控表管理 服务层实现
 *
 * @author 薛莎莎
 * @date 2019-12-15
 */
@Service
public class SpecialpersonServiceImpl implements ISpecialpersonService {
    @Autowired
    private SpecialpersonMapper specialpersonMapper;


    @Override
    public Specialperson selectSpecialpersonById(Integer id) {
        return specialpersonMapper.selectSpecialpersonById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Specialperson> selectSpecialpersonList(Specialperson specialperson) {
        return specialpersonMapper.selectSpecialpersonList(specialperson);
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Specialperson> selectSpecialpersonListById(pubObjApi specialperson) {
        return specialpersonMapper.selectSpecialpersonListById(specialperson);
    }
}
