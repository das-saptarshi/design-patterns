package com.saptarshi.das.designpatterns.behavioral.templatemethodpattern;

import com.saptarshi.das.designpatterns.behavioral.templatemethodpattern.template.MerchantPayment;
import com.saptarshi.das.designpatterns.behavioral.templatemethodpattern.template.PaymentTemplate;
import com.saptarshi.das.designpatterns.behavioral.templatemethodpattern.template.UserPayment;

public class App {
    public static void main(String[] args) {

        final PaymentTemplate userPayment = new UserPayment();
        final PaymentTemplate merchantPayment = new MerchantPayment();

        userPayment.sendMoney("saptarshi@upi", "zeus@upi", 100);
        merchantPayment.sendMoney("zeus@upi", "saptarshi@upi", 100);
    }
}
