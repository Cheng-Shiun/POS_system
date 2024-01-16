package com.example.drink.service;

import com.example.drink.Dao.AddOrderRepository;
import com.example.drink.Dao.CheckOutOrderRepository;
import com.example.drink.model.AddOrderModel;
import com.example.drink.model.CheckOutOrderModel;
import com.example.drink.model.ReceiveOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckOutOrderService {
    @Autowired
    CheckOutOrderRepository checkOutOrderRepository;


    public int checkOutOrderByOnumber(CheckOutOrderModel checkOutOrderModel) {
        int count = checkOutOrderRepository.checkOutOrderByOnumber(checkOutOrderModel);
        if (count > 0) {
            return 1;
        } else {
            return count;
        }
    }
}
