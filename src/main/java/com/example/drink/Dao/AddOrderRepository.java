package com.example.drink.Dao;

import com.example.drink.Dao.mapper.OrderItemMapper;
import com.example.drink.model.AddOrderModel;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addOrder (AddOrderModel addOrderModel) {
        String sql = "insert into javateaorder(type,product,material,qty,states) values (?,?,?,?,?)";
        return jdbcTemplate.update(sql, addOrderModel.getType() ,addOrderModel.getProduct(), addOrderModel.getMaterial(), addOrderModel.getQty(), addOrderModel.getStates());
    }

    public List<OrderItemModel> addOrderByType (String type) {
        return jdbcTemplate.query("select * from teamenu where TYPE=?", new OrderItemMapper(), type);
    }
}
