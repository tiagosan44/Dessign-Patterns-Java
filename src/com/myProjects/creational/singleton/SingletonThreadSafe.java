package com.myProjects.creational.singleton;

public class SingletonThreadSafe {

    //This is update the reference in the main memory when the instance is created on on of the threads
    private static volatile SingletonThreadSafe instance = null;

    //This avoid the class to be reinstatiated by reflection
    private SingletonThreadSafe() {
        if(instance != null) {
            throw new RuntimeException("Use getInstance method to create");
        }
    }

    //This block access from other threads when a thread is creating a instance
    public static SingletonThreadSafe getInstance() {
        if(instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if(instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
