package com.book.templateMethodPattern;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {

    private String[] myList;

    MyStringList(String[] strings) {
        myList = strings;
    }
    
    // subList() 템플릿 메소드에서 사용하는 get()과 size() 메소드 구현
    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    // 리스트 수정을 위해 set() 메소드도 구현
    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}
