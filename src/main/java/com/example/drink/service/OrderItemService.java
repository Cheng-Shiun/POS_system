package com.example.drink.service;

import com.example.drink.mapper.DrinkItemMapper;
import com.example.drink.mapper.OrderItemMapper;
import com.example.drink.model.DrinkItemModel;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public  List<OrderItemModel> getAllTypes(){
        return jdbcTemplate.query ("SELECT type FROM javateamenu GROUP BY TYPE", new OrderItemMapper());
    }
}
