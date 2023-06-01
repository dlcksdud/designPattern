package com.book.templateMethodPattern;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                // Duck으로 이루어진 배열을 만든다.
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2),
        };

        // 일단 전부 출력
        System.out.println("정렬 전: ");
        display(ducks);

        // 모든 배열에 쓸 수 있는 sort() 정적 메소드를 호출한다.
        // ducks라는 배열을 인자로 전달한다.
        Arrays.sort(ducks);

        System.out.println("\n정렬 후: ");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for(Duck d : ducks) {
            System.out.println(d);
        }
    }


}
