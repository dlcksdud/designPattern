package com.book.compositePattern;

public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴","저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴","디저트를 즐겨 보세요.");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        // 복합 객체의 add() 메소드를 써서 최상위 메뉴인 allMenus에 각 메뉴를 추가합니다.
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 메뉴 항목을 추가하는 부분
        dinerMenu.add(new MenuItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", true, 3.89));
        // 여기선 한 개만 다룸.

        // 메뉴에 메뉴를 추가하는 코드.
        // 메뉴항목이든 메뉴든 MenuComponent 클래스에 속하기만 하면 마음대로 추가 할 수 있다.
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이", true, 1.59));

        // 메뉴 항목을 추가하는 부분


        // 메뉴 계층구조를 모두 만들고 나서 전부 다 종업원에 넘기면 된다.
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
