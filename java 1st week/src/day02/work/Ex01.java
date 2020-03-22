package day02.work;

import java.util.Scanner;

public class Ex01 {
	
	/*
	 3자리로 구성된 숫자 하나를 입력 받은 후, 또는 랜덤하게 만든 후,
	 백자리 이하를 버린 숫자를 만들어서 출력하세요.
	 	
		 	예]
		 		456 --> 400
	 */
	
	public Ex01() {
		//inPutNum();
		getRandom();
		int rst = getNum(num);
		System.out.println("-----------------------------------");
		System.out.printf("입력하신 숫자 %d 의 백자리 이하를 버린 숫자는 %d 입니다.", num, rst);
	}//constructor
	
	//숫자 기억할 변수
	int num;
	
	//3자리로 구성된 숫자 입력받는 함수
	public void inPutNum() {
		num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리로 구성된 숫자를 입력하세요.");
		num = sc.nextInt();
	}
	
	//숫자를 랜덤하게 발생시키는 함수 100~999
	public void getRandom() {
		num = (int)(Math.random() * 900) + 100;
		System.out.print("랜덤하게 뽑은 숫자 : " + num + "\n");
	}
	
	//백자리이하를 버린 숫자를 만드는 함수
	public int getNum(int num) {
		int rst = num - (num % 100);
		return rst;
	} 
	//위의 함수들을 한번에 담아서 쓸 수 있다.
	
	public static void main(String[] args) {
		new Ex01();
	}//main


}
