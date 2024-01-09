package com.example.drink.service;

import com.example.drink.Dao.StoreRepository;
import com.example.drink.Dao.mapper.StoreMapper;
import com.example.drink.model.StoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class StoreService {
    @Autowired
    StoreRepository storeRepository;


    public List<StoreModel> getStoreByArea(String area){
        return storeRepository.getStoreByArea(area);
    }
}
