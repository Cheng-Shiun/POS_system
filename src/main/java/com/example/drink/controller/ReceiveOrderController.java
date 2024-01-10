package com.example.drink.controller;

import com.example.drink.model.AddOrderModel;
import com.example.drink.model.ReceiveOrderModel;
import com.example.drink.repository.ReceiveOrderRepository;
import com.example.drink.service.AddOrderService;
import com.example.drink.service.ReceiveOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class ReceiveOrderController {
    @Autowired
    ReceiveOrderService receiveOrderService;

    @Autowired
    ReceiveOrderRepository receiveOrderRepository;

    @GetMapping("/receiveOrder")
        public String receiveOrder(Model model) {
            List<ReceiveOrderModel> receiveOrder = receiveOrderRepository.receiveOrder();
            model.addAttribute("receiveOrder", receiveOrder);
        return "receive_order";
        }
}
