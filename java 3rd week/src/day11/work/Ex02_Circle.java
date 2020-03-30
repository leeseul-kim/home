package day11.work;

public class Ex02_Circle extends Ex02_Dohyung {
	//원이 가져야하는 정보 선언
	int radius;
	double arround;
		//상위클래스 dohyung에 이미 area는 선언되어 있으므로 선언하지 않아도 됨.
	
	public Ex02_Circle() {
		
	}//Default Constructor
	
	public Ex02_Circle(int radius) {
		this.radius = radius;
		
		//넓이 둘레 함수호출해주기
		setArea();
		setArround();
	}
	
	//넓이 만들어주는 함수
	public void setArea() {
		area = Math.PI * radius * radius;
	}
	
	//둘레 만들어주는 함수
	public void setArround() {
		arround = 2 * Math.PI * radius;
	}
	
	public void toPrint() {
		System.out.printf("반지름의 길이가 %d 인 원의 넓이는 %.2f 이고, 둘레는 %.2f 입니다.\n", radius
										, area, arround);
	}//상위클래스의 멤버함수를 overriding

}
