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
        model.addAttribute ("originals", drinkItemService.getAllOriginal ());
        model.addAttribute ("flavors", drinkItemService.getAllFlavor ());
        model.addAttribute ("tastes",drinkItemService.getAllTaste());
        model.addAttribute ("milks", drinkItemService.getAllMilk ());
        model.addAttribute ("freshmilks", drinkItemService.getAllFreshMilk ());
        model.addAttribute ("cheeses", drinkItemService.getAllCheese ());
        model.addAttribute ("wintermelons", drinkItemService.getAllWiterMelon ());
        model.addAttribute ("materials",drinkItemService.getAllMaterials ());
        return "drink_item_list";
    }
}
