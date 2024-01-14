package com.example.drink.service;

import com.example.drink.DAO.mapper.StoreMapper;
import com.example.drink.model.StoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<StoreModel> getStoreByArea(String area){
        return jdbcTemplate.query ("select * from store where s_area=?",
                new Object[]{area}, new StoreMapper ());
    }
}
