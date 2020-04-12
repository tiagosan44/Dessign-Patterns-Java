package com.myProjects.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        ComputerSetters computerSetters = new ComputerSetters();

        System.out.println(computerSetters.getProcessor());
        System.out.println(computerSetters.getScreen());
        System.out.println(computerSetters.getGraphics());
        System.out.println(computerSetters.getRam());

        ComputerTelescoping computerTelescoping = new ComputerTelescoping("Intel", "BenQ", "AMD", "16Gb");

        System.out.println(computerTelescoping.getProcessor());
        System.out.println(computerTelescoping.getScreen());
        System.out.println(computerTelescoping.getGraphics());
        System.out.println(computerTelescoping.getRam());

        ComputerBuilder computerBuilder = new ComputerBuilder.Builder()
                .processor("Ryzer")
                .screen("Samsung")
                .graphics("Nvidia")
                .ram("32GB")
                .build();

        System.out.println(computerBuilder.getProcessor());
        System.out.println(computerBuilder.getScreen());
        System.out.println(computerBuilder.getGraphics());
        System.out.println(computerBuilder.getRam());
    }
}
