package com.myProjects.behavioral.mediator;

import com.myProjects.behavioral.command.Command;

public class TurnOnLightsCommand implements Command {

    private Mediator mediator;

    public TurnOnLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
