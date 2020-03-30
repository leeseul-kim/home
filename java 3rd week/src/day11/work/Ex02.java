package day11.work;

public class Ex02 {
	public Ex02() {
		//상위클래스 선언
		Ex02_Dohyung[] d = new Ex02_Dohyung[3];
			//원, 삼각형, 사각형 총 3개만 우선 생성해보기.
		
		//0번에는 원에 대한 클래스를 대입 
		d[0] = new Ex02_Circle((int)(Math.random() * 10 + 1));
		d[0].toPrint();
		
		//1번에는 삼각형에 대한 클래스를 대입
		d[1] = new Ex02_Tri((int)(Math.random() * 10 + 1), (int)(Math.random() * 20 + 1));
		d[1].toPrint();
		
		//2번에는 사각형에 대한 클래스를 대입
		d[2] = new Ex02_Square((int)(Math.random() * 10 + 1), (int)(Math.random() * 20 + 1));
		d[2].toPrint();
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex02();
	}//main

}
