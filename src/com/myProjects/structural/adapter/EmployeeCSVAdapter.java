package com.myProjects.structural.adapter;

public class EmployeeCSVAdapter implements Employee{

    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return this.instance.getCc() + "";
    }

    @Override
    public String getName() {
        return this.instance.getName();
    }

    @Override
    public String getLastName() {
        return this.instance.getLastName();
    }

    @Override
    public String getEmail() {
        return this.instance.getEmail();
    }
}
