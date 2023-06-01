package com.book.IteratorPattern;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    // 생성자
    
    // addItem 메소드 호출


//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        /**
         * menuItems배열을 가지고 DinerMenuIterator를 생성한 다음 클라이언트에게 리턴한다.
         * 클라이언트는 menuItem이 어떻게 관리되는지는 물론
         * DinerMenuIterator가 어떤 식으로 구현되어 있는지 알 필요가 없다.
         * 그냥 반복자로 메뉴에 들어있는 항목 하나하나에 접근할 수만 있으면 된다.
         */
        return new DineMenuIterator(menuItems);
    }
}
