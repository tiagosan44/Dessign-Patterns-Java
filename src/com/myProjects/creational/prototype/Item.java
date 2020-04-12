package com.myProjects.creational.prototype;

public abstract class Item implements Cloneable{

    private String title;
    private double price;
    private String url;
    private DummyObject dummyObject;

    //It's a good practice to create your own interface and create your own implementation of clone
    //When we have object references you can obtain several object references pointing to the same object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DummyObject getDummyObject() {
        return dummyObject;
    }

    public void setDummyObject(DummyObject dummyObject) {
        this.dummyObject = dummyObject;
    }
}
