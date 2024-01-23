package org.example;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String id, String name, int age, int salary, Position position) {
        super(id, name, age, salary, position);
    }

    @Override
    public void add(Employee employee) {
        // do nothing because this is leaf node
    }

    @Override
    public void remove(Employee employee) {
        // do nothing because this is leaf node
    }

    @Override
    public void print() {
        System.out.println("================ Call Business Analyst ====================");
        System.out.println("Hi, I'm a business analyst!");
        System.out.println(this);
    }
}
