package day01;

public class Variable1 {
	public static void main(String[] args) {
		
		/*
		 	변수 만드는 형식
		 	
		 		1.
		 		[접근지정자] [속성] 데이터타입 변수명; 			//변수선언
		 		변수명 = 데이터; 							//변수초기화(대입)
		 		
		 		2.
		 		[접근지정자] [속성] 데이터타입 변수명 = 데이터; 	//변수선언&초기화 
		 */
		
		//Casting
		double no1 = 3.14;
		
		float no2 = (float)3.14; 		//1. 강제형변환, 여기서 3.14는 double 타입이다.
		
		float no3 = 3.14f;				//2. Literal형변환, 여기 3.14는 float 타입이다.
		
		double no4 = 123.456f;			//3. 자동형변환, double 값이 더 크기 때문.
		
		String str1 = "가나다";	
		String str2 = "가나다";
		String str3 = new String("가나다");	//new명령으로 인해 데이터가 heap에 저장된다.
											//그렇기 대문에 str3과 str1의 데이터는 다르다.
		
		System.out.println( str1 == str2 );
		System.out.println( str1 == str3 );
		
		System.out.println( str3.equals(str1) ); //String을 비교할때는 == 보다 .equals() 사용할 것!
		//==는 데이터의 주소값 비교, .equals()는 데이터의 값 비교이다.
		
	}//main

}
