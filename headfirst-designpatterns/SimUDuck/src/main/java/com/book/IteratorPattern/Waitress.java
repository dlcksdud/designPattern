package com.book.IteratorPattern;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.List;

public class Waitress {
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;

    List<Menu> menus;

//    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//    }

//        public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
//            this.pancakeHouseMenu = pancakeHouseMenu;
//            this.dinerMenu = dinerMenu;
//    }

    //  각 메뉴를 따로 받지 않고 목록으로 받아온다.
    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        // 메뉴마다 하나씩 필요함
//        java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//        java.util.Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//
//        System.out.println("메뉴\n---\n아침 메뉴");
//        printMenu((Iterator) pancakeIterator);
//        System.out.println("\n점심 메뉴");
//        printMenu((Iterator) dinerIterator);

        java.util.Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu((Iterator) menu.createIterator());
        }
     }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next(); // 항목이 더 남아있는지 확인하고
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
