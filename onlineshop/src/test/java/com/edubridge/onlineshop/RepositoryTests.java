package com.edubridge.onlineshop;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.edubridge.onlineshop.entities.Payment;
import com.edubridge.onlineshop.repository.PaymentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class RepositoryTests {
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	PaymentRepository paymentRespository;
	
	
	@Test
	public void testCreatePayment() {
	    Payment payment = new Payment();
	    payment.setProductprice(500);
	    payment.setProductName("shoe");
	    payment.setPaymentstatus("success");
	    payment.setPaymentmethod("Card");
	 payment.setTotalprice(500);

	    Payment savedPayment = paymentRespository.save(payment);
	     
	}
}
