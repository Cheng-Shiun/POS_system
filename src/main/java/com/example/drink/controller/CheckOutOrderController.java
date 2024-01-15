package com.example.drink.controller;

import com.example.drink.model.AddOrderModel;
import com.example.drink.service.AddOrderService;
import com.example.drink.service.CheckOutOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckOutOrderController {
    @Autowired
    CheckOutOrderService checkOutOrderService;

    @GetMapping("/checkOutOrder")
    public String addOrder(Model model) {
        AddOrderModel addOrderModel = new AddOrderModel();
        model.addAttribute( "addOrderModel", addOrderModel);
        return "checkOutOrder";
    }
}
