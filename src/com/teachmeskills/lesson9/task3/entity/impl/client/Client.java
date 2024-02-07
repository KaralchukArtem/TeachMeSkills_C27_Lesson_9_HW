package com.teachmeskills.lesson9.task3.entity.impl.client;

import com.teachmeskills.lesson9.task3.entity.BaseCard;
import com.teachmeskills.lesson9.task3.service.СardTransactionsService;

import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private String passportNumber;
    private String dateOfBirth;
    private String postcode;
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private BaseCard[] cards;

    public Client(String name, String surname, String passportNumber, String dateOfBirth, String postcode, String country, String city, String street, String houseNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.postcode = postcode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public BaseCard[] getBaseCard() {
        return cards;
    }
    public void setBaseCard(BaseCard[] baseCard) {
        this.cards = baseCard;
    }
    public void transfer(String IBAN1,String IBAN2,int amount){
        if (!Objects.equals(IBAN1,IBAN2)){
            СardTransactionsService сardTransactionsService = new СardTransactionsService();
            сardTransactionsService.transfer(cards,IBAN1,IBAN2,amount);
        }else {
            System.out.println("Вы не можете сделать перевод на ту же карту\n");
        }
    }

    public void showInfo(){
        System.out.println(name + "  " + surname);
        for (int i = 0; i < cards.length; i++) {
            System.out.println("Номер карты - " + cards[i].getCardNumber() + " сумма на счете - " + cards[i].getCurrentAmount());
        }
        System.out.println();
    }
}
