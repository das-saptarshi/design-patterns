package com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern;

import com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers.AtmHandler;
import com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers.BankHandler;
import com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers.NoOpsHandler;
import com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers.PaymentHandler;
import com.saptarshi.das.designpatterns.behavioral.chainofresponsibilitypattern.handlers.PaypalHandler;

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
