package day11.work;

import java.util.Scanner;

public class Ex01 {
	/*
	  문제3]
	  	문제 1, 2번에서 만든 클래스를 객체로 만들어서
	  	각 생성자함수가 올바르게 작동하는지 실행하세요.
	 */
	
	//문제1번 원 
//	public Ex01() {
//		//원 10개를 저장할 클래스배열 선언
//		Ex01_Circle[] circle = new Ex01_Circle[10];
//		
//		//circle에 클래스 저장 
//		for(int i = 0; i < circle.length; i++) {
//			//9번은 랜덤추출해주고, 마지막은 아무것도 입력되지 않은 것으로.
//			if(i < 9) {
//				circle[i] = new Ex01_Circle((int)(Math.random() * 50 + 1));
//				//오버로딩 된 생성자함수 호출 
//			}else {
//				circle[i] = new Ex01_Circle();
//				//기본생성자함수 호출 
//			}
//			circle[i].toPrint();
//		}//for
//	}//Default Constructor
	
	//문제2번 점수
	public Ex01() {
		//학생 10명을 저장할 클래스배열 생성 
		Ex01_Score[] stud  = new Ex01_Score[10];
		
		for(int i = 0; i < 2; i++) {
			//이름 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.println("학생의 이름을 입력해주세요.");
			String name = sc.next();
			int java = (int)(Math.random() * 100);
			int oracle = (int)(Math.random() * 100);
			int html = (int)(Math.random() * 100);
			int javascript = (int)(Math.random() * 100);
			int jsp = (int)(Math.random() * 100);
			int spring = (int)(Math.random() * 100);
			stud[i] = new Ex01_Score(name, java, oracle, html, javascript, jsp, spring);
			
			//출력하기
			stud[i].toPrint();
		}//for
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}//main
}
