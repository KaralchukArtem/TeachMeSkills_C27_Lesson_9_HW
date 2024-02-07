package com.teachmeskills.lesson9.task3.entity.impl.card;

import com.teachmeskills.lesson9.task3.entity.BaseCard;

import static com.teachmeskills.lesson9.task3.constant.LimitConst.MASTER_CARD_LIMIT;
import static com.teachmeskills.lesson9.task3.constant.Сommission.COMMISSION_Master;

public class MasterCard extends BaseCard {
    public MasterCard(String cardNumber, String cvc, int currentAmount, String BIC, String IBAN, int currencyCode) {
        super(cardNumber, cvc, currentAmount, BIC, IBAN, currencyCode);
        this.commissionPercentage = COMMISSION_Master;
        this.limits = MASTER_CARD_LIMIT;
    }

    @Override
    public void deposit(double currentAmount) {
        super.setCurrentAmount(super.getCurrentAmount() + currentAmount);
    }

    @Override
    public void withdraw(double currentAmount) {
        super.setCurrentAmount(super.getCurrentAmount() - currentAmount);
    }
}
