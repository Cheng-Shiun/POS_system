package com.example.drink.repository;


import com.example.drink.model.AddOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addOrder (AddOrderModel addOrderModel) {
        String sql = "insert into javateaorder(type,product,material,qty,states) values (?,?,?,?,?)";
        return jdbcTemplate.update(sql, addOrderModel.getType() ,addOrderModel.getProduct(), addOrderModel.getMaterial(), addOrderModel.getQty(), addOrderModel.getStates());
    }
}
