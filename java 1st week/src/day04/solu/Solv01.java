package day04.solu;

import java.util.Scanner;

/**
 * 이 클래스는 day03 Ex03에 대한 문제풀이입니다.
 * @author leeseulkim
 *
 */

public class Solv01 {
	
	public static void main(String[] args) {
		//1. 입력받을 준비
		Scanner sc = new Scanner(System.in);
	
		//2. 메세지 출력 & 입력값 변수에 기억(코드, 사용량)
		System.out.print("구분 코드를 입력하세요 : ");
		int code = sc.nextInt();
		//2-1. 코드값으로 1~4이외의 숫자가 입력되면 프로그램이 종료
		if(!(code >= 1 && code <= 4)) {
			System.out.println("존재하지 않는 구분코드를 입력하였습니다.\n프로그램을 종료합니다.");
			sc.close();
			return;
		}
		//줄바꿈
		System.out.println();
		//2-2. 사용량
		System.out.print("사용량을 입력하세요 : ");
		int used = sc.nextInt();
		
		//3. 코드에 따른 전기요금 계산
		int calc = 0;
		//기본값으로 가정용으로 셋팅 
		String part = "가정용";
		int basicFee = 3800;
		int usedFee = 245;
		
		System.out.println("\n\n-----------------------\n\n");
		
		if(code == 2) { //이미 기본값으로 가정용이 셋팅되어있기 때문에, code == 1 일때는 없어도 됨.
			part = "산업용";
			basicFee = 2400;
			usedFee = 157;
		}else if(code == 3) {
			part = "교육용";
			basicFee = 2900;
			usedFee = 169;
		}else if(code == 4) {
			part = "공업용";
			basicFee = 3200;
			usedFee = 174;
		}
		
		//4. 요금출력
		calc = basicFee + (used * usedFee);
		System.out.println("사용자코드 : " + code + "\n용도 : " + part + "\n사용량 : "
								+ used + "[kW]\n전기요금 : " + calc + " 원");
	}//main

}
