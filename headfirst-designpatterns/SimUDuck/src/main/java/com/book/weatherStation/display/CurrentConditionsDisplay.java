package com.book.weatherStation.display;

import com.book.weatherStation.inteface.DisplayElement;
import com.book.weatherStation.inteface.Observer;
import com.book.weatherStation.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;


    // 생성자에 weatherData라는 주제가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록합니다.
    public CurrentConditionsDisplay(WeatherData wd) {
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        // 온도 습도 저장
//        this.temperature = temp;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void update() {
        // 온도 습도 저장
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
