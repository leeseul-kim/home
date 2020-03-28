package day04.work;
/*
2x + 4y = 10의 방정식 결과를 출력하세요.
단, x,y는 모두 0이상 10이하의 수이다.
 */
public class Ex02 {
	public Ex02() {
		System.out.println("2x + 4y = 10의 방정식을 만족하는 x와 y는 다음과 같다.");

		//x,y 변수를 반복문을 적용하여 구하기
			//회차를 표시해줄 카운트 변수
		int cnt = 0;
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				//방정식을 만족하는 x y만 구해야한다. 조건문!
				if((2*x) + (4*y) == 10) {
					cnt++;
					System.out.printf("%d ) x = %d , y = %d", cnt, x, y);
					System.out.println();
				}
			}
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex02();
	}//main
}
