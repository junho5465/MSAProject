package com.dream.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class OrderController {
	
	@GetMapping("/info")
	public String info(@Value("${server.port}") String port) {
		return "Order 서비스의 기본 동작 Port: {" + port + "}";
	}
	
}
