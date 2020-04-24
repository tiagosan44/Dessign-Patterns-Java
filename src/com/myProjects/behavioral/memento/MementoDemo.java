package com.myProjects.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Employee employee = new Employee();

        employee.setName("John Connor");
        employee.setAddress("34534 Street");
        employee.setPhone("4356654");

        System.out.println("employee before save:   " + employee);

        careTaker.save(employee);

        employee.setPhone("9876675");

        careTaker.save(employee);

        System.out.println("employee after changed phone:   " + employee);

        employee.setPhone("785665758"); // We haven't save

        careTaker.revert(employee);

        System.out.println("Revert to the last save point:   " + employee);

        careTaker.revert(employee);

        System.out.println("Revert to original:   " + employee);
    }

}
