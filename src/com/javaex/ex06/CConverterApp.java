package com.javaex.ex06;

import java.util.Scanner;

public class CConverterApp {

    public static void main(String[] args) {
    	
    	CConverter converter = new CConverter();
    	double won;
    	double dollar;
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.println("백만원은 "+ converter.toDoller(1000000) + "달러입니다.");
        
        
        //100달려를 원으로 출력하기
        System.out.println("백달러는 " + converter.toKWR(100) + "입니다.");
        
    }

}
