package com.example.drink.controller;

import com.example.drink.model.AddOrderModel;
import com.example.drink.model.OrderItemModel;
import com.example.drink.service.AddOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddOrderDataController {
    @Autowired
    AddOrderService addOrderService;

    @GetMapping ("/api/addOrderByType/{type}")
    public List<OrderItemModel> queryByType(@PathVariable String type) {
        return addOrderService.addOrderById(type);
    }
}
