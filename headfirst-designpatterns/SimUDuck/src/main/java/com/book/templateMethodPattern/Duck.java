package com.book.templateMethodPattern;

public class Duck implements Comparable<Duck> {

    // Duck에는 이름과 체중이 부여된다.
    String name;
    int weight;


    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " 체중 : " + weight;
    }



    // sort() 메소드에서 필요로 하는 것
    @Override
    public int compareTo(Duck otherDuck) {
        // compareTo() 메소드는 다른 Duck 객체를 인자로 받아서 이 객체와 비교한다.

        /**
         * Duck 객체들을 비교하는 방법
         * 이 오리의 무게가 otherDuck 보다 가벼우면 -1
         * 무거우면 1
         * 무게가 같으면 0을 리턴하도록 한다.
         */
        if(this.weight < otherDuck.weight) {
            return -1;
        } else if(this.weight == otherDuck.weight) {
            return 0;
        } else {
            // this.wegiht > otherDuck.weight
            return 1;
        }
    }
}
