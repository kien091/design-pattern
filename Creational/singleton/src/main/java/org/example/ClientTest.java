package org.example;

public class ClientTest {
    public static void main(String[] args) {
        // test EagerInitialization
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("eager1");
        System.out.println(eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());
    }
}