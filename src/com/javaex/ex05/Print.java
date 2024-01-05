package com.javaex.ex05;

public class Print {
	
	//필드
	private int printer;
	
	//생성자
	
	//메소드-gs
	public int getPrinter() {
		return printer;
	}

	public void setPrinter(int printer) {
		this.printer = printer;
	}
	
	//메소드-일반
    
    public void printer(int val){
        System.out.println(val);
    }

    

	//메소드  3개 를 작성하세요
    public void printer(boolean val) {
    	System.out.println(val);
    }
    public void printer(double val) {
    	System.out.println(val);
    }
    public void printer(String val) {
    	System.out.println(val);
    }
    
}
