package com.example.drink.service;

import com.example.drink.Dao.ReceiveOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveOrderService {
    @Autowired
    ReceiveOrderRepository receiveOrderRepository;
}
