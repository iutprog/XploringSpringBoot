package com.continuouslearning.lab.exploring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExploringApplication  implements  CommandLineRunner{

	//@Autowired 
	private final UbuntuPaymentService ubuntuPaymentService;

	ExploringApplication(UbuntuPaymentService ubuntuPaymentService) {
		this.ubuntuPaymentService = ubuntuPaymentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ExploringApplication.class, args);
	}
	@Override 
	public  void run(String... args) throws Exception{
		//It runs after everything is done. It can hold non static variables and functions
        String payString = ubuntuPaymentService.pay();
		System.out.println("Payment is completed : " + payString);
	}

}
