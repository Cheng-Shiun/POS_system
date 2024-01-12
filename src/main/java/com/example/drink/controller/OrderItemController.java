package com.example.drink.controller;

import com.example.drink.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderItemController {
    //    @Autowired
//    DrinkItemService drinkItemService;
    @Autowired
    OrderItemService orderItemService;

    @GetMapping("/order_item")
    public String getOrderItem(Model model){
        model.addAttribute ("originals", orderItemService.getAllOriginal ());
        model.addAttribute ("flavors", orderItemService.getAllFlavor ());
        model.addAttribute ("tastes",orderItemService.getAllTaste());
        model.addAttribute ("milks", orderItemService.getAllMilk ());
        model.addAttribute ("freshmilks", orderItemService.getAllFreshMilk ());
        model.addAttribute ("cheeses", orderItemService.getAllCheese ());
        model.addAttribute ("wintermelons", orderItemService.getAllWiterMelon ());
        model.addAttribute ("materials",orderItemService.getAllMaterials ());
//        model.addAttribute ("types",orderItemService.getAllTypes());
        model.addAttribute ("products",orderItemService.getAllProduct());
        return "order_item_list";
    }
}
