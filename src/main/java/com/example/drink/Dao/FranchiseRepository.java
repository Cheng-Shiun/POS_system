package com.example.drink.DAO;

import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
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
}
