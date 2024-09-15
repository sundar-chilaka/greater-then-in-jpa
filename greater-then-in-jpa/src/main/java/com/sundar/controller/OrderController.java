package com.sundar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.sundar.entity.OrderDetail;
import com.sundar.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	OrderService service;

	@PostMapping("/saveAll")
	public ResponseEntity<?> saveAll(@RequestBody List<OrderDetail> orderList) {
		Map<String, Object> map = new HashMap<>();
		service.saveAll(orderList);
		map.put("Status", 1);
		map.put("Message", "Record is Saved Successfully!");
		return new ResponseEntity<>(map, HttpStatus.CREATED);
	}
	


	@GetMapping("/getOrder/{amount}")
	public ResponseEntity<?> getOrdersAmtGreaterThen(@PathVariable Double amount) {
		Map<String, Object> map = new HashMap<>();
//		System.out.println();
		List<OrderDetail> orderList = service.getOrderByGreaterThen(amount);
		if (!orderList.isEmpty()) {
			map.put("Status", 1);
			map.put("Data", orderList);
			return new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.clear();
			map.put("Status", 0);
			map.put("Message", "Data not Found!");
			return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);

		}

	}

}
