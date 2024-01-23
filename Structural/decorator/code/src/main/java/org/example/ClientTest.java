package org.example;

public class ClientTest {
    public static void main(String[] args) {
        TomatoPizza tomatoPizza = new TomatoPizza();
        System.out.println(tomatoPizza.doPizza());
        ChickenPizza chickenPizza = new ChickenPizza();
        System.out.println(chickenPizza.doPizza());

        System.out.println("=== Add decorator ===");
        CheeseDecorator cheeseDecorator = new CheeseDecorator(tomatoPizza);
        System.out.println(cheeseDecorator.doPizza());
        PepperDecorator pepperDecorator = new PepperDecorator(chickenPizza);
        System.out.println(pepperDecorator.doPizza());

        System.out.println("=== Add decorator again ===");
        CheeseDecorator cheeseDecorator2 = new CheeseDecorator(cheeseDecorator);
        System.out.println(cheeseDecorator2.doPizza());
    }
}