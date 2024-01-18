package com.example.drink.service;

import com.example.drink.DAO.FranchiseRepository;
import com.example.drink.model.FranchiseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranchiseService {

    @Autowired
    private FranchiseRepository franchiseRepository;
    public void saveFranchise(FranchiseModel franchiseModel) {
        franchiseRepository.saveFranchise(franchiseModel);
    }


    JdbcTemplate jdbcTemplate;
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
        //檢查必填項目是否都有填寫
        if (franchiseModel.getName() == null || franchiseModel.getName().isEmpty() ||
                franchiseModel.getPhone() == null || franchiseModel.getPhone().isEmpty() ||
                franchiseModel.getAddress() == null || franchiseModel.getAddress().isEmpty() ||
                franchiseModel.getBudget() == null || franchiseModel.getBudget().isEmpty() ||
                franchiseModel.getOpentime() == null || franchiseModel.getOpentime().isEmpty() ||
                franchiseModel.getContacttime() == null || franchiseModel.getContacttime().isEmpty()) {
            System.out.println("資料未填寫完整");
            return 4;
        }
        //判斷加盟者的 name&phone 是否已存在
        if(franchiseModel.getName ().contains ("select") ||
                franchiseModel.getName ().contains ("delete") ||
                franchiseModel.getName ().contains ("update")||
                franchiseModel.getName().contains("query")){
            System.out.println(("name有保留字"));
            return 3;
        }
        if (checkFranchise (franchiseModel.getName (),franchiseModel.getPhone())){
            System.out.println("資料已存在");
            return 2;
        }
        //新增加盟表單資訊
        int count = franchiseRepository.saveFranchise (franchiseModel);
        if(count>0){
            System.out.println("成功新增");
            return 1;
        //檢查是否有輸入 保留字
        }else {
            System.out.println("其他錯誤");
            return count;
        }
    }
}
