package day17;

import java.util.*;

public class Ex05 {
	//랜덤하게 숫자를 10개 만들어서 컬렉션에 담고 출력하세요.
	//단, 중복숫자는 제외하세요.
	
	public Ex05() {
		//중복숫자는 제외해야하므로 Set 컬렉션 사용
		HashSet<Integer> sNum = new HashSet<Integer>();
		
		//컬렉션에 데이터 담기
		for(int i = 0; i < 10; i++) {
			sNum.add((int)(Math.random() * 45 + 1));
		}
		
		//Iterator 사용
		Iterator itor = sNum.iterator();
		
		//출력하기
		int i = 0;
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex05();
	}//main

}
