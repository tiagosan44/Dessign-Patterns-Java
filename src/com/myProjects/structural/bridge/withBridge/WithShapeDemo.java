package com.myProjects.structural.bridge.withBridge;

public class WithShapeDemo {

    public static void main(String[] args) {
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green();

        Circle redCircle = new Circle(red);
        Square greenSquare = new Square(green);
        Circle blueCircle = new Circle(blue);

        System.out.println(redCircle);
        System.out.println(greenSquare);
        System.out.println(blueCircle);
    }
}
