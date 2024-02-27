package org.example;

public record Book(int price, String isbnNumber) implements ItemElement {

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
