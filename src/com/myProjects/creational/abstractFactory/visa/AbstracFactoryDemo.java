package com.myProjects.creational.abstractFactory.visa;

import com.myProjects.creational.abstractFactory.CardType;
import com.myProjects.creational.abstractFactory.CreditCard;
import com.myProjects.creational.abstractFactory.CreditCardFactory;

public class AbstracFactoryDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(750);
        CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard.getClass());
        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard1 = abstractFactory.getCreditCard(CardType.BLACK);
        System.out.println(creditCard1.getClass());
    }
}
