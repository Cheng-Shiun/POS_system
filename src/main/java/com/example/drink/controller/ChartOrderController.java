package com.example.drink.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartOrderController {
    @GetMapping("/chartOrder")
    public String chartOrder() {
        return "chartOrder";
    }
}
