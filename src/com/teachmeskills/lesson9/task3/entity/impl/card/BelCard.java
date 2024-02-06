package com.teachmeskills.lesson9.task3.entity.impl.card;

import com.teachmeskills.lesson9.task3.entity.BaseCard;
import com.teachmeskills.lesson9.task3.service.СardTransactionsService;

public class BelCard extends BaseCard {
    public BelCard(String cardNumber, String cvc, int currentAmount, String BIC, String IBAN, String currency,int limit) {
        super(cardNumber, cvc, currentAmount, BIC, IBAN, currency,limit);
    }
    @Override
    public void deposit(double currentAmount) {
        super.setCurrentAmount(super.getCurrentAmount()+currentAmount);
    }
    @Override
    public void withdraw(double currentAmount) {
        super.setCurrentAmount(super.getCurrentAmount()-currentAmount);
    }
}
