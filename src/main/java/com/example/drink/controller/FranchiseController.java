package com.example.drink.controller;

import com.example.drink.model.FranchiseModel;
import com.example.drink.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FranchiseController {
    @Autowired
    private FranchiseService franchiseService;

    @GetMapping("/franchise")
    public String showFranchiseForm(Model model) {
        model.addAttribute("franchiseModel", new FranchiseModel());
        return "franchise";
    }

    @PostMapping("/franchise")
    public String submitFranchiseForm(@ModelAttribute FranchiseModel franchiseModel) {
        franchiseService.saveFranchise(franchiseModel);
        return "redirect:/success"; // 重新導到success.html
    }

    @PostMapping("/submitForm")
    public ResponseEntity<String> submitForm(@RequestBody FranchiseModel franchiseModel) {

        System.out.println(franchiseModel);

        return ResponseEntity.ok("Form submitted successfully!");
    }


    @PostMapping("/checkPhone")
    public ResponseEntity<String> checkPhone(@RequestParam String phone) {
        // 檢查號碼 是否未輸入
        if (phone == null || phone.trim().isEmpty()) {
            return ResponseEntity.status(400).body("號碼還沒輸入喔~");
        }

        // 檢查號碼 是否重覆
        if (franchiseService.isPhoneDuplicate(phone)) {
            return ResponseEntity.ok("Duplicate phone number");  //重覆
        } else {
            return ResponseEntity.ok("Phone number is available");  //未重覆
        }
    }
}
