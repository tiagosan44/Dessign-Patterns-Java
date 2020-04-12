package com.myProjects.creational.prototype;

public class ShallowPrototype implements Cloneable {

    private String dummyString;
    private DummyObject dummyObject;

    public ShallowPrototype(String dummyString, DummyObject dummyObject) {
        this.dummyString = dummyString;
        this.dummyObject = dummyObject;
    }

    public ShallowPrototype clone() {
        try {
            return (ShallowPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getDummyString() {
        return dummyString;
    }

    public DummyObject getDummyObject() {
        return dummyObject;
    }
}
