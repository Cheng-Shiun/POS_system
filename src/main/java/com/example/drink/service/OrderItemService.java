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
//    public List<OrderItemModel> getAllTypes(){
//        return jdbcTemplate.query ("SELECT type FROM javateamenu GROUP BY TYPE", new OrderItemMapper());
//    }

    public List<OrderItemModel> getAllProduct(){
        return jdbcTemplate.query ("select product from javateamenu WHERE TYPE='type'", new OrderItemMapper());
    }

//    public List<OrderItemModel> getAllOriginal(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='原味茶'", new OrderItemMapper ());
//    }
//    public List<OrderItemModel> getAllFlavor(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='風味茶'", new OrderItemMapper ());
//    }
//    public List<OrderItemModel> getAllTaste(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='滋味茶'",new OrderItemMapper ());
//    }
//    public List<OrderItemModel> getAllMilk(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='香醇奶茶'", new OrderItemMapper ());
//    }
//    public List<OrderItemModel> getAllFreshMilk(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='鮮奶茶'", new OrderItemMapper ());
//    }
//    public List<OrderItemModel> getAllCheese(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='芝士奶蓋'", new OrderItemMapper ());
//    }
//    public List<OrderItemModel> getAllWiterMelon(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='冬瓜茶系列'", new OrderItemMapper ());
//    }
//    public  List<OrderItemModel> getAllMaterials(){
//        return jdbcTemplate.query ("select product,price from teamenu WHERE TYPE='addMaterials'", new OrderItemMapper ());
//    }
}
