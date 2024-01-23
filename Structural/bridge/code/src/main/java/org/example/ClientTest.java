package org.example;

public class ClientTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.setColor(new Blue());
        System.out.println(rectangle);
        Shape circle = new Circle();
        circle.setColor(new Blue());
        System.out.println(circle);
    }
}