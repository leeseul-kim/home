package day02.work;

public class Ex05 {
	/*
	 랜덤한 숫자를 10~99에서 발생시킨 후, 그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
		
		예]
			랜덤숫자 45는 50과의 차가 5이다.
			
			랜덤숫자 53은 50과의 차가 3이다.
	 */
	public Ex05() {
		minus();
	}//constructor
	
	//함수생성
	public void minus() {
		//랜덤숫자발생
		int num = (int)(Math.random() * 90) + 10;
		
		//발생한 숫자와 가까운 10의 배수 숫자 찾기
		int tmp = num + 5;
		tmp /= 10; //1의 자리숫자를 버리는 라인.
		tmp *= 10; //다시 10을 곱하여 자연스레 10의 배수 숫자로 만들어짐.
		
		//삼항연산자
		int rst = (num > tmp) ? (num - tmp) : (tmp - num);
		
		//출력하기
		System.out.printf("랜덤숫자 %d 는 %d 와(과)의 차가 %d 입니다.", num, tmp, rst);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}//main
	

}
