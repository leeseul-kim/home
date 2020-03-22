package day04;

public class Loop2 {
	/*
		while 명령문
			: for 명령문처럼 반복실행할 수 있는 명령문
			for 명령문과의 차이점은 반복을 할 횟수를 지정하는 카운터변수, 
			즉, 증감식이 명령 내부에 없는 것이다.
			
			형식]
				while-(1)(조건식-(2)) {
					-(3)
				}
				-(4)
				
				순서 : (1) -> (2) -> (3) -> (2) -> (3) -> ... 조건식이 false인 경우에만 -> (4)
				
				
		
		do ~ while 명령문
			: for, while 명령은 선조건 후처리명령이고, 조건에 따라서 한번도 실행이 안될 수 있지만,
			do ~ while 명령은 후조건 선처리명령이고 조건에 관계없이 무조건 한번 이상 실행을 한다.
			
			형식]
				do-(1){
					-(2)
				}while(조건식-(3));
				-(4)
			
				순서 : (1) -> (2) -> (3) 참 -> (2) -> (3)참 -> (2) -> (3) 거짓 -> (4)
	 */

	public static void main(String[] args) {
		//구구단을 출력하세요
		
		int dan = 2;
		
		while(dan < 10) {
			System.out.println("----------------");
			
			int mul = 1;
			while(mul < 10) {
				System.out.println(dan + " x " + mul + " = " + (dan*mul));
				mul++;
			}//inner
			
			dan++;
		}//outer
		
		System.out.println("----------------");
		
		int no = 10;
		
		do {
			System.out.println("no : " + no);
		}while(no++ < 13);
		
	}//main
}
