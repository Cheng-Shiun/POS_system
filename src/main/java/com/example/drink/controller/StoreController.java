package com.example.drink.controller;

import com.example.drink.model.StoreModel;
import com.example.drink.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class StoreController {
    @Autowired
    StoreService storeService;

//    @GetMapping("/store/{area}")
//    public String getStore(Model model, @PathVariable String area){
//
//        List<StoreModel> stores = storeService.getStoreByArea (area);
//        model.addAttribute ("stores",stores);
//        model.addAttribute ("areaNames", area );
//        return "store";
//    }

    //Json的資料格式
    @GetMapping("/store")
    public String getStoreByArea(Model model) {
        List<StoreModel> north = storeService.getStoreByArea("北部");
        List<StoreModel> central = storeService.getStoreByArea("中部");
        List<StoreModel> south = storeService.getStoreByArea("南部");
        model.addAttribute("north", north);
        model.addAttribute("central", central);
        model.addAttribute("south", south);
        return "store";
    }
}
