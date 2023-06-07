package com.book.IteratorPattern;

import java.util.List;

public class MenuTestDrive {
    public static void main(String args[]) {
        // 메뉴 생성
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        List<Menu> menus = null;
        menus.add((Menu) pancakeHouseMenu);
        menus.add((Menu) dinerMenu);

        // 종업원 생성
        Waitress waitress = new Waitress(menus);

        //  메뉴 출력
        waitress.printMenu();
    }
}
