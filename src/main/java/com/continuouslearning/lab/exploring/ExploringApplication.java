package com.continuouslearning.lab.exploring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExploringApplication  implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExploringApplication.class, args);
	}

    private  UbuntuPaymentService ubuntuPaymentService =  new UbuntuPaymentService();
	@Override 
	public  void run(String... args) throws Exception{
		//It runs after everything is done. It can hold non static variables and functions
        String payString = ubuntuPaymentService.pay();
		System.out.println("Payment is completed : " + payString);
	}

}
