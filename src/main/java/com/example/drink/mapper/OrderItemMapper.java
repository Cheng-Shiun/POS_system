package com.example.drink.mapper;

import com.example.drink.model.DrinkItemModel;
import com.example.drink.model.OrderItemModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemMapper implements RowMapper<OrderItemModel> {
    @Override
    public OrderItemModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        OrderItemModel orderItemModel = new OrderItemModel ();
        orderItemModel.setType (rs.getString("type"));
//        drinkItemModel.setPn(rs.getString("pn"));
        return orderItemModel;
    }
}
