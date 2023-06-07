package com.book.compositePattern;

public class Waitress {
    /**
     * 종업원 코드는 간단하다.
     * 다른 모든 메뉴를 포함하고 있는 최상위 메뉴 구성 요소만 넘겨주면 된다.
     * 최상위 메뉴를 allMenu라고 하기로.
     *
     * 메뉴 전체의 계층구조(모든 메뉴 및 메뉴 항목)를 출력하고 싶으면
     * 그냥 최상위 메뉴의 print() 메소드만 호출하면 됨.
     */
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
