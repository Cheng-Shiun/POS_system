package com.example.drink.Dao.mapper;

import com.example.drink.model.FranchiseModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FranchiseMapper implements RowMapper<FranchiseModel> {
    @Override
    public FranchiseModel mapRow (ResultSet rs, int rowNum) throws SQLException {
        FranchiseModel franchiseModel = new FranchiseModel ();
        franchiseModel.setName (rs.getNString ("name"));
        franchiseModel.setGender (rs.getNString ("gender"));
        franchiseModel.setPhone (rs.getString ("phone"));
        franchiseModel.setLineID (rs.getString ("lineID"));
        franchiseModel.setAddress (rs.getString ("address"));
        franchiseModel.setBudget (rs.getString ("budget"));
        franchiseModel.setOpentime (rs.getString ("opentime"));
        franchiseModel.setContacttime (rs.getString ("contacttime"));
        franchiseModel.setDescription (rs.getNString ("desciption"));
        return franchiseModel;
    }
}
