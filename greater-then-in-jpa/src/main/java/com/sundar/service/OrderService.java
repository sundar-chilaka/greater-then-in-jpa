package com.sundar.service;

import java.util.List;

import com.sundar.entity.OrderDetail;

public interface OrderService {

	List<OrderDetail>saveAll(List<OrderDetail>orderList);
	List<OrderDetail>getOrderByGreaterThen(Double amount);
	
}
