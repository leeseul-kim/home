package day17;

public class Ex04_Semo implements Comparable {
	//Comparable 인터페이스를 구현하는 순간, 비교가능한 클래스가 된다. 

	//변수선언
	private int width, height;
	private double area;
	
	//생성자함수
	public Ex04_Semo() {}
	
	//Overloading 생성자함수
	public Ex04_Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		this.area = width * height * 0.5;
	}

	@Override
	public int compareTo(Object o) {
		Ex04_Semo s = (Ex04_Semo)o;
		
		int rst = (int)(this.getArea() - s.getArea());
		//양수이면 자리바꾸기 >> 오름차순 
		
		return rst;
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
