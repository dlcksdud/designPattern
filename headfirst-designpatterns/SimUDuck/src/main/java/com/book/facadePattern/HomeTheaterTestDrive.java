package com.book.facadePattern;

import com.book.commandPattern.Light;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // 구성요소 초기화
        /**
         * 지금은 테스트 중이니까 구성 요소를 직접 생성한다.
         * 보통은 클라이언트에 퍼사드가 주어지므로 직접 구성 요소를 생성하지 않아도 된다.
         * 우선 서브시스템에 들어가는 모든 구성요소를 매개 변수로 전달해서 퍼사드 인스턴스를 만든다.
         */

        Amplifier amp = null;
        Tuner tuner = null;
        StreamingPlayer player = null;
        Projector projector = null;
        Screen screen = null;
        TheaterLights lights = null;
        PopcornPopper popper = null;
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, tuner, player, projector, screen, lights, popper);

        // 단순화한 인터페이스를 써서 영화 재생을 시작한 다음
        // 홈시어터를 끈다.
        homeTheater.watchMovie("작은 아씨들");
        homeTheater.endMovie();

    }
}
