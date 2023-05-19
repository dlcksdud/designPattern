package com.book.commandPattern;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * LightOffCommand는 리시버를 off() 메소드와 결합시킨다는 점을 제외하면
     * ightOnCommand와 똑같은 방식으로 작동한다.
     */
    public void execute() {
        light.off();
    }

}