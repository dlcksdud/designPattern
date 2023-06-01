package com.book.IteratorPattern;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        // 메뉴마다 하나씩 필요함
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("메뉴\n---\n아침 메뉴");
        printMenu(pancakeIterator);
        System.out.println("\n점심 메뉴");
        printMenu(dinerIterator);
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
