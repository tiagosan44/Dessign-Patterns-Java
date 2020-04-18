package com.myProjects.structural.bridge.withoutBridge;

public class WithoutShapeDemo {

    public static void main(String[] args) {
        RedSquare redSquare = new RedSquare();
        BlueCircle blueCircle = new BlueCircle();

        // Here we have an ortongonal problem, if we want to create
        // any combination of color and square then we have to create a new class
        YellowCircle yellowCircle = new YellowCircle();

        redSquare.applyColor();
        blueCircle.applyColor();
        yellowCircle.applyColor();
    }

}
