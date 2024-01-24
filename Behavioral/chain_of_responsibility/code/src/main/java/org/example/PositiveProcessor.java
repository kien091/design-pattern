package org.example;

public class PositiveProcessor extends Processor{
    public PositiveProcessor (Processor next) {
        super(next);
    }
    public void process (Number request) {
        System.out.println("Request for PositiveProcessor");
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor: " + request.getNumber());
        } else {
            System.out.println("Skip PositiveProcessor");
            super.process(request);
        }
    }
}
