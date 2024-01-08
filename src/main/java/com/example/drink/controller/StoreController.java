package com.example.drink.controller;

import com.example.drink.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StoreController {
    @Autowired
    StoreService storeService;
    @GetMapping("/store")
    public String getStore(Model model){
        model.addAttribute("north",storeService.getByAll("北部"));
        model.addAttribute("central",storeService.getByAll("中部"));
        model.addAttribute("south",storeService.getByAll("南部"));

        List<String> country = Arrays.asList("台灣","日本","中國");
        Map<String, List<String>> regions = new HashMap<>();
        regions.put("台灣",Arrays.asList("北部地區","中部地區","南部地區","離島部地區"));
        regions.put("日本",Arrays.asList("北海道地區","關東地區","東北地區","近畿地區"));
        regions.put("中國",Arrays.asList("北京地區","上海地區","廣東地區","四川地區","重慶地區"));

        model.addAttribute("country",country);
        model.addAttribute("regions",regions);

        return "store";
    }
}
