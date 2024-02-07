package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.constant.ConstRate;
import com.teachmeskills.lesson9.task3.constant.CurrencyCode;

public class CurrencyConversionService implements ConstRate, CurrencyCode {

    public static double currencyConversion(int currencySender, int currencyRecipient, double amount) {
        double[][] marRate = new double[][]{
                {USD, USD_TO_BYN},
                {EUR, EUR_TO_BYN},
                {GBP, GBP_TO_BYN},
                {JPY, JPY_TO_BYN},
                {CNY, CNY_TO_BYN}
        };
        double rateSender = 0;
        double rateRecipient = 0;
        for (int i = 0; i < marRate.length; i++) {
            if (marRate[i][0] == currencySender) {
                rateSender = marRate[i][1];
            } else if (marRate[i][0] == currencyRecipient) {
                rateRecipient = marRate[i][1];
            }
        }
        amount = rateSender / rateRecipient * amount;
        return amount;
    }
}
