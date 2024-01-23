package org.example;

public class BusinessAnalyst implements Customer{
    private Developer developer;

    public BusinessAnalyst(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void sendRequest(String message) {
        System.out.println("Business Analyst reading request: " + message);
        String translatedMessage = translateRequest(message);
        System.out.println("Business Analyst sending translated request: " + translatedMessage);
        developer.receive(translatedMessage);
    }

    public String translateRequest(String message){
        return "Hi Developer, " + message + " Yours, Business Analyst";
    }
}
