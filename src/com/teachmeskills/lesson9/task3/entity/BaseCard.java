package com.teachmeskills.lesson9.task3.entity;

public abstract class BaseCard {

    protected String cardNumber;
    protected String cvc;
    protected double currentAmount;
    // BIC банк
    protected String BIC;
    // IBAN счет в банке
    protected String IBAN;
    protected int currencyCode;
    protected double commissionPercentage;
    protected int limits;

    public BaseCard(String cardNumber, String cvc, int currentAmount, String BIC, String IBAN, int currencyCode) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.currentAmount = currentAmount;
        this.BIC = BIC;
        this.IBAN = IBAN;
        this.currencyCode = currencyCode;
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
    public int getCurrencyCode() {
        return currencyCode;
    }
    public int getLimits() {
        return limits;
    }
    public double getCommissionPercentage() {
        return commissionPercentage;
    }
}
