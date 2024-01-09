package com.javaex.ex08;

public class Account {

	//필드
    private String accountNo;
    private int balance;
	
    
    //생성자 작성
    public Account() {
		
	}
    
    public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}

	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    
    //??필요한 메소드 작성
	public void deposit(int val) {
		System.out.println(balance  + val);
	}
	public void withdraw(int val) {
		System.out.println(balance - val);
		
	}
	public void showBalance() {
		System.out.println(balance);
	}
	
    

}
