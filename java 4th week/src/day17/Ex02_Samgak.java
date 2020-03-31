package day17;

public class Ex02_Samgak {
	
	//삼각형 변수선언
	private int width, height;
	private double area;
	
	//기본생성자함수
	public Ex02_Samgak() {}
	
	//생성자함수 오버로딩
	public Ex02_Samgak(int width, int height) {
		this.width = width;
		this.height = height;
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
