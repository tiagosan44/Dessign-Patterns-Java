package com.myProjects.behavioral.memento;

import java.util.Stack;

public class CareTaker {

    private Stack<EmployeeMemento> mementos = new Stack<>();

    public void save(Employee employee) {
        mementos.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(mementos.pop());
    }
}
