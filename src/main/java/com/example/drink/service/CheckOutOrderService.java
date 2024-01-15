package com.example.drink.service;

import com.example.drink.Dao.AddOrderRepository;
import com.example.drink.Dao.CheckOutOrderRepository;
import com.example.drink.model.AddOrderModel;
import com.example.drink.model.CheckOutOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutOrderService {
    @Autowired
    CheckOutOrderRepository checkOutOrderRepository;

    public int checkOutOrder(CheckOutOrderModel checkOutOrderModel) {
        int count = checkOutOrderRepository.checkOutOrder(checkOutOrderModel);
        if (count > 0) {
            return 1;
        } else {
            return count;
        }
    }
}
