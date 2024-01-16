package com.example.drink.controller;

import com.example.drink.model.AddOrderModel;
import com.example.drink.model.CheckOutOrderModel;
import com.example.drink.model.MemberParam;
import com.example.drink.service.AddOrderService;
import com.example.drink.service.CheckOutOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckOutOrderController {
    @Autowired
    CheckOutOrderService checkOutOrderService;
    @PostMapping("/checkOutOrder")

    public String checkOutOrderByOnumber(@ModelAttribute CheckOutOrderModel checkOutOrderModel, Model model) {
        String msg = null;

        int result = checkOutOrderService.checkOutOrderByOnumber(checkOutOrderModel);

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
        model.addAttribute("oNumber", checkOutOrderModel.getONumber());
        model.addAttribute("msg", msg);
        return "redirect:/receiveOrder";
    }
}
