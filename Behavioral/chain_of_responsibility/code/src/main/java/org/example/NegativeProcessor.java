package org.example;

public class NegativeProcessor extends Processor {
    public NegativeProcessor (Processor next) {
        super(next);
    }
    public void process (Number request) {
        System.out.println("Request for NegativeProcessor");
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor: " + request.getNumber());
        } else {
            System.out.println("Skip NegativeProcessor");
            super.process(request);
        }
    }
}
