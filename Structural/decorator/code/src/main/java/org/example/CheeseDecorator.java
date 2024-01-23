package org.example;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        return getPizza().doPizza() + addCheese();
    }

    // additional behavior
    private String addCheese() {
        return " + cheese";
    }
}
