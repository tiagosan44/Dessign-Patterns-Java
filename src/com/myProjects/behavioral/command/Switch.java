package com.myProjects.behavioral.command;

public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
