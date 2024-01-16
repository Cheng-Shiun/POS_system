package com.example.drink.controller;

import com.example.drink.Dao.ReceiveOrderRepository;
import com.example.drink.model.ReceiveOrderModel;
import com.example.drink.service.ReceiveOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/completeOrder")
    public String completeOrder(@RequestParam("oNumber") int oNumber) {
        // 根據訂單號碼查找訂單
        ReceiveOrderModel order = receiveOrderService.findOrderByONumber(oNumber);

        // 如果訂單存在，完成訂單並更新 eDate
        if (order != null) {
            order.completeOrder();
            receiveOrderService.saveOrder(order);
        }

        // 重定向到訂單列表頁面
        return "redirect:/receiveOrder";
    }
}
