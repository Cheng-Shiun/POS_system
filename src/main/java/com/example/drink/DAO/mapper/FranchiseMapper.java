package com.example.drink.DAO.mapper;

import com.example.drink.model.FranchiseModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
//泛型，可以在使用類別、介面或方法時指定一種特定的資料型態。 **RowMapper<FranchiseModel> ~FranchiseModel是泛型
//RowMapper 是介面，目的是將資料庫查詢的 結果集(rs) 中的每一行映射到相應的Java物件(FranchiseModel)
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
