package com.example.drink.DAO;

import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
    public FranchiseModel findByPhone(String phone) {
        String sql = "SELECT * FROM franchise WHERE phone = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{phone}, new BeanPropertyRowMapper<> (FranchiseModel.class));
        } catch (Exception e) {
            // 如果DB裡沒有  傳回null
            return null;
        }
    }

}