package com.myProjects.behavioral.state;

public class Fan {

    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);
        this.state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanOffState() {
        return fanOffState;
    }
}
