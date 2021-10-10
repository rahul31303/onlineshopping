package com.edubridge.onlineshop.service;

import java.util.List;

import com.edubridge.onlineshop.entities.Payment;



public interface PaymentService {
	
public Payment savePayment(Payment payment);
	
	public List<Payment> getAlPaymentItems();
	
	
	
   
}