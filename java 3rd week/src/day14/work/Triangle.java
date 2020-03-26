package day14.work;
/*
삼각형 클래스를 작성하고
그 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고
만약 
	밑변이 같으면 같은 삼각형이 되도록
equals 함수, toString 함수를 Overring 하고 테스트 하세요.

입력은 JOptionPane으로 소속의 함수로 처리하고 출력도 같은 소속의 함수로 처리하세요.
추가로 예외처리도 해주세요.
 */

public class Triangle {
	//전역변수선언 
	int width, height;
	double area;
	
	//생성자함수
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		String msg = toString();
	}

	//면적구하는 함수 setter
	public void setArea() {
		area = width * height * 0.5;
	}
	//다른 클래스에서 private변수에 접근할 수 있도록 해주는 getter함수
	public double getArea() {
		return this.area;
	}
	
	//밑변이 같으면 같은 삼각형으로 판단되도록 equals함수를 overriding
	public boolean equals(Object obj) {
		//반환값을 담을 변수 선언 및 초기
		boolean b1 = false;
		
		//Object 타입으로 자동형변환 된 obj를 Triangle 로 강제형변환
		Triangle t1 = (Triangle)obj;
		
		//밑변이 같으면 동일삼각형 
		if(this.width == t1.width) {
			b1 = true;
		}//기본값이 false로 되어있으므로 굳이 else 안해줘도 됨 
		
		return b1;
	}
	
	//출력을 도와주는 toString함수를 overriding
	public String toString() {
		return " 번 삼각형은 밑변이 " + width + ", 높이가 " + height +
				", 넓이가 " + area + " 인 삼각형입니다.";
	}
}
