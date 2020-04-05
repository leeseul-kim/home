package day17;

import java.util.*;

public class Test02 {
	public Test02() {
		ArrayList<String> list = new ArrayList<String>();
		//list에 데이터 채우기
		list.add("진로");
		list.add("큰손");
		list.add("회장");
		list.add("반장");
		list.add("광호");
		
		//출력해보기
		for(String s : list) {
			System.out.print(s.toString() + " | ");
		}
		System.out.println();
		
		//오름차순
		Collections.sort(list);
		
		//출력해보기
		for(String s : list) {
			System.out.print(s.toString() + " | ");
		}
		System.out.println();

		//내림차순으로 정렬해보기
		Collections.sort(list, new Comparator() {
			//문자열의 기본정렬방식은 오름차순 정렬이고,
			//다른 방식으로 정렬을 하려면 Comparator 인터페이스를 구현한 클래스를 만들어줘야한다.
			
			@Override
			public int compare(Object o1, Object o2) {
				//이 함수 안에서
				//반환값이 음수이면 자리를 교체하고 
				//양수와 0이라면 자리를 교체하지 않는다.
				
				//문자열로 강제형변환하기
				String s1 = (String)o1;
				String s2 = (String)o2;
				
				//내림차순 
				int rst = s2.compareTo(s1);
				
				//오름차순
//				int rst1 = s1.compareTo(s2);
				return rst;
			}
		});
		
		for(String s : list) {
			System.out.print(s.toString() + " | ");
		}
		System.out.println();

	}//Default Constructor
	
	public static void main(String[] args) {
		new Test02();
	}//main
}
