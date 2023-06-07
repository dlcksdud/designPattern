package com.book.statePattern;

public class HasQuarterState implements State {

    GumballMachine_new gumballMachine;
    public HasQuarterState(GumballMachine_new gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("동전은 한 개만 넣어주세요.");
    }

    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다.");
        gumballMachine.setState(gumballMachine.getSoldState);
    }

    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}
