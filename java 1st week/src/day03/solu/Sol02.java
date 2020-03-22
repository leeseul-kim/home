package day03.solu;
/**
 * 이 클래스는 day02 Ex02에 대한 문제풀이입니다.
 * @author leeseulkim
 *
 */

public class Sol02 {
	public Sol02() {
		sol1();
	}//constructor
	
	//숫자를 랜덤하게 만들고 문자로 변경 후 영문자인지 판별하는 함수
	public void sol1() {
		//1. 0~255 랜덤한 수 발생시키기
		int num = (int)(Math.random() * 256);
		//2. 그 숫자를 문자로 변경하기
		char ch = (char)num;	//강제형변환 꼭 필요
		//3. 문자를 판별하기
		String msg = (ch >= 'A' && ch <= 'Z') ? ("영어 대문자입니다.") :
						( (ch >= 'a' && ch <= 'z') ? ("영어 소문자입니다.") : ("영문자가 아닙니다."));
	
		//4. 출력하기
		System.out.println("랜덤하게 발생한 문자 [ " + ch + " ] 은(는) " + msg);
	}
	
	public static void main(String[] args) {
		new Sol02();
	}//main

}
