package org.example;

public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeSpecification();
    }
}
