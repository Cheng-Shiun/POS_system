package com.example.drink.mapper;

import com.example.drink.model.DrinkItemModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DrinkItemMapper implements RowMapper<DrinkItemModel> {
    @Override
    public DrinkItemModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        DrinkItemModel drinkItemModel = new DrinkItemModel ();
        drinkItemModel.setName(rs.getString("product"));
        drinkItemModel.setPrice (rs.getInt ("price"));
//        drinkItemModel.setType (rs.getString("type"));
//        drinkItemModel.setPn(rs.getString("pn"));
        return drinkItemModel;
    }
}
