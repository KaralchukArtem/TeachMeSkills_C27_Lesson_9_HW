package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.entity.BaseCard;

import static com.teachmeskills.lesson9.task3.fabric.CurrencyConversionFabric.currencyConversion;

public class СardTransactionsService {

    public BaseCard[] transfer(BaseCard[] baseCard, String IBAN1, String IBAN2, double amount) {
        BaseCard sender = null, recipient = null;

        for (BaseCard card : baseCard) {
            if (card.getIBAN().equals(IBAN1)) {
                sender = card;
            }
            if (card.getIBAN().equals(IBAN2)) {
                recipient = card;
            }
        }
        if (amount > 0 ){
            if ((sender.getCurrentAmount()-amount > 0) & (sender.getLimits() > amount )){
                translationConversion(sender,recipient,amount);
                return baseCard;
            }
        }else {
            System.out.println("Введено не верная сумма пополнения");
        }
        return baseCard;
    }

    private BaseCard transferLimit (){
        return null;
    }

    private BaseCard translationConversion(BaseCard sender,BaseCard recipient,double amount){
        double a = currencyConversion(sender.getCurrency(),recipient.getCurrency(),amount);
        System.out.println(sender.getCurrentAmount() + " sender 1");
        sender.withdraw(amount);
        System.out.println(amount + " Конвертация " + a);
        System.out.println(sender.getCurrentAmount() + " sender");
        System.out.println(recipient.getCurrentAmount() + " recipient 1");
        recipient.deposit(a);
        System.out.println(recipient.getCurrentAmount() + " recipient");

        return null;
    }
}
