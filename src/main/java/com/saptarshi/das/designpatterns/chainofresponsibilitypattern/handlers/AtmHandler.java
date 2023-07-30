package com.saptarshi.das.designpatterns.chainofresponsibilitypattern.handlers;

public class AtmHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Amount: " + amount + " handled by ATM.");
        } else {
            next.handlePayment(amount);
        }
    }
}
