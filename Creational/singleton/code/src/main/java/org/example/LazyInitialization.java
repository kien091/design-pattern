package org.example;

public class LazyInitialization {
    private static LazyInitialization instance;
    private String name;
    private LazyInitialization(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}
