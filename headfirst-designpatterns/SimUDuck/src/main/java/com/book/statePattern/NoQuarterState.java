package com.book.statePattern;

public class NoQuarterState implements State {
    GumballMachine_new gumballMachine;

    /**
     * 생성자로부터 뽑기 기계의 레퍼런스가 전달된다.
     * 이 레퍼런스를 인스턴스 변수에 저장한다.
     * @param gumballMachine
     */
    public NoQuarterState(GumballMachine_new gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 동전을 넣으면 -> 동전이 투입되었다는 메시지 출력
     * -> 기게의 상태를 HasQuarterState로 전환한다.
     */
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }

}
