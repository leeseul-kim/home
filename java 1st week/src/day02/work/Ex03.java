package day02.work;

public class Ex03 {
	/*
	 화씨온도 100도는 섭씨온도로 몇도인지 알아보는 프로그램을 작성하세요.
			
			공식]
				섭씨온도 = 5 * (화씨온도 - 32) / 9
	 */
	public Ex03() {
		temp();
	}//constructor

	//화씨온도 -> 섭씨온도
	public void temp() {
		//화씨온도 담을 변수
		int fahTemp = 100;
		
		//섭씨온도 담을 변수
		float celTemp = 5 * (fahTemp - 32) / 9.f;
		
		//출력
		System.out.printf("화씨온도 %d 는 섭씨온도로 %.2f 입니다.", fahTemp, celTemp);		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}//main
}
