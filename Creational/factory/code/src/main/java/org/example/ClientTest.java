package org.example;

public class ClientTest {
    public static void main(String[] args) {
        Product phone = ProductFactory.createProduct(ProductType.PHONE);
        System.out.println(phone.getName());

        Product laptop = ProductFactory.createProduct(ProductType.LAPTOP);
        System.out.println(laptop.getName());

        Product tablet = ProductFactory.createProduct(ProductType.TABLET);
        System.out.println(tablet.getName());
    }
}