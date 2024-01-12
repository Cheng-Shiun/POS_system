package com.example.drink.service;

import com.example.drink.Dao.AddOrderRepository;
import com.example.drink.model.AddOrderModel;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddOrderService {
    @Autowired
    AddOrderRepository addOrderRepository;

    public int addOrder(AddOrderModel addOrderModel) {
        int count = addOrderRepository.addOrder(addOrderModel);
        if (count > 0) {
            return 1;
        } else {
            return count;
        }
    }

    public List<OrderItemModel> addOrderById (String type) {
        return addOrderRepository.addOrderByType(type);
    }
}
