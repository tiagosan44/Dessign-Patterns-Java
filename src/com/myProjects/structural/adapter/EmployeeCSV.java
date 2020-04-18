package com.myProjects.structural.adapter;

public class EmployeeCSV {

    public int cc;
    public String name;
    public String lastName;
    public String email;

    public EmployeeCSV(int cc, String name, String lastName, String email) {
        this.cc = cc;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getCc() {
        return cc;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
