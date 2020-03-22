package day04;

public class EnchancedForLoop {
	/*
	 	향상된 for 명령문(forEach 구문)
	 		: 시퀀스 자료형에 들어있는 데이터를 하나씩 꺼내서 변수에 담아주는 반복문
	 		
	 		형식]
	 			for(데이터타입 변수이름 : 시퀀스자료형) {
	 				실행문
	 			}
	 			
	 			참고]
	 				데이터타입은 시퀀스자료형에 들어있는 데이터의 타입을 써준다.
	 				
	 				향상된 for 명령은 시퀀스자료형에서 
	 				인덱스가 0부터 시작해서 마지막까지
	 				자동으로 데이터를 꺼내서 변수에 담아준다.
	 */
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int no : arr) {
			System.out.print(no + " | ");
		}
	}//main

}
