package com.example.drink.service;

import com.example.drink.repository.AddOrderRepository;
import com.example.drink.repository.ReceiveOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveOrderService {
    @Autowired
    ReceiveOrderRepository receiveOrderRepository;
}
