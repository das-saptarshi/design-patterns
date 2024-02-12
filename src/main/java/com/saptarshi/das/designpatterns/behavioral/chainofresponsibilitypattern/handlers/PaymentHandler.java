package com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers;

import lombok.Setter;

public abstract class PaymentHandler {
    @Setter protected PaymentHandler next;
    public abstract void handlePayment(double amount);
}
