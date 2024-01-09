package com.example.drink.Dao;

import com.example.drink.Dao.mapper.StoreMapper;
import com.example.drink.model.StoreModel;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<StoreModel> getStoreByArea(String area){
        //取資料 回傳
        return jdbcTemplate.query("SELECT * FROM store WHERE s_area=?", new StoreMapper(),  area);
    }
}
