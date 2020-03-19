package day02;
/**
 * 이 클래스는 삼항조건연산자 연습용 클래스.
 * 또한, 랜덤 수 개념까지.
 * @author leeseulkim
 *
 */
public class Ternary_Random {

	/*
	 	랜덤한 수 발생시키는 방법
	 		: Math 클래스 random() 함수는 0보다 크거나 같고 1보다 작은 실수를 반환해준다.
	 	
	 		이때 범위에 해당하는 랜덤한 정수를 발생시키는 방법은
	 			(int)(Math.random() * (최대값 - 최소값 +1)) + 최소값;
	 			>>여기서, +1은 0을 카운팅해준 값이다.
	 */
	
	public Ternary_Random() {
		
		test1();
		
	}
	
	public void test1() {
		//1~10까지 랜덤한 숫자를 발생시켜서 그 숫자가 짝수인지 홀수인지 판단하세요.
		
		//1. 랜덤한 정수를 만든다.
		int num = (int)(Math.random() * (10 - 1 + 1)) + 1; //0~9.999까지 뽑은 실수를 정수로 먼저 변경한 후 1 더하기.
			
		//2. 삼항연산자로 조건을 정의한다.
		//2-1. 참일 경우의 반환값을 정의한다.
		//2-2. 거짓일 경우의 반환값을 정의한다.
		String msg = (num % 2 == 0) ? ("[ " + num + " ]" + " 은(는) 짝수입니다.") : ("[ " + num + " ]" + " 은(는) 홀수입니다.");
		
		//3. 출력해준다.
		System.out.println(msg);
		
		//return msg; //반환값타입이 String일때.
		
	}
	
	public static void main(String[] args) {
		
		new Ternary_Random(); //method 호출 
		
	}//main
	
}
