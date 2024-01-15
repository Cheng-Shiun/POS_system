package com.example.drink.Dao;

import com.example.drink.Dao.mapper.OrderItemMapper;
import com.example.drink.model.AddOrderModel;
import com.example.drink.model.CheckOutOrderModel;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CheckOutOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int checkOutOrder (CheckOutOrderModel checkOutOrderModel) {
        String sql = "UPDATE javateaorder SET eDate = NOW() WHERE oNumber = ?";
        return jdbcTemplate.update(sql, checkOutOrderModel.getEDate());
    }
}
