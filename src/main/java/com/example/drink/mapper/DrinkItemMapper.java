package com.example.drink.mapper;

import com.example.drink.model.DrinkItemModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DrinkItemMapper implements RowMapper<DrinkItemModel> {
    @Override
    public DrinkItemModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        DrinkItemModel drinkItemModel = new DrinkItemModel ();
        drinkItemModel.setName (rs.getNString ("name"));
        drinkItemModel.setPrice (rs.getInt ("price"));
        return drinkItemModel;
    }
}
