package com.jhon.dao;

import com.jhon.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CityDao
 * @date 2017/7/1 11:26
 */
public interface CityDao {
    /**
     *  获取城市信息列表
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市Id查询城市信息
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

    /**
     * 创建信息的城市信息
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     *  根据Id删除城市信息
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
