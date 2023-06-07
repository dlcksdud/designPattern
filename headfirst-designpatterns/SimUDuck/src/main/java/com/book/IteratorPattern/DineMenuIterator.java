package com.book.IteratorPattern;
import java.util.Iterator;

public class DineMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0; // 반복 작업이 처리되고 있는 위치 저장

    // 생성자는 반복 작업을 수행할 메뉴 항목 배열을 인자로 받아들인다.
    public DineMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        /**
         * 배열에 있는 모든 원소를 돌았는지 확인한 다음 아직 더 돌아야할 원소가 있으면 true 리턴.
         * 객체마을 식당 주방장이 최대 개수가 정해진 배열을 만들었으니까
         * 배열 끝에 있는지를 확인하는 것 외에도 다음 항목이 null인지도 확인해야 한다.
         *
         */
        if(position >= items.length || items[position] == null) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        // next() 메소드는 배열의 다음 원소를 리턴하고 position 변수값을 1 증가시킨다.
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        /**
         *  Iterator 인터페이스에서 remove() 메소드는 필수가 아니다.
         *  그러니 그냥 예외 던지는 식으로 처리한다.
         */
        throw new UnsupportedOperationException("메뉴 항목은 지울 수 없습니다.");
    }


}
