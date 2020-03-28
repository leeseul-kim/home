package day04.work;

public class Ex01 {
	//두개의 주사위를 던져서 합이 6이 되는 경우를 출력하세요.
	public Ex01() {
		//두개의 주사위에 대한 반복문 		
			//1번주사위가 1부터 6까지 나오게 되는 경우 
			//그리고, 2번주사위 역시 1부터 6까지 나오게 되면서 총 36가지의
			//경우의 수가 나오는데 이 중 합이 6이 나오는 경우만 출력해야한다.
		//카운트변수 >> 몇 개의 경우의 수가 나오는지
		int cnt = 0;
		for(int i = 1; i <= 6; i++) {
			//1번주사위
			for(int j = 1; j <= 6; j++) {
				//2번주사위
				//합이 6이 되는 경우만 출력
				if(i + j == 6) {
					cnt++;
					System.out.printf("1번주사위 눈금 : %d\n2번주사위 눈금 : %d\n합은 6입니다.\n",i, j);
					System.out.println("----------------------");
				}//if
			}//inner
		}//outer
		
		System.out.printf("####두 개의 주사위 눈금의 합이 6이 되는 경우의 수는 %d 입니다.####", cnt);
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex01();
	}//main
}
