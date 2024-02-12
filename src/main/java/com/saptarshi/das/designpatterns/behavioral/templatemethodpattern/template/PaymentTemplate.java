package com.saptarshi.das.designpatterns.behavioral.templatemethodpattern.template;

public abstract class PaymentTemplate {
    protected abstract void validatePayment();
    protected abstract void debitAmountFrom(String user, Integer amount);
    protected abstract Integer deductFeesFrom(Integer amount);
    protected abstract void creditAmountTo(String user, Integer amount);

    public final void sendMoney(final String sender, final String receiver, final Integer amount) {
        validatePayment();
        debitAmountFrom(sender, amount);
        final Integer feeAdjustedAmount = deductFeesFrom(amount);
        creditAmountTo(receiver, feeAdjustedAmount);
    }
}
