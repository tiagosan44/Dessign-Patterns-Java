package com.myProjects.creational.prototype;

public class PrototypeDemo {

    public static  void main(String[] args){
        ShallowPrototype shallowPrototype = new ShallowPrototype("Dummy string", new DummyObject());

        System.out.println("Original");
        System.out.println(shallowPrototype.getDummyString());
        System.out.println(shallowPrototype.getDummyObject());

        ShallowPrototype shallowPrototypeClone = shallowPrototype.clone();

        System.out.println("Clone");
        System.out.println(shallowPrototypeClone.getDummyString());
        System.out.println(shallowPrototypeClone.getDummyObject());

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("basicMovie");
        movie.setTitle("Creation patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());
        System.out.println(movie.getDummyObject());

        Movie otherMovie = (Movie) registry.createItem("basicMovie");
        otherMovie.setTitle("Gang of four");

        System.out.println(otherMovie);
        System.out.println(otherMovie.getTitle());
        System.out.println(otherMovie.getPrice());
        System.out.println(otherMovie.getUrl());
        System.out.println(otherMovie.getDummyObject());
    }
}
