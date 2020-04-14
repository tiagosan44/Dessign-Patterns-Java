package com.myProjects.creational.abstractFactory;

public abstract class CreditCard {

    protected int cardNumber;

    protected int csc;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCsc() {
        return csc;
    }

    public void setCsc(int csc) {
        this.csc = csc;
    }
}
