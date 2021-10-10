package com.edubridge.onlineshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.onlineshop.entities.Payment;
import com.edubridge.onlineshop.exception.ProductDoesNotExist;
import com.edubridge.onlineshop.exception.ProductDoesNotExist;
import com.edubridge.onlineshop.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	
  PaymentService  paymentService;
	@PostMapping("/payment/add")
	public Payment savePayment (@RequestBody Payment payment) {
		return paymentService.savePayment(payment);
	}
	
	@GetMapping("/payment/paymentitems")
	public  List<Payment> getAllPaymentItems(){
		
		return paymentService.getAlPaymentItems();
	}
	
	


	
	
}
