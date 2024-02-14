package com.javaex.ex10;

public class Book {
    
    //필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	
	//생성자
	public Book() {
		
	}
	
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1; // 1이라는 고정값이라서 파라미터에 들어가지 않아도 됨!
	}

//	public Book(int bookNo, String title, String author, int stateCode) {
//		this.bookNo = bookNo;
//		this.title = title;
//		this.author = author;
//		여기에 써주려고하면 값을 집어 넣어야한다.
//	}
	//메소드-gs

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	//메소드-일반
	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "이(가) 대여 됐습니다.");
	}
	public void print() {
		String rentState ="";
		if(stateCode == 1) {
			rentState = "재고있음";
		}else if(stateCode ==0) {
			rentState = "대여중";
		}
		System.out.println(bookNo+title + author + rentState);
	}
	

	
    
    
    
}
