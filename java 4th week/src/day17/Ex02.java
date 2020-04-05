package day17;

import java.util.*;

public class Ex02 {
	public Ex02() {
		ArrayList<Ex02_Samgak> list = new ArrayList<Ex02_Samgak>();
		
		//리스트에 삼각형 채워주기  
		for(int i = 0; i < 10; i++) {
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
			list.add(new Ex02_Samgak(no1, no2));
		}
		
		//리스트의 내용 중 면적을 한개씩 꺼내기 
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
			//삼각형 클래스를 꺼내게 된 것이므로, 면적값을 구하려면,
			//getArea 함수를 호출해야한다. list의 i번째 방에 있는 삼각형의 면적을 구하세요.
		}
		System.out.println();
		
		//정렬해보기 
		//현재 리스트에 입력되어있는 객체는 서로 크기를 비교할 수 없는 상태이므로,
		//비교자를 만들어서 입력해주고 비교해줘야한다.
		//Comparator 구현한 클래스 불러오기 
		Collections.sort(list, new Ex02_Sort());
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		
		//이번에는 높이를 기준으로 내림차순정렬해보기
		//무명 내부클래스를 사용하기
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return - (((Ex02_Samgak)o1).getHeight() - ((Ex02_Samgak)o2).getHeight());
			}
		});
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getHeight() + " | ");
		}
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex02();
	}//main

}
