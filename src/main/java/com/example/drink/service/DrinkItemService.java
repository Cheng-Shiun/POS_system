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
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='original'", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllFlavor(){
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='flavor'", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllTaste(){
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='taste'",new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllMilk(){
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='milk'", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllFreshMilk(){
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='鮮奶茶'", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllCheese(){
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='freshMilk'", new DrinkItemMapper ());
    }
    public List<DrinkItemModel> getAllWiterMelon(){
        return jdbcTemplate.query ("select product,price from javateamenu WHERE TYPE='winterMelo'", new DrinkItemMapper ());
    }
    public  List<DrinkItemModel> getAllMaterials(){
        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='addMaterials'", new DrinkItemMapper ());
    }
//    public  List<DrinkItemModel> getAllTypes(){
//        return jdbcTemplate.query ("select product,price from javateamenu WHERE type='type'", new DrinkItemMapper ());
//    }
}
