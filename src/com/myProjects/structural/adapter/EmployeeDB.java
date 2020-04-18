package com.myProjects.structural.adapter;

public class EmployeeDB implements Employee{

    private String id;
    private String name;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
