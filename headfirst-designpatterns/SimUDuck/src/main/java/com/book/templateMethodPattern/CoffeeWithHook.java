package com.book.templateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeinBeverage {
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        // 첨가물 추가할지 말지 고객에게 물어보고 고객이 입력한 내용에 따라 t/f 리턴
        if(answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO 오류");
        }

        if(answer == null) {
            return "no";
        }
        return answer;
    }

}
