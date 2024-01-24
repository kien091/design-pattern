package org.example;

public abstract class Processor {
    private final Processor next;
    public Processor (Processor next) {
        this.next = next;
    }
    public void process (Number request) {
        if (next != null) {
            next.process(request);
        }
    }
}
