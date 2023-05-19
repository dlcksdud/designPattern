package com.book.commandPattern;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    /**
     * LightOnCommand와 마찬가지로 이 클래스로 제어할 오디오의 인스턴스를 전달받는다.
     * 그 인스턴스는 stereo라는 지역 인스턴스 변수에 저장됩니다.
     * @param stereo
     */
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    /**
     * 이 요청을 수행하려면 Stereo 클래스에 있는 메소드 3개를 호출해야 한다.
     * 우선 전원을 켜야 하고(on() 메소드), 그 다음에 CD를 재생하도록 하고(setCD()),
     * 마지막으로 볼륨을 11로 맞춰야(setVloume(11))합니다.
     */
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}