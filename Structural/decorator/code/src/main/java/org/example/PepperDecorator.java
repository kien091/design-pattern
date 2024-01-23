package org.example;

public class PepperDecorator extends PizzaDecorator{
    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        return getPizza().doPizza() + addPepper();
    }

    // additional behavior
    private String addPepper() {
        return " + pepper";
    }
}
