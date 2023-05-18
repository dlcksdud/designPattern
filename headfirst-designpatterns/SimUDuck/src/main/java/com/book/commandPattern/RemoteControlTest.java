package com.book.commandPattern;

public class RemoteControlTest {
    public static  void main(String[] args) {
        // remote 변수가 인보커(Invoker) 역할을 한다.
        // 필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달 받는다.
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 요청을 받아서 처리할 리시버인 Light 객체 생성
        Light light = new Light();
        // 커맨드 객체 생성. 이때 리시버를 전달해줌.
        LightOnCommand lightOn = new LightOnCommand(light);

        // 커맨드 객체를 인보커에게 전달
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
