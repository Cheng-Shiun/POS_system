package com.example.drink.service;

import com.example.drink.Dao.AddOrderRepository;
import com.example.drink.Dao.ChartOrderRepository;
import com.example.drink.model.ChartOrderModel;
import com.example.drink.model.MemberParam;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartOrderService {
    @Autowired
    ChartOrderRepository chartOrderRepository;

    public List<ChartOrderModel> chartOrderByType() {
        return chartOrderRepository.chartOrderByType();
    }

    public List<ChartOrderModel> chartOrderAll() {
        return chartOrderRepository.chartOrderAll();
    }

}
