package com.teachmeskills.lesson9.task3.entity;

public abstract class BaseCard {

    private String cardNumber;
    private String cvc;
    private double currentAmount;
    // BIC банк
    private String BIC;
    // IBAN счет в банке
    private String IBAN;
    private String currency;
    private int limits;

    public BaseCard(String cardNumber, String cvc, int currentAmount, String BIC, String IBAN, String currency, int limits) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.currentAmount = currentAmount;
        this.BIC = BIC;
        this.IBAN = IBAN;
        this.currency = currency;
        this.limits = limits;
    }

    public abstract void deposit(double currentAmount);
    public abstract void withdraw(double currentAmount);


    public String getCardNumber() {
        return cardNumber;
    }
    public String getCvc() {
        return cvc;
    }
    public double getCurrentAmount() {
        return currentAmount;
    }
    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }
    public String getBIC() {
        return BIC;
    }
    public String getIBAN() {
        return IBAN;
    }
    public String getCurrency() {
        return currency;
    }
    public int getLimits() {
        return limits;
    }

}
