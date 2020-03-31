package day17;

import java.util.*;

public class Ex01 {
	
	public Ex01() {
		//Ex01_Sagak으로 제네릭스 해주지 않으면 입력될 때 Object 타입으로 입력된다.
		ArrayList<Ex01_Sagak> list = new ArrayList<Ex01_Sagak>();
		
		for(int i = 0; i < 10; i++) {
			int no1 = (int)(Math.random() * 16 + 5);
			int no2 = (int)(Math.random() * 16 + 5);
			
			list.add(new Ex01_Sagak(no1, no2));
		}//for
		
		//출력
		for(Ex01_Sagak s : list) {
			//list를 하나씩 꺼내 Ex01_Sagak 클래스에 넣으세요.
			System.out.print(s.getArea() + " | ");
		}
		
		System.out.println();
		
		//이제 이 ArrayList를 정렬하기
		//정렬하는 방법은 Collections 클래스에 소속된
		//sort() 함수를 호출하면 오름차순정렬된다.
		Collections.sort(list);
			//sort() 함수는 compareTo 함수를 자동호출한다.
		for(Ex01_Sagak s : list) {
			//list를 하나씩 꺼내 Ex01_Sagak 클래스에 넣으세요.
			System.out.print(s.getArea() + " | ");
		}
		
		System.out.println();
		
		for(Ex01_Sagak s : list) {
			//list를 하나씩 꺼내 Ex01_Sagak 클래스에 넣으세요.
			System.out.print(s.getWidth() + " | ");
		}
		
		System.out.println();

		//이제 가로를 기준으로 정렬하려고 한다.
		Collections.sort(list, new Ex01_Sort());
			//이렇게 하면 자동으로 Ex01_Sort의 comparator를 불러오게 된다.
		
		for(Ex01_Sagak s : list) {
			//list를 하나씩 꺼내 Ex01_Sagak 클래스에 넣으세요.
			System.out.print(s.getWidth() + " | ");
		}
		
		System.out.println();
	
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex01();
	}//main
}
