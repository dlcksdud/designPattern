package com.book.statePattern;

public class GumballMachine_old {

    /**
     * 4가지 상태
     */
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;

    /**
     * 현재 상태를 관리하는 인스턴스 변수.
     * 초기값은 SOLD_OUT으로 설정한다.
     */
    final static int SOLD = 3;


    // 기계에 들어있는 알맹이의 개수를 저장하는 두 번째 인스턴스 변수
    int state = SOLD_OUT;
    int count = 0;

    /**
     * 생성자에서는 초기 알맹이 개수를 인자로 받아들인다.
     * 알맹이 개수가 0이 아니면 동전을 누군가가 넣어주길 기다리고 있는 NO_QUARTER 상태로 전환된다.
     * 알맹이 개수가 0이면 그냥 SOLD_OUT 상태에 머무르게 된다.
     * @param count
     */
    public GumballMachine_old(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 행동을 메소드로 구현
     */
    public void insertQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        } else if(state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if(state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해 주세요."); // 매진상태에서는 동전반환
        } else if(state == SOLD) {
            // 손잡이 돌렸을 때 아직 판매 상태에 있다면 조금 더 기다려 달라는 메시지 출력
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }
    


    public void ejectQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if(state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if(state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        } else if(state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    /**
     * 손잡이를 돌리는 경우
     */
    public void turnCrank() {
        if(state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        } else if(state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if(state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if(state == HAS_QUARTER) {
            /**
             * 성공! 사용자가 알맹이를 받을 수 있음.
             * 상태를 SOLD로 바꾸고 dispense() 메소드를 호출한다.
             */
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 알맹이 내보내기
     */
    public void dispense() {
        if(state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
            count = count - 1;
            if(count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        /**
         * 없어야 할 상황
         *  알맹이가 아니라 오류가 나가는 상황이다.
         */
        } else if(state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if(state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if(state == HAS_QUARTER) {
            System.out.println("알맹이를 내보낼 수 없습니다.");
        }
    }

    // toString() refill()과 같은 기타 메소드
}
