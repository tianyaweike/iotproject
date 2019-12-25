package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Weather;
import com.ruoyi.iot.mapper.eatherMapper;
import com.ruoyi.iot.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  WeatherSys
 * @description: 气象系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:50
 **/
@Service
public class WeatherServiceImpl implements WeatherService{
    @Autowired
    private WeatherMapper weatherMapper;

    /**
     * 查询气象记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Weather> selectWeatherList(Weather weather) {
        return weatherMapper.selectWeatherList(weather);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteWeatherByids(String weather_id) {
        return weatherMapper.deleteWeatherByids(Convert.toStrArray(weather_id));
    }

    /**
     * 添加气象公告数据
     * @param  Weather
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertWeather(Weather weather) {
        return weatherMapper.insertWeather(weather);
    }

    /**
     * 根据weather_id选择数据
     * @param weather_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Weather selectByweather_id(String weather_id) {
        return weatherMapper.selectByweather_id(weather_id);
    }

    /**
     * 删除气象信息
     * @param Weather
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteWeatherByIds(String weather_id) {
        return weatherMapper.deleteWeatherByIds(weather_id);
    }

    /**
     * 保存用户修改
     * @param Weather
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateWeather(Weather weather) {
        return weatherMapper.updateWeather(weather);
    }
}
