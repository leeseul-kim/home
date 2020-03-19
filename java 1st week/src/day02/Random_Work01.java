package day02;

import java.util.*;

public class Random_Work01 {
	
	/*
	 	랜덤하게 11 ~ 33 사이의 두 숫자를 발생시키고,
	 	숫자를 입력받아서 입력받은 숫자가 1이면 삼각형의 넓이를,
	 	2이면 사각형의 넓이를 구해주는 프로그램을 작성하세요.
	 */
	
	public Random_Work01() {
		
		//입력받을 준
		Scanner sc = new Scanner(System.in);
		
		//메세지 출력	
		System.out.print("삼각형의 넓이는 1, 사각형의 넓이는 2를 입력하세요 : ");
		int i = sc.nextInt();
		
		//랜덤하게 두 수를 발생시켜 변수에 담고, 출력까지
		int num1 = (int)(Math.random() * (33 - 11 + 1)) + 11;
		System.out.println("랜덤숫자1 : " + num1);
		int num2 = (int)(Math.random() * (33 - 11 + 1)) + 11;
		System.out.println("랜덤숫자2 : " + num2);
		
		/*
		 	방법1]
		 		삼각형, 사각형의 넓이 타입들이 다르기 때문에 한가지 타입으로 통일해주기.
		 		여기서는 함수 실행의 결과를 그대로 출력할 용도로만 사용할 것이기때문에,
		 		String으로 통일하여 사용하는 것이 좋다.
		 */
//		String result = (i == 1) ? ("삼각형의 넓이 : " + triArea(num1, num2)) : 
//									((i == 2) ? ("사각형의 넓이 : " + squArea(num1, num2)) : ("1과 2 중에서 입력하세요."));
//		
//		System.out.println(result);
		
		//방법2]
		double tri = triArea(num1, num2);
		int squa = squArea(num1, num2);
		
		String result = (i == 1) ? ("삼각형의 넓이는 " + tri) :
									((i == 2) ? ("사각형의 넓이는 " + squa) : ("1과 2중에서만 입력하세요."));
		
		System.out.println(result); //문자열을 출력해주어야만 콘솔창에서 확인이 가능!!!!
		//String 코드는 그저 조건을 걸어 해당하는 결과값만 만들어준 것임.
		
	}
	
	//삼각형 넓이를 구해주는 함수
	public double triArea(int wid, int hei) {
		
		//면적을 계산하여 변수에 담기
		double area = wid * hei / 2.; //double타입이므로, 나누기연산자는 몫만 나오기 때문에, 소숫점까지 나오게 하기 위함.
		
		return area;
		
	}
	
	//사각형 넓이를 구해주는 함수
	public int squArea(int num1, int num2) {
		int sArea = num1 * num2;
		
		return sArea;
	}

	public static void main(String[] args) {
		
		new Random_Work01();
		
	}//main
	
}
