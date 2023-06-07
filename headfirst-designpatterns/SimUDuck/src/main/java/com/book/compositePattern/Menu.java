package com.book.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    // Menu에는 MenuComponent 형식의 자식을 몇 개든지 저장할 수 있습니다.
    // 이 코드에서는 ArrayList에 저장함
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponent.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    /**
     * 이름과 설명을 리턴하는 게터메소드 : getName, getDescription은
     * Menu에는 어울리지 않는 메소드이므로 구현하지 않는다.
     * Menu에 이 메소드를 호출하면 UnsupportedOperationException을 던진다.
     * @return
     */
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void print() {
//        System.out.println("\n" + getName());
//        System.out.println(", " + getDescription());
//        System.out.println("--------------------------");

        /**
         * print() 메소드에서 Menu정보와 Menu에 들어있는 모든 구성 요소, 즉 다른 메뉴 및 메뉴 항목 정보까지 출력하도록 고치기만 하면 된다.
         * 향상된 for 순환문에는 Iterator가 활용된다.
         * 그 반복자를 사용해서 Menu에 있는 모든 구성요소(다른 메뉴일 수도 있고 MenuItem일 수도(를 대상으로 반복작업을 처리한다.
         */
        for(MenuComponent menuComponent : menuComponents) {
            // Menu와 MenuItem에서 모두 print()를 구현하므로 그냥 print()만 호출하고 나머지는 각 클래스에게 맡겨두면 된다.
            menuComponent.print();
        }
    }
}
