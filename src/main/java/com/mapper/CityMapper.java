package com.mapper;

import com.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CityMapper {
    City getCityById(int id);
    // 其他数据库操作方法
    void insertCity(City city);
    void updateCity(City city);
    void deleteCity(int cityId);

    List<City> getAllCities();
}
