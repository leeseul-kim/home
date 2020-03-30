package day06.work;
/*
 	반지름 5개 숫자를 랜덤하게 발생시켜 기억할 배열을 만들고, 
	각각의 반지름을 가진 원의 넓이를 계산하여 저장할 배열을 만들고,
	각 원의 둘레를 계산해서 저장할 배열도 만들어,
	결과를 출력하는 프로그램을 작성하세요.
	
	단, 출력형태는 
		예]
			반지름 : 5, 원의 넓이 : xxxx, 원의 둘레 : xxxx
	의 형태로 출력되게 하세요.
 */
public class Ex04 {
	public Ex04() {
		//배열선언
		int[] rads = new int[5];
		double[] areas = new double[5];
		double[] arrounds = new double[5];
		
		//데이터 대입
		for(int i = 0; i < rads.length; i++) {
			//반지름 길이 랜덤추출
			rads[i] = (int)(Math.random() * 50 + 1);
			
			//계산한 값 
			areas[i] = Math.PI * rads[i] * rads[i];
			arrounds[i] = 2 * Math.PI * rads[i];
			
			System.out.printf("%d 번\n반지름 : %d, 원의 넓이 : %.2f, 원의 둘레 : %.2f\n", i+1, rads[i], areas[i], arrounds[i]);
			System.out.println("-----------------------------------------------------");
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex04();
	}//main
}
