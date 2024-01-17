package com.example.drink.service;

import com.example.drink.DAO.FranchiseRepository;
import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchiseService {

    @Autowired
    private FranchiseRepository franchiseRepository;
    public void saveFranchise(FranchiseModel franchiseModel) {
        franchiseRepository.saveFranchise(franchiseModel);
        // 檢查是否有重覆
        if (isPhoneNumberEmpty(franchiseModel.getPhone())) {
            throw new RuntimeException("Phone number is not provided");
        }
        if (isPhoneDuplicate(franchiseModel.getPhone())) {
            throw new RuntimeException("Duplicate phone number");
        }
    }

    public boolean isPhoneDuplicate(String phone) {
        FranchiseModel existingFranchise = franchiseRepository.findByPhone(phone);
        return existingFranchise != null;
    }

    private boolean isPhoneNumberEmpty(String phone) {
        return phone == null || phone.trim().isEmpty();
    }
}
