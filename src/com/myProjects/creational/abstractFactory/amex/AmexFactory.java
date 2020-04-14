package com.myProjects.creational.abstractFactory.amex;

import com.myProjects.creational.abstractFactory.CardType;
import com.myProjects.creational.abstractFactory.CreditCard;
import com.myProjects.creational.abstractFactory.CreditCardFactory;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
        }
        return null;
    }
}
