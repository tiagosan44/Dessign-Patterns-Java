package com.myProjects.structural.adapter;

public class EmployeeWebAdapter implements Employee {

    private EmployeeWeb instance;

    public EmployeeWebAdapter(EmployeeWeb employeeWeb) {
    }

    @Override
    public String getId() {
        return instance.getCc();
    }

    @Override
    public String getName() {
        return instance.getNombre();
    }

    @Override
    public String getLastName() {
        return instance.getApellido();
    }

    @Override
    public String getEmail() {
        return instance.getCorreo();
    }
}
