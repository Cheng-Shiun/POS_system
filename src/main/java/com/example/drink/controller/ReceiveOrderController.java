package com.example.drink.controller;

import com.example.drink.Dao.ReceiveOrderRepository;
import com.example.drink.model.ReceiveOrderModel;
import com.example.drink.service.ReceiveOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReceiveOrderController {
    @Autowired
    ReceiveOrderService receiveOrderService;


//    @GetMapping("/receiveOrder")
//    public String receiveOrder(Model model) {
//        List<ReceiveOrderModel> receiveOrder = receiveOrderService.receiveOrderAll();
//        model.addAttribute("receiveOrder", receiveOrder);
//        return "receive_order";
//    }

    @GetMapping("/receiveOrder")
    public String checkOutOrder(Model model) {
        List<ReceiveOrderModel> receiveOrder = receiveOrderService.checkOutOrderByDate();
        model.addAttribute("receiveOrder", receiveOrder);
        return "receive_order";
    }
}
