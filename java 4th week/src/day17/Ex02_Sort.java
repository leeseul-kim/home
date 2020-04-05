package day17;

import java.util.*;

public class Ex02_Sort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//1. 삼각형 타입으로 강제 형변환하기
		Ex02_Samgak s1 = (Ex02_Samgak)o1;
		Ex02_Samgak s2 = (Ex02_Samgak)o2;
		
		//2. 넓이 비교해서 결과값 얻어내기
		int rst = (int)(s1.getArea() - s2.getArea());
		
		//3. 결과값 반환하기 
		return rst;
	}

}
