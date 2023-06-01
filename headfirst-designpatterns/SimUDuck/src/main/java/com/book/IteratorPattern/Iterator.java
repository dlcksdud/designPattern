package com.book.IteratorPattern;

public interface Iterator {
    /**
     * 메소드 설명
     * 1. hasNext() 메소드 : 반복작업을 수행할 항목이 있는지 확인한 다음 그 결과를 boolean 값으로 리턴
     * 2. next()메소드 : 다음 항복 리턴
     */
    boolean hasNext();
    MenuItem next();
}
