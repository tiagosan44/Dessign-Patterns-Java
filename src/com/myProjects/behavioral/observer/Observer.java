package com.myProjects.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
