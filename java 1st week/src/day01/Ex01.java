package day01;

public class Ex01 {
	/*
	 	1) 5, 10, 20 을 제외한 숫자 하나를 가정하고(양, 음수 모두)
	 	이것을 2진수로 바꿔보고 실제 프로그램에 결과와 일치하는지 확인하세요.
	 	
	 	비트코드 확인방법
	 		Integer.toBinaryString(숫자)
	 		
	 	2) 반지름이 7인 원의 넓이, 둘레를 계산하여 출력하세요.
	 	단, 반지름 둘레 넓이는 변수를 만들어 처리하세요.
	 	그리고 둘레는 float타입으로 만드세요.
	 	
	 	3) 두 개의 정수를 변수에 담고,
	 	두 수를 가로와 세로로 하는 사각형의 넓이를 구하세요.
	 	
	 	4) 3번문제의 두 수를 밑변과 높이로 하는 삼각형의 넓이를 구하세요.
	 	
	 	5) 54232원을 지불해야하는데, 우리나라의 화폐 각 단위가
	 	몇장, 몇개가 필요한지 계산하여 출력하세요.
	 */
	public static void main(String[] args) {
		
		//문제1
		System.out.println("문제 1)");
		int num1 = -23;
		String str = Integer.toBinaryString(num1);
		
		System.out.printf("%d 의 비트코드는 %s 입니다.", num1, str);
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------");
		
		//문제2
		System.out.println("문제 2)");
		int r = 7;
		double a = 3.14 * r * r;
		float s = (float)(2 * 3.14 * r); //강제형변환
		
		System.out.println("반지름이 7인 원의 넓이는 " + a + ", 둘레는 " + s + " 입니다.");
		System.out.print("\n");
		System.out.println("--------------------------------------------");
		
		//문제3 & 4
		System.out.println("문제3)");
		int x = 5;
		int y = 9;
		int square = x * y;
		
		System.out.printf("x의 값 %d 와 y의 값 %d를 가로, 세로로 하는 사각형의 넓이는 %d 입니다.\n", x, y, square);
		
		System.out.println("문제4)");
		double squArea = (x * y * 0.5);
		
		System.out.printf("x의 값 %d 와 y의 값 %d 를 밑변, 높이로 하는 삼각형의 넓이는 %.2f 입니다.", x, y, squArea);
		
		System.out.print("\n");
		System.out.println("--------------------------------------------");
		
		//문제5
		System.out.println("문제5)");
		int money = 54232;
//		int fiftho = 0;		//5만원권 
//		int tentho = 0;		//만원권
//		int fivtho = 0;		//5천원권 
//		int thos = 0;		//천원권
//		int fivhun = 0;		//오백원 
//		int hund = 0;		//백원 
//		int fifty = 0;		//오십원 
//		int ten = 0;		//십원 
//		int five = 0;		//오원
//		int won = 0; 		//일원 
		
		System.out.println("54,232원을 지불하기 위한 최소지폐");
		
		int fiftho = money / 50000;
		System.out.println("오만원권 : " + fiftho + " 장");
		money %= 50000; //5만원을 나눈 나머지값에 대한 지폐를 찾으면 됨.
		
		int tentho = money / 10000;
		System.out.println("만원권 : " + tentho + " 장");
		money %= 10000;
		
		int fivtho = money / 5000;
		System.out.println("오천원권 : " + fivtho + " 장");
		money %= 5000;
		
		int thos = money / 1000;
		System.out.println("천원권 : " + thos + " 장");
		money %= 1000;
		
		int fivhun = money / 500;
		System.out.println("오백원 : " + fivhun + " 개");
		money %= 500;
		
		int hund = money / 100;
		System.out.println("백원 : " + hund + " 개");
		money %= 100;
		
		int fifty = money / 50;
		System.out.println("오십원 : " + fifty + " 개");
		money %= 50;
		
		int ten = money / 10;
		System.out.println("십원 : " + ten + " 개");
		money %= 10;
		
		int five = money / 5;
		System.out.println("오원 : " + five + " 개");
		money %= 5;
		
		System.out.println("일원 : " + money + " 개");
		
	}//main

}
