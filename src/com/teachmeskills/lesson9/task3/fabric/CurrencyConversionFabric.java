package com.teachmeskills.lesson9.task3.fabric;

import com.teachmeskills.lesson9.task3.utils.ConstRate;

import java.util.Objects;

public class CurrencyConversionFabric implements ConstRate {

    public static double currencyConversion(String currencySender,String currencyRecipient,double amount){
        switch (currencySender){
            case "USD":
                if (Objects.equals(currencyRecipient,"EUR")){
                    amount = USD_TO_BYN / EUR_TO_BYN * amount;
                    break;
                } else if (Objects.equals(currencyRecipient,"USD")){
                    amount = 1 * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"GBP")){
                    amount = USD_TO_BYN / GBP_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"JPY")){
                    amount = USD_TO_BYN / JPY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"CNY")){
                    amount = USD_TO_BYN / CNY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"CNY")){
                    amount = USD_TO_BYN / CNY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"BYN")){
                    amount = USD_TO_BYN * amount;
                    break;
                }
            case "EUR":
                if (Objects.equals(currencyRecipient,"EUR")){
                    amount =1 * amount;
                    break;
                } else if (Objects.equals(currencyRecipient,"USD")){
                    amount = EUR_TO_BYN / USD_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"GBP")){
                    amount = EUR_TO_BYN / GBP_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"JPY")){
                    amount = EUR_TO_BYN / JPY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"CNY")){
                    amount = EUR_TO_BYN / CNY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"BYN")){
                    amount = EUR_TO_BYN * amount;
                    break;
                }
            case "GBP":
                if (Objects.equals(currencyRecipient,"EUR")){
                    amount = GBP_TO_BYN / EUR_TO_BYN * amount;
                    break;
                } else if (Objects.equals(currencyRecipient,"USD")){
                    amount = GBP_TO_BYN / USD_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"GBP")){
                    amount = 1 * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"JPY")){
                    amount = GBP_TO_BYN / JPY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"CNY")){
                    amount = GBP_TO_BYN / CNY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"BYN")){
                    amount = GBP_TO_BYN * amount;
                    break;
                }
            case "JPY":
                if (Objects.equals(currencyRecipient,"EUR")){
                    amount = JPY_TO_BYN / EUR_TO_BYN * amount;
                    break;
                } else if (Objects.equals(currencyRecipient,"USD")){
                    amount = JPY_TO_BYN / USD_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"GBP")){
                    amount = JPY_TO_BYN / GBP_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"JPY")){
                    amount = 1 * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"CNY")){
                    amount = JPY_TO_BYN / CNY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"BYN")){
                    amount = JPY_TO_BYN * amount;
                    break;
                }
            case "CNY":
                if (Objects.equals(currencyRecipient,"EUR")){
                    amount = CNY_TO_BYN / EUR_TO_BYN * amount;
                    break;
                } else if (Objects.equals(currencyRecipient,"USD")){
                    amount = CNY_TO_BYN / USD_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"GBP")){
                    amount = CNY_TO_BYN / GBP_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"JPY")){
                    amount = CNY_TO_BYN / JPY_TO_BYN * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"CNY")){
                    amount = 1 * amount;
                    break;
                }else if (Objects.equals(currencyRecipient,"BYN")){
                    amount = CNY_TO_BYN * amount;
                    break;
                }
        }
        return amount;
    }

}
