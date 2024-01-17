package com.example.drink.controller;

import com.example.drink.model.ChartOrderModel;
import com.example.drink.model.OrderItemModel;
import com.example.drink.service.AddOrderService;
import com.example.drink.service.ChartOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChartOrderDataController {
    @Autowired
    ChartOrderService chartOrderService;
    @GetMapping("/api/chartOrder/")
    public List<ChartOrderModel> queryByType() {
        return chartOrderService.chartOrderByType();
    }

}
