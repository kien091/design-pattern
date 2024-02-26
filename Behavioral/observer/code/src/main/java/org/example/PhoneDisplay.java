package org.example;

public class PhoneDisplay implements Observer{
    @Override
    public void update(String weather) {
        System.out.println("Phone Display: " + weather);
    }
}
