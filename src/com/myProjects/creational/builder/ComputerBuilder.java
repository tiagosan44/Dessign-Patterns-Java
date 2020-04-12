package com.myProjects.creational.builder;

public class ComputerBuilder {

    private final String processor;
    private final String screen;
    private final String graphics;
    private final String ram;

    private ComputerBuilder(Builder builder) {
        this.processor = builder.processor;
        this.screen = builder.screen;
        this.graphics = builder.graphics;
        this.ram = builder.ram;
    }

    public static class Builder {
        private String processor;
        private String screen;
        private String graphics;
        private String ram;

        public Builder() {

        }

        public ComputerBuilder build() {
            return new ComputerBuilder(this);
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder graphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }
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
