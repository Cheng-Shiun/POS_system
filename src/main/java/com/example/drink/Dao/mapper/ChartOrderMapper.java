package com.example.drink.Dao.mapper;

import com.example.drink.model.ChartOrderModel;
import com.example.drink.model.CheckOutOrderModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChartOrderMapper implements RowMapper<ChartOrderModel> {
    @Override
    public ChartOrderModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        ChartOrderModel chartOrderModel = new ChartOrderModel ();
//        chartOrderModel.setType(rs.getString("type"));
//        chartOrderModel.setProduct(rs.getString("product"));
//        chartOrderModel.setMaterial(rs.getString("material"));
//        chartOrderModel.setQty(rs.getInt("qty"));
//        chartOrderModel.setStates(rs.getString("states"));

        chartOrderModel.setTotal(rs.getInt("total"));
        return chartOrderModel;
    }
}
