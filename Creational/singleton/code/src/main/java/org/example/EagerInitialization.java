package org.example;

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private String name;
    private EagerInitialization(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
