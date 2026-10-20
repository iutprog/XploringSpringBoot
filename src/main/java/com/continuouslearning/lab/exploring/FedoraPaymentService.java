package com.continuouslearning.lab.exploring;

import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Controller;
// import org.springframework.stereotype.Repository;
// import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.RestController;

@Component 
// @Service 
// @RestController 
// @Repository 
// @Controller 
public class FedoraPaymentService implements PaymentService{

    @Override
    public String pay(){

        String payment = "Fedora payment ";
        System.out.println("Payment from" + payment);
        return payment;
    }

}
