package com.saptarshi.das.designpatterns.chainofresponsibilitypattern.handlers;

public class NoOpsHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        System.out.println("Amount is too huge to process.");
    }
}
