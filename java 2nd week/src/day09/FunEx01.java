package day09;
/*
 	1.
	반지름을 랜덤하게 발생해서 그 반지름을 입력하면 
	원의 넓이를 구해주는 함수와 원의 둘레를 구해주는 함수를 제작하고 실행하여 출력하세요.
	단, 랜덤발생, 넓이, 둘레, 출력은 모두 함수로 처리하세요.
 */
public class FunEx01 {
	public FunEx01() {
		int r = getRadius(); //반지름 구하여 변수 r에 대입
		double a = getArea(r);
		double cir = getRound(r);
		
		showCir(r, a, cir);
		
	}//constructor
	
	//반지름의 값을 랜덤생성하는 함수
	public int getRadius() {
		int r = (int)(Math.random() * (100)) + 1;
		return r;
	}
	
	//원의 넓이를 구해주는 함수
	public double getArea(int r) {
		double a = Math.PI * r * r;
		return a;
	}
	
	//원의 둘레를 구해주는 함수
	public double getRound(int r) {
		double cir = 2 * Math.PI * r;
		return cir;
	}
	
	//출력해주는 함수
	public void showCir(int r, double a, double cir) {
		System.out.printf("<<반지름의 길이가 %d인 원>>", r);
		System.out.printf("\n원의 넓이는 %.2f 이고, ", a);
		System.out.printf("원의 둘레는 %.2f 입니다.", cir);
	}
	public static void main(String[] args) {
		new FunEx01();
	}//main

}