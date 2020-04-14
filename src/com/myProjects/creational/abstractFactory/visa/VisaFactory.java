package com.myProjects.creational.abstractFactory.visa;

import com.myProjects.creational.abstractFactory.CardType;
import com.myProjects.creational.abstractFactory.CreditCard;
import com.myProjects.creational.abstractFactory.CreditCardFactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD:
                return new VisaGoldCreditCard();
            case BLACK:
                return new VisaBlackCreditCard();
        }
        return null;
    }
}
