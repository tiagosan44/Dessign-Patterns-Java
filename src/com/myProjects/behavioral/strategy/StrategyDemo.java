package com.myProjects.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        CreditCard amex = new CreditCard(new AmexStrategy());

        amex.setNumber("45766756757");

        System.out.println("Is amex valid: " + amex.isValid());

        CreditCard visa = new CreditCard(new VisaStrategy());

        visa.setNumber("46466756757");

        System.out.println("Is amex valid: " + visa.isValid());

        CreditCard master = new CreditCard(new MasterStrategy());

        master.setNumber("92966756757");

        System.out.println("Is amex valid: " + master.isValid());
    }
}
