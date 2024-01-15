package com.example.drink.Dao.mapper;

import com.example.drink.model.CheckOutOrderModel;
import com.example.drink.model.OrderItemModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckOutOrderMapper implements RowMapper<CheckOutOrderModel> {
    @Override
    public CheckOutOrderModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        CheckOutOrderModel checkOutOrderModel = new CheckOutOrderModel ();
        checkOutOrderModel.setEdate(rs.getDate("edate"));
//        orderItemModel.setPrice (rs.getInt ("price"));
//        orderItemModel.setType (rs.getString("type"));
//        drinkItemModel.setPn(rs.getString("pn"));
        return checkOutOrderModel;
    }
}
