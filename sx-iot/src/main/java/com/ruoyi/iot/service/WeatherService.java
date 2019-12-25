package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Weather;

import java.util.List;
/**
 * @program: WeatherSys
 * @description: 气象系统
 * @author: 饶泽敏
 * @create: 2019-12-25 17:50
 **/
public interface WeatherService {
    /**
     * 查询气象记录列表
     *
     * @return
     */
    public List<Weather> selectWeatherList(Weather weather);

    /**
     * 根据weather_id批量删除数据
     * @param id
     */
    public int deleteWeatherByids(String weather_id);

    /**
     * 添加气象公告数据
     * @param  Weather
     * @return
     */
    public int insertWeather(Weather weather);
    /**
     * 根据weather_id选择数据
     * @param weather_id
     * @return
     */
    public Weather selectByweather_id(String weather_id);
    /**
     * 保存用户修改
     * @param Weather
     * @return
     */
    public int updateWeather(Weather weather);
    /**
     * 删除气象信息
     * @param weather_id
     * @return
     */
    public int deleteWeatherByIds(String weather_id);
}
