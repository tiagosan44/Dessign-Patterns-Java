package com.myProjects.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setUrl("ANY URL");
        movie.setRuntime("2 hours");
        movie.setDummyObject(new DummyObject());
        items.put("basicMovie", movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(27.99);
        book.setUrl("ANY URL");
        book.setNumberOfPages(300);
        items.put("basicBook", book);
    }
}
