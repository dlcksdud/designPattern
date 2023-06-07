package com.book.statePattern;

public class GumballMachine_new {


    public State getSoldState;
    /**
     * 정적 정수 변수를 사용하던 기존의 코드를 새로만든 클래스를 사용하는 방식으로 수정
     * 기존 클래스에는 정수를 사용했지만 이번에는 클래스를 사용한다는 점 외에는 동일하다.
     */
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;


    State state = soldOutState;
    int count = 0; // 알맹이 개수 - 처음은 비어있으니까 0


    public GumballMachine_new(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }


    /**
     * 메소드 구현!
     * 현재 상태가 작업을 처리하게 만든다.
     */
    public void insertQuarter() {
       state.insertQuarter();
    }
    


    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 손잡이를 돌리는 경우
     * dispense() 메소드를 구현하지 않아도 된다.
     * 내부에서만 필요한 행동이기 때문에.
     * 사용자가 직접 기계에 알맹이를 내놓으라고 요청할 수는 없다.
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0) {
            count = count - 1;
        }
    }

    public State getNoQuarterState() {
        return null;
    }

    public State getHasQuarterState() {
        return null;
    }

    public int getCount() {
        return 0;
    }

    public State getSoldOutState() {
        return null;
    }

    // toString() refill()과 같은 기타 메소드
}
