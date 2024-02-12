package com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers;

public class BankHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Amount: " + amount + " handled by Bank.");
        } else {
            next.handlePayment(amount);
        }
    }
}
