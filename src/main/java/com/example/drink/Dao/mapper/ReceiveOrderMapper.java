package com.example.drink.Dao.mapper;

import com.example.drink.model.ReceiveOrderModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceiveOrderMapper implements RowMapper<ReceiveOrderModel> {
    @Override
    public ReceiveOrderModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        ReceiveOrderModel receiveOrderModel = new ReceiveOrderModel();
        receiveOrderModel.setOn( rs.getInt("on"));
        receiveOrderModel.setType( rs.getString("type"));
        receiveOrderModel.setProduct( rs.getString("product"));
        receiveOrderModel.setMaterial( rs.getString("material"));
        receiveOrderModel.setQty( rs.getInt("qty"));
        receiveOrderModel.setStates( rs.getString("states"));
//        receiveOrderModel.setDate( rs.getDate("date"));
        return receiveOrderModel;
    }
}
