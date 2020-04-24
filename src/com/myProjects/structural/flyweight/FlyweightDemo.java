package com.myProjects.structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("SamsungTV", 246);
        inventorySystem.takeOrder("Mac laptop", 657);
        inventorySystem.takeOrder("Beats headphones", 435);
        inventorySystem.takeOrder("SamsungTV", 745);
        inventorySystem.takeOrder("Mac laptop", 879);
        inventorySystem.takeOrder("Beats headphones", 874);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }


}
