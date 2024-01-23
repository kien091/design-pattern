package org.example;

public class Developer extends Employee{

    public Developer(String id, String name, int age, int salary, Position position) {
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
        System.out.println("================ Call Developer ====================");
        System.out.println("Hi, I'm a developer!");
        System.out.println(this);
    }
}
