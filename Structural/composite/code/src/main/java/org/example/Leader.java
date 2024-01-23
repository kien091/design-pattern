package org.example;

import java.util.ArrayList;

public class Leader extends Employee{
    private ArrayList<Employee> employees = new ArrayList<>();

    public Leader(String id, String name, int age, int salary, Position position) {
        super(id, name, age, salary, position);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("================ Call Leader ====================");
        System.out.println("Hi, I'm a leader!");
        System.out.println(this);
        System.out.println("I will be call my member!");
        for (Employee employee : employees) {
            employee.print();
        }
    }
}
