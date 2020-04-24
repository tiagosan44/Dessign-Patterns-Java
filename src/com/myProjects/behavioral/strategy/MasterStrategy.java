package com.myProjects.behavioral.strategy;

public class MasterStrategy extends ValidationStrategy{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("929");
    }
}
