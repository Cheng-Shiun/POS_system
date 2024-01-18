package com.example.drink.DAO;

import com.example.drink.DAO.mapper.FranchiseMapper;
import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FranchiseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveFranchise(FranchiseModel franchise) {
        String sql = "INSERT INTO franchise(name, gender, phone, lineID, address, budget, opentime, contacttime, description) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, franchise.getName(), franchise.getGender(),
                franchise.getPhone(), franchise.getLineID(), franchise.getAddress(),
                franchise.getBudget(), franchise.getOpentime(), franchise.getContacttime(),
                franchise.getDescription());
    }

    public List<FranchiseModel> getAllFranchise(){
        return jdbcTemplate.query ("select * from franchise",new FranchiseMapper());
    }

    //檢查加盟者的 name&phone 是否存在; 兩者同時存在,代表已填寫過
    public long checkFranchise(String franchiseName, String franchisePhone){
        return jdbcTemplate.queryForObject ("select count(*) from franchise where name=? and phone=?", Long.class, franchiseName,franchisePhone);
    }

    public boolean isPhoneDuplicate(String franchisePhone) {
        long count = jdbcTemplate.queryForObject("select count(*) from franchise where phone=?", Long.class, franchisePhone);   //? = franchisePhone
        return count > 0; //count > 0 ,代表號碼已存在
    }
}