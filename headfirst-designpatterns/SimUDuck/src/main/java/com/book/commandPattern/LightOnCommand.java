package com.book.commandPattern;

public class LightOnCommand implements Command {
    Light light;

    /**
     * 생성자에 이 커맨드 객체로 제어할 특정 조명('거실조명' 이런 식으로 어떤 조명인지 알려줘야 함)의 정보가 전될 된다.
     * 그 객체는 light라는 인스턴스 변수에 저장된다.
     * execute() 메소드가 호출되면 light 객체가 바로 그 요청의 리시버가 된다.
     * @param light
     */
    public LightOnCommand(Light light) {
        // execute() 는 리시버 객체에 있는 on 메소드를 호출한다.
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
