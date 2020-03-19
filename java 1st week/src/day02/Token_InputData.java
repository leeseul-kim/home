package day02;

import java.util.*;

public class Token_InputData {
	public static void main(String[] args) {
		
		/*
		 	자바 프로그램의 토큰 구분
		 	
		 		-> 컴파일러는 토큰 단위로 번역을 시도한다.
		 		따라서 개발자는 컴파일러가 번역을 하는 토큰을 구분해 주어야한다.
		 		이때 사용하는 기호가 ;이다.
		 		
		 		우리가 습관적으로 int a = 20; 한 이유는, 토큰을 구분해주기 위한 기호이다.
		 		
		 		결론적으로, 토큰이란 하나의 명령이 종료되었음을 알려주는 기호이다.
		 		
		 		만약, 개발자가 토큰구분을 하지 않으면 오류가 날 수 있다.
		 		
		 		예]
		 			int a = 10
		 			int b = 20;
		 				>> 위의 두 줄을 컴파일러는 하나의 명령으로 간주해서 처리할 것이고,
		 				이런 명령의 형식은 자바에서 존재하지 않으므로 에러가 발생한다.
		 				
		 		예]
		 			int a = 10; int b = 20;
		 				>> 한줄로 입력했지만, 두 개의 명령을 토큰으로 구분해주었기 때문에
		 				각각의 명령으로 인식하여 컴파일 할 수 있다. 다만, 가독성이 좋지 않다.
		 				
		 				
		 		참고]
		 			; 대신 } 기호가 그 역할을 대신할 수 있다.
		 			
		 			예]
		 				if(조건식){
		 				
		 				} //이 부분에서 토큰이 발생하게 된다.
		 */
		
		/*
		 ---------------------------------------------------------------------------------------------
		 
		 	키보드로 데이터를 입력받아서 사용하는 방법
		 		
		 		순서]
		 			1. 클래스 구문 시작 전에
		 				import java.util.*;로 java.util 패키지의 모든 클래스를 사용할 준비를 해준다.
		 				
		 					import java.util.Scanner;
		 						>> 이 방법은 java.util 패키지 내의 Scanner 클래스만 사용할 준비를 한 것.
		 						
		 			2. 프로그램에 들어가서 Scanner의 객체를 만들어준다.
		 				Scanner sc = new Scanner(System.in);
		 										//출력명령과 비교(System.out.print etc.)
	
		 				위의 명령을 통해서 키보드를 통해 입력받을 도구를 준비한다.
		
		 			3. 키보드를 통해서 입력받을 필요가 생겼 때
		 			
		 				변수 = sc.nextxxx();
		 				
		 				위의 명령을 이용하여 데이터를 입력받으면 된다.
		 				
		 				이때, xxx에 들어가는 것은 입력받을 데이터의 종류에 따라 달라지는데,
		 				
		 				문자열			-	sc.nextLine();
		 				정수			-	sc.nextInt();
		 				실수			-	sc.nextFloat();
		 				
		 				참고]
		 					정수형태의 문자열을 정수로 변환시키는 방법
		 						Integer.parseInt(숫자형문자열);
		 */
		
		//예제] 숫자를 입력받아 그 수에서 50을 뺀 값을 출력하기.
		
		//1. 입력받을 준비한다. 
		Scanner sc = new Scanner(System.in);
		
		//2. 메세지를 출력한다.
		System.out.print("정수를 입력하세요 : "); //스캐너 사용시 print함수에 변수 넣지 않는다.
		
		//3. 입력받은 데이터를 문자열변수에 대입한다.
		String str = sc.nextLine();
		
		//입력을 받은 후, 필요없으면 scanner를 닫아준다.
		sc.close();
		
//		//4. 문자열 데이터를 정수로 변환한다.
//		int num = Integer.parseInt(str);
//		
//		//5. 변환된 정수를 계산한다.
//		int rst = num - 50;	
		//4, 5. 한 줄로 표현
		int num = Integer.parseInt(str) - 50;
		
		//6. 계산 결과를 출력한다.
		System.out.println("입력한 수 " + str + " 에서 50을 빼면 " + num + " 이다.");
	}//main

}
