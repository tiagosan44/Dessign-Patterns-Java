package com.myProjects.behavioral.mediator;

import com.myProjects.behavioral.command.Command;

public class TurnOffLightsCommand implements Command {

    Mediator mediator;

    public TurnOffLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
