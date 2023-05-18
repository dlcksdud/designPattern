package com.book.singletonPattern;

public class ChocolateBoiler_udpate {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler_udpate uniqueInstance;

    private ChocolateBoiler_udpate() {
        // 이 코드는 보일러가 비어 있을 때만 돌아간다.
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler_udpate getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler_udpate();
        }
        return uniqueInstance;
    }

    /**
     * 보일러가 비어있을 때만 재료를 넣는다.
     * 원료를 가득 채우고 나면 empty와 boiled 플래그를 false로 설정한다.
     */
    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }

    /**
     * 보일러가 가득 차 있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓인다.
     * 재료를 다 끓이면 boiled 플래그를 true로 설정
     */
    public void drain() {
        if(!isEmpty() && isBoiled()) {
            // 재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
