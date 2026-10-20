package com.continuouslearning.lab.exploring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component 
@ConditionalOnProperty(name ="payment.provider", havingValue = "ubuntupay")
public class UbuntuPaymentService implements PaymentService {

    @Override 
    public String pay(){

        String payment = "Ubuntu payment ";
        System.out.println("Payment from" + payment);
        return payment;
    }

}
