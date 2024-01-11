package com.example.drink.service;

import com.example.drink.DAO.mapper.DrinkItemMapper;
import com.example.drink.model.DrinkItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkItemService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<DrinkItemModel> getAllByType(String type){
        return jdbcTemplate.query ("select * from javateamenu where type=? ", new DrinkItemMapper (),type);
    }
}
