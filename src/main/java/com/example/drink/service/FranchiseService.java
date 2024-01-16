package com.example.drink.service;

import com.example.drink.DAO.FranchiseRepository;
import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranchiseService {
    @Autowired
    FranchiseRepository franchiseRepository;
    public List<FranchiseModel> getAllFranchise(){
        return franchiseRepository.getAllFranchise ();
    }
    //用加盟者的name&phone 判斷 是否已存在
    public boolean checkFranchise(String franchiseName, String franchisePhone){
        long count = franchiseRepository.checkFranchise (franchiseName, franchisePhone);
        return count>0;
    }
    //送出表單的判斷
    public int submitFranchiseForm(FranchiseModel franchiseModel){
        //檢查是否有輸入 保留字
        if(franchiseModel.getName ().contains ("select") ||
                franchiseModel.getName ().contains ("delete") ||
                franchiseModel.getName ().contains ("update")||
                franchiseModel.getName().contains("query")){
            return 3;
        }
        //判斷加盟者的 name&phone 是否已存在
        if(checkFranchise (franchiseModel.getName (),franchiseModel.getPhone())){
            return 2;
        }
        int count = franchiseRepository.saveFranchise (franchiseModel);
        if(count>0){
            return 1;
        }
        else {
            return count;
        }
    }
}
