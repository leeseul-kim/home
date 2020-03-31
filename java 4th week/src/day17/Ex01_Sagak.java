package day17;

public class Ex01_Sagak implements Comparable {
	private int width;
	private int height;
	private double area;
	
	public Ex01_Sagak() {} //Default Constructor
	
	public Ex01_Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	//인터페이스 구현시, 그 인터페이스가 가지고 있는 추상함수를 꼭 Overriding 해야한다.
	@Override
	public int compareTo(Object o) { //매개변수로 입력받을 개체와 해당 객체를 비교하는 함수
		//이 함수는 Comparable 인터페이스가 가지고 있는 추상함수이므로 
		//이 인터페이스를 구현하여 클래스를 제작하는 경우에는
		//반드시 이 함수를 Overriding 해주어야한다.
		//이때, 반환값이 음수인 경우는 정렬시 입력된 데이터와 자리를 바꾸지 않고,
		//즉, 매개변수로 입력되는 객체가 더 크다라는 뜻
		//반환값이 0인 경우는 두 객체가 같다는 뜻이다.
		//반환값이 양수인 경우는 정렬시 입력된 데이터와 자리를 바꾼다.
			//a,b로 생각...a < b --> a - b < 0...
		
		//Object 타입으로 입력된 데이터를 Sagak 타입으로 강제형변환 해주어야한다.
		Ex01_Sagak s = (Ex01_Sagak)o;
		
		//계산하기
		double rst = s.getArea() - this.getArea();
		return (int) -rst;
	}
	public void setArea() {
		this.area = width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
