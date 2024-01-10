package com.example.drink.repository;

import com.example.drink.mapper.DrinkItemMapper;
import com.example.drink.mapper.ReceiveOrderMapper;
import com.example.drink.model.AddOrderModel;
import com.example.drink.model.DrinkItemModel;
import com.example.drink.model.ReceiveOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReceiveOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<ReceiveOrderModel> receiveOrder () {
        ReceiveOrderMapper receiveOrderMapper = new ReceiveOrderMapper();
        List<ReceiveOrderModel> receiveOrderModel = jdbcTemplate.query("select * from javateaorder",receiveOrderMapper);
        return receiveOrderModel;
    }
}
