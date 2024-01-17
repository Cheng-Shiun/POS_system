package com.example.drink.controller;

import com.example.drink.service.DrinkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DrinkItemController {
    @Autowired
    DrinkItemService drinkItemService;

    @GetMapping("/drink_item")
    public String getDrinkItem(Model model){
        model.addAttribute ("originals", drinkItemService.getAllByType ("original"));
        model.addAttribute ("flavors", drinkItemService.getAllByType ("flavor"));
        model.addAttribute ("tastes",drinkItemService.getAllByType ("taste"));
        model.addAttribute ("milks", drinkItemService.getAllByType ("milk"));
        model.addAttribute ("freshmilks", drinkItemService.getAllByType ("freshMilk"));
        model.addAttribute ("cheeses", drinkItemService.getAllByType ("cheese"));
        model.addAttribute ("wintermelons", drinkItemService.getAllByType ("winterMelo"));
        model.addAttribute ("materials",drinkItemService.getAllByType ("addMateria"));
        return "drink_item_list";
    }
}
