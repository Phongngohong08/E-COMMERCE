package com.example.ecommerce.services;

import com.example.ecommerce.dtos.OrderDetailDTO;
import com.example.ecommerce.exceptions.DataNotFoundException;
import com.example.ecommerce.models.OrderDetail;

import java.util.List;

public interface IOrderDetailService {

    OrderDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;

    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;

    OrderDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;

    void deleteById(Long id);

    List<OrderDetail> findByOrderId(Long orderId);
}
