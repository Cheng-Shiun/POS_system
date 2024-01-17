package com.example.drink.Dao;

import com.example.drink.Dao.mapper.MemberParamMapper;
import com.example.drink.Dao.mapper.OrderItemMapper;
import com.example.drink.Dao.mapper.ReceiveOrderMapper;
import com.example.drink.model.MemberParam;
import com.example.drink.model.OrderItemModel;
import com.example.drink.model.ReceiveOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class ReceiveOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ReceiveOrderModel> receiveOrderAll () {
        ReceiveOrderMapper receiveOrderMapper = new ReceiveOrderMapper();
        List<ReceiveOrderModel> receiveOrderModel = jdbcTemplate.query("select * from javateaorder",receiveOrderMapper);
        return receiveOrderModel;
    }

    public List<ReceiveOrderModel> checkOutOrderByDate () {
        ReceiveOrderMapper receiveOrderMapper = new ReceiveOrderMapper();
        List<ReceiveOrderModel> receiveOrderModel = jdbcTemplate.query("SELECT * from javateaorder WHERE eDate IS null",receiveOrderMapper);
        return receiveOrderModel;
    }


}
