package com.example.drink.Dao;

import com.example.drink.Dao.mapper.ChartOrderMapper;
import com.example.drink.Dao.mapper.MemberParamMapper;
import com.example.drink.Dao.mapper.OrderItemMapper;
import com.example.drink.model.ChartOrderModel;
import com.example.drink.model.MemberParam;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChartOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ChartOrderModel> chartOrderAll() {
        return jdbcTemplate.query("select * from javateaorder", new ChartOrderMapper());
    }
    public List<ChartOrderModel> chartOrderByType () {
        return jdbcTemplate.query("SELECT tea_types.TYPE, COALESCE(SUM(javateaorder.qty), 0) AS total\n" +
                "FROM (\n" +
                "    SELECT '原味茶' AS TYPE\n" +
                "    UNION SELECT '風味茶'\n" +
                "    UNION SELECT '滋味茶'\n" +
                "    UNION SELECT '香醇奶茶'\n" +
                "    UNION SELECT '芝士奶蓋'\n" +
                "    UNION SELECT '鮮奶茶'\n" +
                "    UNION SELECT '冬瓜茶系列'\n" +
                ") tea_types\n" +
                "LEFT JOIN javateaorder ON tea_types.TYPE = javateaorder.TYPE\n" +
                "GROUP BY tea_types.TYPE", new ChartOrderMapper());
    }

}
