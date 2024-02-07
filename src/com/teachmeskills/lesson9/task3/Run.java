package com.teachmeskills.lesson9.task3;

import com.teachmeskills.lesson9.task3.entity.impl.client.Client;

import static com.teachmeskills.lesson9.task3.service.CreateCardsService.createCards;

public class Run {
    public static void main(String[] args) {

        Client client = new Client("Артём", "Каральчук", "MC1324512", "21.04.2003","213412", "Belarus","Minsk","Luurke", "32");

        client.setBaseCard(createCards());
        client.showInfo();
        client.transfer("BY33-2222","BY33-1111",45);
        client.showInfo();
    }
}
