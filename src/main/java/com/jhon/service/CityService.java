package com.jhon.service;

import com.jhon.domain.City;

/**
 * <p>功能描述</br> 城市业务逻辑接口类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CityService
 * @date 2017/7/1 11:30
 */
public interface CityService {
    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    City findCityById(Long id);

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     *
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
