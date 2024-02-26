package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext vendingMachine = new VendingMachineContext();

        vendingMachine.setState(new ReadyState());
        vendingMachine.request();

        vendingMachine.setState(new ProductSelectState());
        vendingMachine.request();

        vendingMachine.setState(new PaymentPendingState());
        vendingMachine.request();

        vendingMachine.setState(new OutOfStockState());
        vendingMachine.request();
    }
}