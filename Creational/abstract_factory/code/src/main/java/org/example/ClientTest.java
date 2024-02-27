package org.example;

public class ClientTest {
    public static void main(String[] args) {
        // Create cars for North America
        CarFactory northAmericaCarFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaCarFactory.createCar();
        CarSpecification northAmericaCarSpecification = northAmericaCarFactory.createCarSpecification();

        northAmericaCar.assemble();
        northAmericaCarSpecification.display();

        // Create cars for Europe
        System.out.println();
        CarFactory europeCarFactory = new EuropeCarFactory();
        Car europeCar = europeCarFactory.createCar();
        CarSpecification europeCarSpecification = europeCarFactory.createCarSpecification();

        europeCar.assemble();
        europeCarSpecification.display();
    }
}