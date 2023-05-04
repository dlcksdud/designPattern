package com.book.weatherStation.test;

import com.book.weatherStation.display.CurrentConditionsDisplay;
import com.book.weatherStation.display.HeatIndexDisplay;
import com.book.weatherStation.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // 웨더데이타 객체 생성
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay hd = new HeatIndexDisplay(weatherData);

        // 코드를 내려받지 않아서 주석처리 함.
//        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
//        ForecastDisplay fd = new forecastDisplay(weatherData);

        // 새로운 기상 측정값을 가져온 것으로 가정함.
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.4f);

    }
}
