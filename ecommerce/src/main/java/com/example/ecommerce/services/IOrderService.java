package com.example.ecommerce.services;

import com.example.ecommerce.dtos.OrderDTO;
import com.example.ecommerce.exceptions.DataNotFoundException;
import com.example.ecommerce.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
