package com.continuouslearning.lab.exploring;

import org.springframework.stereotype.Component;

@Component 
public class UbuntuPaymentService implements PaymentService {

    @Override 
    public String pay(){

        String payment = "Ubuntu payment ";
        System.out.println("Payment from" + payment);
        return payment;
    }

}
