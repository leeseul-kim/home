package day17;

import java.util.*;

public class Ex04 {
	public Ex04() {
		//리스트에 세모 채우기
		ArrayList<Ex04_Semo> list = new ArrayList<Ex04_Semo>();
		
		//리스트에 값 채우기 
		for(int i = 0; i < 10; i++) {
			int no1 = (int)(Math.random() * 16 + 5);
			int no2 = (int)(Math.random() * 16 + 5);
			
			//list.add(new xxx) 반복문 돌때마다 리스트에 xxx클래스를 
			//new 시켜서 대입해주는 것이다. 즉 반복문 도는 횟수만큼 생성되는 것.
			list.add(new Ex04_Semo(no1, no2));
		}//for
		
		//리스트의 내용을 꺼내기 
		System.out.println("#####그냥 출력한 것#####");
		for(Ex04_Semo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		
		//면적을 중심으로 오름차순으로 정렬 
		Collections.sort(list);
		System.out.println("#####comparable 이용한 것(오름차순)#####");
		//세모 클래스는 현재 정렬가능하다. 
		for(Ex04_Semo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		
		//높이를 중심으로 꺼내기
		System.out.println("#####높이기준으로 그냥 출력#####");		
		for(Ex04_Semo s : list) {
			System.out.print(s.getHeight() + " | ");
		}
		System.out.println();
		
		//높이를 중심으로 내림차순 정렬하기 
		System.out.println("#####comparator 이용한 것(내림차순)#####");
		//무명내부클래스 이용 
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Ex04_Semo)o2).getHeight() - ((Ex04_Semo)o1).getHeight();
			}
		});
		for(Ex04_Semo s : list) {
			System.out.print(s.getHeight() + " | ");
		}
		System.out.println();
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex04();
	}//main
}
