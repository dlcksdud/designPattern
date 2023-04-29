package com.book.weatherStation.subject;

import com.book.weatherStation.display.HeatIndexDisplay;
import com.book.weatherStation.inteface.Observer;
import com.book.weatherStation.inteface.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    private HeatIndexDisplay hd;

    // Observer 객체들을 저장하는 ArrayList를 추가, 그리고 그 생성자가 그 객체를 생성함.
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    ///////////////////Subject 인터페이스 구현 부분 시작////////////////////
    
    // 옵저버가 등록을 요청하면 목록 맨 뒤에 추가하기만 하면 된다.
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    // 옵저버가 탈퇴를 요청하면 목록에서 빼기만 하면 된다.
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 가장 중요한 부분
     * 모든 옵저버에게 상태 변화를 알려주는 부분.
     * 모두 Observer 인터페이스를 구현하는,
     * 즉, update() 메소드가 있는 객체들이므로 손쉽게 상태변화를 알려 줄 수 있다.
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    
    ///////////////////Subject 인터페이스 구현 끝////////////////////

    // 기상 스테이션으로부터 갱신된 측정값을 받으면 옵저버들에게 알립니다.
    public void measurementsChanged() {
        notifyObservers();
    }

    // 책에서 실제 기상 데이터는 수록하지 못함.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    // 기타 WeatherData 메소드
}
