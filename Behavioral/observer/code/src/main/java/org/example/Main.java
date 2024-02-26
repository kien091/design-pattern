package org.example;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer tvDisplay = new TVDisplay();
        Observer phoneDisplay = new PhoneDisplay();

        weatherStation.addObserver(tvDisplay);
        weatherStation.addObserver(phoneDisplay);

        weatherStation.setWeather("Sunny");

        weatherStation.removeObserver(tvDisplay);
        weatherStation.setWeather("Rainy");
    }
}