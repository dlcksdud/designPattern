package com.book.doOrNot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        // 프레임을 만들고 그 안에 버튼을 추가하는 간단한 스윙 애플리케이션
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

       JButton button = new JButton("할까? 말까?");
       // 버튼을 누르면 반응하면 천사와 악마 리스너(옵저버) 만들기
//       button.addActionListener(new AngelListener());
//       button.addActionListener(new DevilListener());

        // 람다 표현식으로 만들기
        button.addActionListener(event -> System.out.println("하지마! 아마 후회할걸?"));
        button.addActionListener(event -> System.out.println("그냥 저질러버려!"));
       
       // 프레임 속성 설정


    }

    // 옵저버의 클래스 정의 -> 람다식으로 구현하면 필요없음
//    class AngelListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("하지마! 아마 후회할 걸?");
//        }
//    }
//
//    class DevilListener implements ActionListener {
//        // 주제(이 코드에서는 버튼)의 상태가 바뀌었을 때 update() 메소드가 아니라 actionPerformed 메소드가 호출됨.
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("그냥 저질러 버렷!!!!");
//        }
//    }

}