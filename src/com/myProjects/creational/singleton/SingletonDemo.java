package com.myProjects.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
       Singleton instance = Singleton.getInstance();
       Singleton otherInstance = Singleton.getInstance();

       if (instance == otherInstance){
           System.out.println("Singleton");
           System.out.println("The instance is the same");
           System.out.println(instance);
           System.out.println(otherInstance);
       }

        SingletonLazy instanceL = SingletonLazy.getInstance();
        SingletonLazy otherInstanceL = SingletonLazy.getInstance();

        if (instanceL == otherInstanceL){
            System.out.println("Singleton lazy");
            System.out.println("The instance is the same");
            System.out.println(instanceL);
            System.out.println(otherInstanceL);
        }

        SingletonThreadSafe instanceTS = SingletonThreadSafe.getInstance();
        SingletonThreadSafe otherInstanceTS = SingletonThreadSafe.getInstance();

        if (instanceTS == otherInstanceTS){
            System.out.println("Singleton thread safe");
            System.out.println("The instance is the same");
            System.out.println(instanceTS);
            System.out.println(otherInstanceTS);
        }
    }

}
