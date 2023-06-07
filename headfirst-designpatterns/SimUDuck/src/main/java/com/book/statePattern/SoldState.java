package com.book.statePattern;

public class SoldState implements State {

    GumballMachine_new gumballMachine;
    public SoldState(GumballMachine_new gumballMachineNew) {
        this.gumballMachine = gumballMachineNew;
    }


    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("웁스!!! out of gumballs!!!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
