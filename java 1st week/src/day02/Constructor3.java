package day02;
/**
 * 절삭연산자 관련 예제 포함.
 * 이 클래스는 생성자, 비교연산자, 논리연산자를 위한 클래스입니다.
 * @author leeseulkim
 *
 */

public class Constructor3 {
	
	/*
	 	생성자(Constructor)
	 		: 클래스가 객체가 될 때, 클래스의 멤버가 가져야될 기본값이 있을것이다.
	 		이때, 그 멤버들의 기본값을 셋팅해주는 역할을 하는 것이 생성자(생성자함수)이다.
	 		
	 		형식]
	 			public 클래스명() {
	 			
	 					내용...
	 					
	 			}
	 			
	 		***
	 		생성자함수는 반환값이 없다.
	 		
	 		***
	 		생성자를 하나도 정의하지 않으면, jvm이 자동으로 기본생성자를 만들어 호출해준다.
	 	
	 		만일, 생성자함수를 하나라도 만들면 jvm은 기본생성자함수를 만들지 않는다.
	 		
	 		따라서, 생성자를 정의하려면 기본생성자함수 내용이 없더라도 정의해주는 것이 좋다.
	 */

	/*
	 	비교연산자
	 		: 변수나 상수의 크기를 비교하여 논리값을 얻는 연산자이다.
	 		
	 		참고]
	 			수학에서 비교연산자를 사용하는것처럼 한번에 두개를 비교할 수는 없다.
	 			
	 			예]
	 				int no = 10;
	 				1 <= no <= 20; //에러
	 				
	 				대신, (1 <= no) && (no <= 20);
	
	 	
	 	논리연산자
	 		: '논리값'을 가지고 연산하여 논리값을 얻어내는 연산
	 
	 		종류]
	 			&			- 두 조건이 모두 참일 경우, 참이다.
	 			|			- 두 조건 중 하나라도 참일 경우, 참이다.
	 			!			- 부정연산자
	 			
	 			*******
	 			절삭연산을 하는 논리연산자
	 			&&			- 두 조건이 모두 참일 경우, 참이다.
	 			||			- 두 조건 중 하나라도 참일 경우, 참이다.
	
	 */
	
	public Constructor3() { //생성자 
	
		test1(); //test1함수를 부르는 명령
		test2();
	}
	
	public static void main(String[] args) {
		
		new Constructor3();
		
	}//main
	
	public void test1() {
		//##비교연산자
		char ch1 = 'A';
		char ch2 = 97;
		System.out.println("97 : " + ch2);
		int no = ch1;
		
//		ch2 = no + 3; //no는 위에서 int로 정해져있기 때문에, 결과는 int로 나와야한다.
		ch2 = (char)(no + 3);
		
		System.out.println(ch1 < 'a');
	
	}
	
	public void test2() {
		//##논리연산자
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("1. " + (b1 & b2));
		System.out.println("2. " + (b1 | b2));
		System.out.println("3. " + !(b1 & b2));
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println("4. " + ((no1 > no2) && (++no1 == no2)));
		//절삭연산 중 && 첫번째 연산자가 거짓이라면 두번째 연산자가 참일지라도 실행하지 않는다.
		System.out.println("4-1. " + no1);
		
		System.out.println("5. " + ((no1 < no2) || (++no1 == no2)));
		//절삭연산 중 || 첫번째 연산자가 참이라면 두번째 연산자가 거짓일지라도 실행하지 않는다.
		System.out.println("5-1. " + no1);
	
		//##비트연산자
		System.out.println("6. " + (35 & 23));
		
	}
	
}
