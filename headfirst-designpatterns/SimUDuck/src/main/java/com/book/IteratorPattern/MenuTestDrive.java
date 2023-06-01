package com.book.IteratorPattern;

public class MenuTestDrive {
    public static void main(String args[]) {
        // 메뉴 생성
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // 종업원 생성
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        //  메뉴 출력
        waitress.printMenu();
    }
}
