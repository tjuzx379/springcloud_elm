package com.neusoft.service;

import com.neusoft.po.Orders;

import java.util.List;

public interface OrdersService {

    public int createOrders(Orders orders);
    public Orders getOrdersById(Integer orderId);
    public List<Orders> listOrdersByUserId(String userId);
}
