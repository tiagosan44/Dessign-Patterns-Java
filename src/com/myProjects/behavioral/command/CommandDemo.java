package com.myProjects.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();
        Command toggleCommand = new ToggleCommand(bedRoomLight);

        List<Light> lightList = new ArrayList<>();
        lightList.add(bedRoomLight);
        lightList.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lightList);

        Switch lightSwitch = new Switch();
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
