package org.example;

public class ZeroProcessor extends Processor {
    public ZeroProcessor (Processor next) {
        super(next);
    }
    public void process (Number request) {
        System.out.println("Request for ZeroProcessor");
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor: " + request.getNumber());
        } else {
            System.out.println("Skip ZeroProcessor");
            super.process(request);
        }
    }
}
