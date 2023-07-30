package com.saptarshi.das.designpatterns.chainofresponsibilitypattern;

import com.saptarshi.das.designpatterns.chainofresponsibilitypattern.handlers.*;

public class App {
    public static void main(String[] args) {
        final PaymentHandler noOpsHandler = new NoOpsHandler();
        final PaymentHandler bankHandler = new BankHandler();
        final PaymentHandler atmHandler = new AtmHandler();
        final PaymentHandler paypalHandler = new PaypalHandler();
        paypalHandler.setNext(noOpsHandler);
        atmHandler.setNext(paypalHandler);
        bankHandler.setNext(atmHandler);

        bankHandler.handlePayment(200);
        bankHandler.handlePayment(600);
        bankHandler.handlePayment(1700);
        bankHandler.handlePayment(2500);
    }
}
