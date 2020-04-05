package day17;

import java.util.*;

public class Ex03_Nemo /*implements Comparable*/ {
	//네모에 필요한 변수선언
	int width, height, area;
	
	//생성자함수
	public Ex03_Nemo() {}
	
	//overloading 생성자함수
	public Ex03_Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		this.area = width * height;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		//입력된 객체를 네모타입으로 강제형변환해야함.
//		Ex03_Nemo n = (Ex03_Nemo)o;
//		//면적을 비교하여 오름차순으로 정렬.
//		int rst = this.area - n.area;
//		return rst;
//	}
	
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

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
