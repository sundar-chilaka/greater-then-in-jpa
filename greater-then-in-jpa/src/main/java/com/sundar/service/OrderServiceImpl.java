package com.sundar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.sundar.entity.OrderDetail;
import com.sundar.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository repository;

	@Override
	public List<OrderDetail> saveAll(List<OrderDetail> orderList) {
		return repository.saveAll(orderList);
	}

	@Override
	public List<OrderDetail> getOrderByGreaterThen(Double amount) {
		return repository.findByAmountGreaterThan(amount);
	}
	


}
