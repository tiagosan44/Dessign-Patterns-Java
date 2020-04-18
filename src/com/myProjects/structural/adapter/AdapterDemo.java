package com.myProjects.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new EmployeeDB("1234", "Sheldon", "Cooper", "shelly@cooper.com"));
        employees.add(new EmployeeDB("5456", "Sherlock", "Holmes", "sherlock@holmes.com"));

        EmployeeWeb employeeWeb = new EmployeeWeb("5757", "Kakaroto", "Toriyama", "kakaroto@toriyama.com");
        employees.add(new EmployeeWebAdapter(employeeWeb));

        EmployeeCSV employeeCSV = new EmployeeCSV(8567, "Kratos", "Papastapopulus", "kratos@toriyama.com");
        employees.add(new EmployeeCSVAdapter(employeeCSV));
        System.out.println(employees);
    }
}
