package com.book.singletonPattern;

// 고전적인 싱글턴 패턴 구현법
public class Singleton_old {
    // 싱글턴 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    private static Singleton_old uniqueInstance;

    // 기타 인스턴스 변수

    // 생성자를 private으로 선언했으므로 싱글턴에서만 클래스의 인스턴스를 만들 수 있다.
    private Singleton_old() {}

    // getInstance() 메소드는 클래스의 인스턴스를 만들어서 리턴한다.
//    public static Singleton getInstance() {

    /**
     * 멀티 스레딩 문제 해결하기
     * getInstance()에 synchronized 키워드만 추가
     * 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다려야 한다.
     */
    public static synchronized Singleton_old getInstance() {
        // uniqueInstance에 하나뿐인 인스턴스가 저장된다. 정적변수!!! 중요
        // uniqueInstance가 null 이면 아직 인스턴스가 생성되지 않았음
        if(uniqueInstance == null) {
            /**
             * 아직 인스턴스가 만들어지지 않았다면
             * private으로 선언된 생성자를 사용해서 싱글턴 객체를 만든 다음 uniqueInstance에 그 객체를 대입한다.
             * 이러면 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않게 됨.
             * -> 이것을 '게으른 인스턴스 생성(lazyinstantiation)' 이라고 한다.
             */
            uniqueInstance = new Singleton_old();
        }
        // uniqueInstance가 null 이 아니면 이미 객체가 생성된 것 -> 바로 return 선언문으로 간다.
        // 이부분이 실행되고 있다는 것은 어쨌든 인스턴스가 존재하는 상황이므로 그 인스턴스를 리턴하기만 하면 된다.
        return uniqueInstance;
    }

    // 기타 메소드
    // 싱글턴도 보통 클래스이기 때문에 여기에도 다른 인스턴스 변수나 메소드가 있을 수 있다.


}
