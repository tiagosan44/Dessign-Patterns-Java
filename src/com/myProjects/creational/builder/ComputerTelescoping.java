package com.myProjects.creational.builder;

public class ComputerTelescoping {

    private String processor;
    private String screen;
    private String graphics;
    private String ram;

    public ComputerTelescoping(String processor) {
        this.processor = processor;
    }

    public ComputerTelescoping(String processor, String screen) {
        this(processor);
        this.screen = screen;
    }

    public ComputerTelescoping(String processor, String screen, String graphics) {
        this(processor, screen);
        this.graphics = graphics;
    }

    public ComputerTelescoping(String processor, String screen, String graphics, String ram) {
        this(processor, screen, graphics);
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getScreen() {
        return screen;
    }

    public String getGraphics() {
        return graphics;
    }

    public String getRam() {
        return ram;
    }
}
