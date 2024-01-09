package com.example.drink.mapper;

import com.example.drink.model.AddOrderModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddOrderMapper implements RowMapper<AddOrderModel> {
    @Override
    public AddOrderModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        AddOrderModel addOrderModel = new AddOrderModel();
//        addOrderModel.setOn( rs.getInt("on"));
        addOrderModel.setType( rs.getString("type"));
        addOrderModel.setProduct( rs.getString("product"));
        addOrderModel.setMaterial( rs.getString("material"));
        addOrderModel.setQty( rs.getInt("qty"));
        addOrderModel.setStates( rs.getString("states"));
//        addOrderModel.setDate( rs.getDate("date"));
        return addOrderModel;
    }
}
