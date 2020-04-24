package com.myProjects.behavioral.mediator;

import com.myProjects.behavioral.command.Command;
import com.myProjects.behavioral.command.Light;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();

        mediator.registerLight(bedRoomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnLightsCommand = new TurnOnLightsCommand(mediator);
        turnOnLightsCommand.execute();
        Command turnOffLightsCommand = new TurnOffLightsCommand(mediator);
        turnOffLightsCommand.execute();
    }
}
