package com.myProjects.behavioral.command;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lightList;

    public AllLightsCommand(List<Light> lightList) {
        this.lightList = lightList;
    }

    @Override
    public void execute() {
        lightList.forEach(light -> {
            if (light.isOn())
                light.toggle();
        });
    }
}
