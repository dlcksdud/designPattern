package com.book.facadePattern;

public class HomeTheaterFacade {
    /**
     * 구성부분
     * 우리가 사용하고자 하는 서브시스템의
     * 모든 구성요소가 인스턴스 변수 형태로 저장된다.
     */
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    /**
     * 퍼사드의 생성자에는 서브시스템 구성요소의 레퍼런스가 전달됩니다.
     * 퍼사드는 각 레퍼런스를 인스턴스 변수에 저장합니다.
     * @param amp
     * @param tuner
     * @param player
     * @param projector
     * @param screen
     * @param lights
     * @param popper
     */
    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             StreamingPlayer player,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    // 기타 메소드
    // 1. 영화를 볼 때사용하는 메소드
    // 각 작업은 서브시스템에 들어있는 구성 요소에게 위임된다.
    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비 중");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    // 2. 영화가 끝나고 사용하는 메소드
    public void endMovie() {
        System.out.println("홈시어터를 끄는 중");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

}
