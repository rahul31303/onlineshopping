package com.edubridge.onlineshop.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.onlineshop.entities.Payment;

import com.edubridge.onlineshop.repository.PaymentRepository;

import com.edubridge.onlineshop.service.PaymentService;


@Service
public class PaymentServiceimpl  implements  PaymentService{
	
	@Autowired
	
	PaymentRepository paymentRepo;

	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentRepo.save(payment);
	}

	@Override
	public List<Payment> getAlPaymentItems() {
		
		return paymentRepo.findAll();
	}

	

	
}
	

	