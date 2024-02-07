package com.teachmeskills.lesson9.task3.service;
import com.teachmeskills.lesson9.task3.entity.BaseCard;
import static com.teachmeskills.lesson9.task3.service.CurrencyConversionService.currencyConversion;

public class СardTransactionsService {

    public void transfer(BaseCard[] baseCard, String IBAN1, String IBAN2, double amount) {
        BaseCard sender = null, recipient = null;
        for (BaseCard card : baseCard) {
            if (card.getIBAN().equals(IBAN1)) {
                sender = card;
            }
            if (card.getIBAN().equals(IBAN2)) {
                recipient = card;
            }
        }
        assert sender != null;
        if ((amount > 0) & (sender.getLimits() > amount)) {
            assert recipient != null;
            translationConversion(sender, recipient, amount);
        } else {
            System.out.println("Введено не верная сумма пополнения");
        }
    }

    private void translationConversion(BaseCard sender, BaseCard recipient, double amount) {
        double commision = amount * sender.getCommissionPercentage() /100;;
        amount += commision;
        double a = currencyConversion(sender.getCurrencyCode(), recipient.getCurrencyCode(), amount);
        System.out.println("Номер карты - " + sender.getCardNumber() + " сумма на счете - " + sender.getCurrentAmount());
        sender.withdraw(amount);
        System.out.println("Сняли - " + amount);
        System.out.println("Номер карты - " + sender.getCardNumber() + " сумма на счете - " + sender.getCurrentAmount());
        System.out.println("Конвертировали " + amount + " ---> " +a);
        System.out.println("Номер карты - " + recipient.getCardNumber() + " сумма на счете - " + recipient.getCurrentAmount());
        recipient.deposit(a);
        System.out.println("Положили - " + a);
        System.out.println("Номер карты - " + recipient.getCardNumber() + " сумма на счете - " + recipient.getCurrentAmount());
        System.out.println("Коммисия за перевод " + commision+"\n");
    }
}
