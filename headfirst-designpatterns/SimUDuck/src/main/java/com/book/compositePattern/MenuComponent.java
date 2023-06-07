package com.book.compositePattern;

public abstract class MenuComponent {

    // MenuComponent를 추가하거나 제거하고 가져오는 메소드
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // MenuItem에서 작업을 처리하는 메소드, 이 중 몇게는 Menu에서도 쓸 수 있다.
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // print()는 Menu와 MenuItem에서 모두 구현하는 작업용 메소드
    public void print() {
        throw new UnsupportedOperationException();
    }
}
