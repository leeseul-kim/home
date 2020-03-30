package day11;
/**
 * 이 클래스는 멤버변수의 초기화에 대한 클래스입니다.
 * @author leeseulkim
 *
 */
public class Test03 {
	int no1 = 10; 		//1. 명시적 초기화
	int no2;
	static int no3;
	int no4;
	
	{
		no2 = 20;		//2. 초기화 블럭을 이용한 초기화 
	}
	
	static {
		no3 = 30;		//3. static 블럭을 이용한 초기화
//		no2 = 40;		//no2가 static 멤버가 아니기 때문에 불가.
	}
	
	public Test03() {
		this.no4 = 50;	//4. 생성자함수를 이용한 초기
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
	}//Default Constructor
	
	public static void main(String[] args) {
		new Test03();
	}//main

}
