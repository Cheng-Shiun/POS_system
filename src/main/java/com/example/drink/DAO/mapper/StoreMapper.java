package com.example.drink.DAO.mapper;

import com.example.drink.model.StoreModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
public class StoreMapper implements RowMapper<StoreModel> {
    @Override
    public StoreModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        StoreModel storeModel = new StoreModel();
        storeModel.setS_name(rs.getNString("s_name"));
        storeModel.setS_area(rs.getNString("s_area"));
        storeModel.setS_addr(rs.getNString("s_addr"));
        storeModel.setS_tel(rs.getNString("s_tel"));
        storeModel.setOpentime(rs.getNString("opentime"));
        return storeModel;
    }
}
