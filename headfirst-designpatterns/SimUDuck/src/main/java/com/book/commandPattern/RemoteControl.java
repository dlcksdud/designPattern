package com.book.commandPattern;

public class RemoteControl {
    // 이 리모컨 코드는 7개의 온오프 명령을 처리할 수 있다.
    // 각 명령은 배열에 저장된다.
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        // 생성자는 각 온오프 배열의 인스턴스를 만들고 초기화하기만 하면 됩니다.
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        // 각 커맨드 객체는 나중에 사용하기 편하게 onCommand와 offCommand 배열에 저장합니다.
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 사용자가 온오프 버튼을 누르면
     * 리모컨 하드웨어에서 각 버튼에 대응하는
     * onButtonWasPushed()나 offButtonWasPushed() 메소드를 호출한다.
     * @param slot
     */
    public void onButtonWasPushed(int slot) {
        // 특정 슬롯을 쓰려고 할 때마다 거기에 뭔가가 로딩되어 있는지 확인하려면 귀찮다
        // 로딩현황을 파악하기 위해
        if(onCommands[slot] != null) {
            onCommands[slot].execute();
        }
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------- 리모컨 -------\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }



}