package day11.work;

public class Ex02_Tri extends Ex02_Dohyung {
	//삼각형에 필요한 변수선언
	int base, height;
	//둘레는 빼고 넓이만 진행. 넓이변수는 상위클래스에 존재한다.
	
	public Ex02_Tri() {
		
	}//Default Constructor
	
	public Ex02_Tri(int base, int height) {
		this.base = base;
		this.height = height;
		//넓이함수 호출
		setArea();
	}
	
	//넓이를 구해주는 함수
	public void setArea() {
		area = base * height * 0.5;
	}
	
	//출력해주는 함수를 상위클래스로부터 overriding
	public void toPrint() {
		System.out.printf("밑변의 길이가 %d 이고, 높이가 %d 인 삼각형의 넓이는 %.2f 입니다.\n", base
				, height, area);
	}

}
