package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member mem1 = new Member();
		mem1.setId("jws");
		mem1.setName("정우성");
		mem1.setPoint(50000);
		
		Member mem2 = new Member();
		mem2.setId("yjs");
		mem2.setName("유재석");
		mem2.setPoint(30000);
		
		Member mem3 = new Member();
		mem3.setId("lhr");
		mem3.setName("이효리");
		mem3.setPoint(4000);
		
		mem1.showInfo();
		mem2.showInfo();
		mem3.showInfo();
		
//		//배열만들기
//		Member[] memArray= new Member[3];
//		
//		//상품만들기
//		Member mem1 = new Member("정우성", "jws" , 50000);
//		Member mem2 = new Member("유재석", "yjs" , 30000);
//		Member mem3 = new Member("이효리", "lhr" , 40000);
//		
//		//배열에 상품넣기
//		memArray[0] = mem1;
//		memArray[1] = mem2;
//		memArray[2] = mem3;
//		
//		for(int i = 0; i<memArray.length; i++) {
//			memArray[i].showInfo();
//		}
		
		
		
	}

}
