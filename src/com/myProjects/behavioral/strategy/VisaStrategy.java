package com.myProjects.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("464");
    }
}
