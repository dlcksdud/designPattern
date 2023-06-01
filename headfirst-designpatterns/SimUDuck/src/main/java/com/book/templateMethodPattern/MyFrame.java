package com.book.templateMethodPattern;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    /**
     * update() 메소드가 들어있는 JFrame을 확장한다.
     * update() 메소드는 화면 갱신 알고리즘을 제어한다.
     * paint() 후크 메소드를 오버라이드하면 그 알고리즘에 끼어들 수 있다.
     */

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }


    /**
     * JFrame의 update() 알고리즘은 paint()를 호출한다.
     * 기본적으로 paint()는 아무일도 안한다. 그냥 후크 메소드임
     * 여기서는 paint()를 오버라이드해서 윈도우에 메세지를 그릴 것
     */
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "배고파!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
