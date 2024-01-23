package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Boss extends Employee{
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Boss(String id, String name, int age, int salary, Position position) {
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
        System.out.println("================ Call Boss ====================");
        System.out.println("Hi, I'm a boss!");
        System.out.println(this);
        System.out.println("I will be call my employees!");
        for(Employee employee : employees){
            employee.print();
        }
    }
}
