package day03.work;

import java.util.Scanner;

public class Ex03 {
	/*
	 			코드		기본요금	사용요금
	가정용		(1) 			3800		245	
	산업용		(2)				2400		157	
	교육용		(3)				2900		169
	공업용		(4)				3200		174
	 		
	 		전기요금 = 기본요금 + (사용량 * 사용요금)
	 		
	 		사용자 코드와 사용량을 입력받아 전기요금을 계산해주는 프로그램을 작성하세요.
	 */
	public Ex03() {
		calElect();
	}//constructor
	
	//함수
	public void  calElect() {
		//사용자코드와 사용량을 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 코드를 입력하세요. \n\n가정용\t1번\n산업용\t2번\n교육용\t3번\n공업용\t4번\n");
		int code = sc.nextInt();
		System.out.print("사용량을 입력하세요.");
		float using = sc.nextFloat();
		//전기요금에 대한 변수 선언
		float elec = 0.f;
		String str = "";
		
		//전기요금 코드별로 계산
		switch(code) {
		case 1:
			str = "가정용";
			elec = 3800 + (using * 245);
			break;
		case 2:
			str = "산업용";
			elec = 2400 + (using * 157);
			break;
		case 3:
			str = "교육용";
			elec = 2900 + (using * 169);
			break;
		default:
			str = "공업용";
			elec = 3200 + (using * 174);
			break;
		}
		
		System.out.println("=============================");
		System.out.printf("%s > 이번 전기요금은 %.2f 원 입니다.", str, elec);
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}//main

}
