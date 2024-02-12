package com.saptarshi.das.designpatterns.templatemethodpattern;

import com.saptarshi.das.designpatterns.templatemethodpattern.template.MerchantPayment;
import com.saptarshi.das.designpatterns.templatemethodpattern.template.PaymentTemplate;
import com.saptarshi.das.designpatterns.templatemethodpattern.template.UserPayment;

public class App {
    public static void main(String[] args) {

        final PaymentTemplate userPayment = new UserPayment();
        final PaymentTemplate merchantPayment = new MerchantPayment();

        userPayment.sendMoney("saptarshi@upi", "zeus@upi", 100);
        merchantPayment.sendMoney("zeus@upi", "saptarshi@upi", 100);
    }
}
