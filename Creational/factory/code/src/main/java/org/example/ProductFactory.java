package org.example;

public class ProductFactory {
    public static Product createProduct(ProductType productType){
        return switch (productType) {
            case PHONE -> new Phone();
            case LAPTOP -> new Laptop();
            default -> throw new IllegalArgumentException("Invalid product type: " + productType);
        };
    }
}
