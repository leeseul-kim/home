package day11.lotto;

public class Lotto {
 /*
	 	금액을 입력하면, 그 금액만큼의 로또번호를 만들어주는 프로그램을 작성하세요.
		한 줄에는 1000원이고, 한 장에는 5 줄이 들어간다.
		입력 금액은 1000원 단위로 한다.
		
		예]
			입력금액 : 8000원
			
			로또 : 1,2,3,4,5,6	- 1줄
					....
					1,2,3,4,5,6 - 5줄
					------------------
					1,2,3,4,5,6	- 6줄
					.....
					1,2,3,4,5,6	- 8줄
 */
	public Lotto() {
		//로또를 위한 변수선언
		int[] lotto = new int[6];
		
		//숫자 6개를 랜덤발생. 단, 중복된 값은 없어야한다.
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = i; j < i; j++) {
				
			}
		}
		
	}//Default Constructor
	
	public static void main(String[] args) {
		
	}//main
}
