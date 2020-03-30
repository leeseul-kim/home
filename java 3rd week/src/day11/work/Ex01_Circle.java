package day11.work;

public class Ex01_Circle {
	/*
	 	문제1]
	 		이 클래스는 원의 정보를 저장할 클래스입니다.
	 		이 클래스가 객체가 될 때 반지름을 입력받아서 
	 		원의 대한 정보가 입력이되게 클래스를 정의하세요.
	 		
	 		반지름이 입력이 안될경우에는 10으로 입력되게 하세요.
	 */
	
	//원의 정보를 위한 기본 변수 셋팅
	int radius;	//반지름
	double arround, area;	//둘레, 넓이 

	public Ex01_Circle() {
		//반지름이 입력이 안되었을 때 10으로 셋팅
		this(10);
	}//Default Constructor
	
	public Ex01_Circle(int radius) {	//객체가 될 때 반지름을 입력받기
		this.radius = radius;	//변수 초기화
		calArround();
		calArea();	
	}//생성자함수 오버로딩 
	
	//원의 둘레를 구해주는 함수
	public void calArround() {
		arround = 2 * Math.PI * radius;
	}
	
	//원의 넓이를 구해주는 함수
	public void calArea() {
		area = Math.PI * radius * radius;
	}
	
	//출력해주는 함수
	public void toPrint() {
		System.out.printf("*****반지름의 길이가 %3d 인 원의 정보*****\n", radius);
		System.out.printf("원의 둘레 : %5.2f | 원의 넓이 : %5.2f\n", arround, area);
	}
}
