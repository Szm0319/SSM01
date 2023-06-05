package com.service;

import com.entity.City;
import com.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityMapper cityMapper;

    @Autowired
    public CityService(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public List<City> getAllCities() {
        return cityMapper.getAllCities();
    }

    // 其他业务逻辑方法
}
