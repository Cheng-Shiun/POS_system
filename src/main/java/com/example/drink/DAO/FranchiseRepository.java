package com.example.drink.DAO;

import com.example.drink.DAO.mapper.FranchiseMapper;
import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//
@Repository
public class FranchiseRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;      //執行SQL 的CRUD

    //建立存放加盟表單訊息的數據庫
    public int saveFranchise(FranchiseModel franchiseModel){
        return jdbcTemplate.update ("insert into franchise(name, gender, phone, lineID, address, budget, opentime, contacttime, description) " +
                "values (?,?,?,?,?,?,?,?,?)",
                franchiseModel.getName (),
                franchiseModel.getGender (),
                franchiseModel.getPhone (),
                franchiseModel.getLineID (),
                franchiseModel.getAddress (),
                franchiseModel.getBudget (),
                franchiseModel.getOpentime (),
                franchiseModel.getContacttime (),
                franchiseModel.getDescription ()
        );
    }
    public List<FranchiseModel> getAllFranchise(){
        return jdbcTemplate.query ("select * from franchise",new FranchiseMapper ());
    }
    //檢查加盟者的 name&phone 是否存在; 兩者同時存在,代表已填寫過
    public long checkFranchise(String franchiseName, String franchisePhone){
        return jdbcTemplate.queryForObject ("select count(*) from franchise where name=? and phone=?", Long.class, franchiseName,franchisePhone);
    }
}
