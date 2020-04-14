package com.myProjects.creational.abstractFactory;

import com.myProjects.creational.abstractFactory.amex.AmexFactory;
import com.myProjects.creational.abstractFactory.visa.VisaFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
}
