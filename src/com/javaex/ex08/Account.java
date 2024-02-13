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
    
    //필요한 메소드 작성
	public void deposit(int money) {
//		System.out.println(this.balance  + money);
		this.balance = this.balance + money;
	}
	public void withdraw(int money) {
//		System.out.println(this.balance - money);
		this.balance = this.balance - money;
		
	}
	public void showBalance() {
		System.out.println(this.balance );
	}
	
    

}
