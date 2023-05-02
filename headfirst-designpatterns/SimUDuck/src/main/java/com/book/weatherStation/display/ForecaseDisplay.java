package com.book.weatherStation.display;

import com.book.weatherStation.inteface.DisplayElement;
import com.book.weatherStation.inteface.Observer;
import com.book.weatherStation.subject.WeatherData;

public abstract class ForecaseDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;
    public ForecaseDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
//        display(); 틀림
    }

    public void display() {
        // 디스플레이 코드
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
