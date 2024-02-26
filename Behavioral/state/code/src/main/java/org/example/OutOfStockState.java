package org.example;

public class OutOfStockState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Out of stock: Product unavailable");
    }
}
