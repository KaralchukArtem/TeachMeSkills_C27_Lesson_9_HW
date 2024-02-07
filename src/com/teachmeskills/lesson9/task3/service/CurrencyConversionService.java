package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.constant.ConstRate;

import java.util.Objects;

import static com.teachmeskills.lesson9.task3.constant.CurrencyCode.*;

public class CurrencyConversionService implements ConstRate {

    public static double currencyConversion(int currencySender, int currencyRecipient, double amount) {
        double[][] marRate = new double[][]{
                {USD, USD_TO_BYN},
                {EUR, EUR_TO_BYN},
                {GBP, GBP_TO_BYN},
                {JPY, JPY_TO_BYN},
                {CNY, CNY_TO_BYN}
        };

        switch (currencySender) {
            case USD:
                for (int i = 0; i < marRate.length; i++) {
                    for (int j = 0; j < marRate[i].length; j++) {
                        if (marRate[i][j] == currencyRecipient) {
                            amount = USD_TO_BYN / marRate[i][j+1] * amount;
                            break;
                        }
                    }
                }
                break;
            case EUR:
                for (int i = 0; i < marRate.length; i++) {
                    for (int j = 0; j < marRate[i].length; j++) {
                        if (marRate[i][j] == currencyRecipient) {
                            amount = EUR_TO_BYN / marRate[i][j+1] * amount;
                            break;
                        }
                    }
                }
            case GBP:
                for (int i = 0; i < marRate.length; i++) {
                    for (int j = 0; j < marRate[i].length; j++) {
                        if (marRate[i][j] == currencyRecipient) {
                            amount = GBP_TO_BYN / marRate[i][j+1] * amount;
                            break;
                        }
                    }
                }
            case JPY:
                for (int i = 0; i < marRate.length; i++) {
                    for (int j = 0; j < marRate[i].length; j++) {
                        if (marRate[i][j] == currencyRecipient) {
                            amount = JPY_TO_BYN / marRate[i][j+1] * amount;
                            break;
                        }
                    }
                }
            case CNY:
                for (int i = 0; i < marRate.length; i++) {
                    for (int j = 0; j < marRate[i].length; j++) {
                        if (marRate[i][j] == currencyRecipient) {
                            amount = CNY_TO_BYN / marRate[i][j+1] * amount;
                            break;
                        }
                    }
                }
        }
        return amount;
    }
}
