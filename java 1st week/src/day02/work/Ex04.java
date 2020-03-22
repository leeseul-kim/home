package day02.work;

public class Ex04 {
	/*
 	소수점이 있는 숫자를 입력한 후, 소수점 이하 셋째자리에서 반올림한 결과를 출력하세요.
 */
	
	public Ex04() {
		roundUP();
	}//constructor
	
	//함수 생성 
	public void roundUP() {
		//소수점 랜덤발
		float rNum = (float)(Math.random() * 100);
		System.out.printf("소수점 3자리 이하의 랜덤 숫자 : %.3f", rNum);
		
		//먼저 +0.005를 해주어 반올림시켜주기
		rNum += 0.005;
		
		//이후, x100을 통해 정수로 바꿔주기
		int num = (int)(rNum * 100);
		//이렇게하면 반올림시켜주었던 셋째자리부분은 없어질 것
		//이후 다시 /100 시켜 실수로 바꿔주기
		rNum = num / 100.f;
		
		//출력하기
		System.out.println("\n================================");
		System.out.printf("랜덤한 숫자를 소수점 셋째짜리에서 반올림 한 값 : %.3f", rNum);
		
	}
	
	public static void main(String[] args) {
		new Ex04();
	}//main
	

}
