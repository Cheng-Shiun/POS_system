package com.example.drink.service;

import com.example.drink.Dao.ReceiveOrderRepository;
import com.example.drink.model.MemberParam;
import com.example.drink.model.ReceiveOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReceiveOrderService {
    @Autowired
    ReceiveOrderRepository receiveOrderRepository;
    public List<ReceiveOrderModel> receiveOrderAll() {
        return receiveOrderRepository.receiveOrderAll();
    }

    public List<ReceiveOrderModel> checkOutOrderByDate() {
        return receiveOrderRepository.checkOutOrderByDate();
    }
}
