package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.entity.BaseCard;
import com.teachmeskills.lesson9.task3.entity.impl.card.BelCard;
import com.teachmeskills.lesson9.task3.entity.impl.card.MasterCard;
import com.teachmeskills.lesson9.task3.entity.impl.card.VisaCard;

import static com.teachmeskills.lesson9.task3.constant.CurrencyCode.*;

public class CreateCardsService {
    public static BaseCard[] createCards(){
        BaseCard belCard = new BelCard("9911-1111-1111-1111","312",100,"PJCBBY2XXXX","BY33-1111",USD);
        BaseCard belCard1 = new BelCard("9922-2222-2222-2222","322",100,"PJCBBY2XXXX","BY33-2222",EUR);
        BaseCard visaCard = new VisaCard("4433-3333-3333-3333","332",100,"PJCBBY2XXXX","BY33-3333",GBP);
        BaseCard visaCard1 = new VisaCard("4444-4444-4444-4444","342",100,"PJCBBY2XXXX","BY33-4444",JPY);
        BaseCard masterCard = new MasterCard("5555-5555-5555-5555","352",100,"PJCBBY2XXXX","BY33-5555",CNY);
        BaseCard masterCard1 = new MasterCard("5566-6666-6666-6666","362",100,"PJCBBY2XXXX","BY33-6666",BYN);
        return new BaseCard[]{belCard,belCard1,visaCard1,visaCard,masterCard1,masterCard};
    }
}
