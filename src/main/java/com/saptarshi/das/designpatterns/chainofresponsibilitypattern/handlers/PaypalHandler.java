package com.saptarshi.das.designpatterns.chainofresponsibilitypattern.handlers;

public class PaypalHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 2000) {
            System.out.println("Amount: " + amount + " handled by Paypal.");
        } else {
            next.handlePayment(amount);
        }
    }
}
