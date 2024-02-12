package com.saptarshi.das.designpatterns.templatemethodpattern.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MerchantPayment extends PaymentTemplate {

    @Override
    protected void validatePayment() {
        log.info("Payment is valid.");
    }

    @Override
    protected void debitAmountFrom(String user, Integer amount) {
        log.info("Amount {} debited from user {}.", amount, user);
    }

    @Override
    protected Integer deductFeesFrom(Integer amount) {
        log.info("Amount 1 deducted from amount {} as processing fees.", amount);
        return amount - 1;
    }

    @Override
    protected void creditAmountTo(String user, Integer amount) {
        log.info("Amount {} credited to user {}.", amount, user);
    }
}
