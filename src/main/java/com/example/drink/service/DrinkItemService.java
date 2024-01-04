package com.example.drink.service;

import com.example.drink.mapper.DrinkItemMapper;
import com.example.drink.model.DrinkItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkItemService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<DrinkItemModel> getAllOriginal(){
        return jdbcTemplate.query ("select * from menu_original", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllFlavor(){
        return jdbcTemplate.query ("select * from menu_flavor", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllTaste(){
        return jdbcTemplate.query ("select * from menu_taste",new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllMilk(){
        return jdbcTemplate.query ("select * from menu_milk", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllFreshMilk(){
        return jdbcTemplate.query ("select * from menu_freshmilk", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllCheese(){
        return jdbcTemplate.query ("select * from menu_cheese", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllWiterMelon(){
        return jdbcTemplate.query ("select * from menu_wintermelon", new DrinkItemMapper ());
    }
    public  List<DrinkItemModel> getAllMaterials(){
        return jdbcTemplate.query ("select * from add_materials", new DrinkItemMapper ());
    }
}
