package day01;

/** 클래스의 정보를 담는 주석
 * 이 부분에 클래스의 설명을 작성해준다.
 * @author leeseulkim			(클래스 제작자)
 * @since 2020.03.15			(클래스 제작날짜)
 * @version v.1.0				(해당 클래스의 버전을 지정하는 부분)
 * @see							(참고해야할 클래스들을 나열하는 부분)
 * 
 * 							변경이력
 * 							2020.03.15	-	클래스 제작	-	담당자 : 김이
 *
 */

public class Operator2 {
	public static void main(String[] args) {
		
		/*
		 	증감연산자
		 		++, --
		 			: 변수에 붙여지는 연산자로, 붙여진 변수의 값을 1 또는 -1을 해준다.
		 			*****
		 			기호 이후에 처음 나오는 변수에 한하여 한번만!
		 			
		 			##그렇기 때문에 카운트 해주는 문제에 자주 사용된다.
		 */
		
		int no1 = 10;
		
		int no2 = no1++ + ++no1;
		//****기호를 기준으로 생각할 것.
		//첫번째 no1은 기존 no1값(10). 이후 ++해주었기 떄문에 no1의 값은 11이 됨.
		//두번째 no1은 ++가 미리 붙어있기때문에 11에서 증가되어 12가 됨.
		//결국, no2 = 10 + 12 = 22
		
		System.out.println("no2 : " + no2);
		//문자열을 결합해주는 연산자는 println에서 +로 처리해준다.
		
		int num1 = 10;
		
		int num2 = ++num1 + num1++;
		//첫번째 num1은 기존 num1값(10)에서 먼저 증가해주었기 때문에 11임.
		//두번째 num1은 그대로 11이 된다. 마지막 ++의 경우, 만일 num1이 한번 더 나오게 되면 의미가 있어짐.
		
		System.out.println("num2 : " + num2);
		
	}//main

}
