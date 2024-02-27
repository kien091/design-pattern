package org.example;

public class ThreadSafe {
    private static volatile ThreadSafe instance;
    private ThreadSafe(){}

    public synchronized static ThreadSafe getInstance(){
        if(instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }
}
