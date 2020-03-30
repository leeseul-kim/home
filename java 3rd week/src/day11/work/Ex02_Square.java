package day11.work;

public class Ex02_Square extends Ex02_Dohyung {
	//사각형에 필요한 변수선언
	int width, height, area, arround;
	
	public Ex02_Square() {
		
	}//Default Constructor
	
	public Ex02_Square(int width, int height) {
		this.width = width;
		this.height = height;
		
		setArea();
		setArround();
	}
	
	//넓이를 구해주는 함수
		//상위클래스에서 선언된 area 변수는 double 타입이므로, 형변환 시켜주는 것이 좋겠다.
	public void setArea() {
		area = width * height;
	}
	
	//둘레를 구해주는 함수
	public void setArround() {
		arround = 2 * (width + height);
	}
	
	//출력해주는 함수 overriding
	public void toPrint() {
		System.out.printf("가로의 길이가 %d 이고, 세로의 길이가 %d 인 사각형의 넓이는 %d 이고, 둘레는 %d 입니다.\n", width
				, height, area, arround);
	}
}
