package day04;

public class Labeling {
	/*
	 	labeling
	 		: 반복문이 중첩이 될 경우,
	 		내부의 반복문에서 조건에 따라 바깥 반복문을 제어해야될 경우가 생긴다.
	 		이때, 해당 반복문을 제어해줄 용도로 쓰이는 것을 라벨링이라고 한다.
	 		
	 		적용 명령은 break 나 continue 에서 쓸 수 있다.
	 		
	 		형식]
	 			라벨명:
	 			for(;;) {
	 				for(;;) {
	 				
	 				}//inner
	 			}//outer
	 			
	 		***
	 		주의]
	 			라벨에 의한 처리는 직속관계에 한해서만 적용된다.
	 			
	 			label:
	 			for() {
	 				라벨:
	 				for() {
	 				
	 				}
	 				
	 				for() {
	 					break 라벨;		//에러!
	 					continue label;	//가능
	 				}
	 			}
	 */
	//###결과를 보면, 3x4 이후 점선이 없는 것으로 보아, 
	//continue l1;을 통해 바로 outer for문의 증감식으로 이동한 것을 알 수 있다.
	public static void main(String[] args) {
		//구구단을 출력하는데 3단의 5 곱 이상은 출력하지 말고 건너 뛰게 하세요.
		
		l1 :
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i == 3 && j >= 5) {
					continue l1;
				}//if
				System.out.println(i + " x " + j + " = " + (i*j));
			}//inner
			System.out.println("----------------");
		}//outer
	}//main

}
