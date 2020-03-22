package day03.solu;

import java.util.Scanner;

/**
 * 이 클래스는 day02 Ex01에 대한 풀이입니다.
 * @author leeseulkim
 *
 */
public class Sol01 {
	
	public Sol01() {
		//입력받을 준비 
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.print("숫자를 입력받아서 처리할 경우 1을, 랜덤하게 만들어서 처리할 경우 2를 입력하세요.");
		int i = sc.nextInt();
		
		if(i == 1) {
			//입력받은 숫자가 1이면, sol1 함수를 호출하세요.
			sol1(sc);
		}else {
			sol2(sc);
		}
	}//constructor

	public void sol1(Scanner sc) { //값을 입력받아 처리하는 함수 
		//메세지출력
		System.out.print("3자리의 정수를 입력하세요.");
		//숫자를 꺼내 변수에 기억
		int num1 = sc.nextInt();
		
		//십의 자리 이하는 버리기
		//123 -> 100 (123 - 23)
		//혹은, (123/100 * 100)
		System.out.println("입력한 수 : " + num1);
		num1 = num1 / 100 * 100;
		//num1 = num1 - (num1%100);
		System.out.println("\n****십의자리 버림한 수 : " + num1);
	}
	
	public void sol2(Scanner sc) { //값을 랜덤하게 입력받아 처
		//3자리 정수를 랜덤하게 만들기
		int num = (int)(Math.random() * (999 - 100 + 1)) + 100;
		System.out.println("발생한 수 : " + num);
		
		//십의자리에서 버림
		num = num - (num % 100);
		System.out.println("\n****십의자리 버림한 수 : " + num);
	}
	
	public static void main(String[] args) {
		new Sol01();
	}//main
}
