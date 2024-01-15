package com.example.drink.service;

import com.example.drink.Dao.mapper.FranchiseRepository;
import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchiseService {

    @Autowired
    private FranchiseRepository franchiseRepository;

    public void saveFranchise(FranchiseModel franchiseModel) {
        franchiseRepository.saveFranchise(franchiseModel);
    }
}