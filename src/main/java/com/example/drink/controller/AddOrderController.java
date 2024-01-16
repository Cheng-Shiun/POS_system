package com.example.drink.controller;

import com.example.drink.model.AddOrderModel;
import com.example.drink.service.AddOrderService;
import com.example.drink.service.ReceiveOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddOrderController {
    @Autowired
    AddOrderService addOrderService;

    @Autowired
    ReceiveOrderService receiveOrderService;

    @GetMapping("/addOrder")
    public String addOrder(Model model) {
        AddOrderModel addOrderModel = new AddOrderModel();
        model.addAttribute( "addOrderModel", addOrderModel);
        return "addOrder";
    }

    @PostMapping("/addOrder")
    public String addOrderProcess(@ModelAttribute AddOrderModel addOrderModel, Model model) {
        String msg = null;

        int result = addOrderService.addOrder(addOrderModel);

        switch (result) {
            case 0:
                msg = "訂單失敗";
                break;
            case 1:
                msg = "訂單完成";
                break;
            default:
                msg = "其它原因";
                break;
        }

        model.addAttribute("type", addOrderModel.getType());
        model.addAttribute("product", addOrderModel.getProduct());
        model.addAttribute("material", addOrderModel.getMaterial());
        model.addAttribute("qty", addOrderModel.getQty());
        model.addAttribute("states", addOrderModel.getStates());

        model.addAttribute("msg", msg);
        return "add_order_result";
    }
}
