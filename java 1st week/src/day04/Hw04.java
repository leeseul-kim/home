package day04;

public class Hw04 {
	/*
	 	두 사람이 등산을 하는데,
	 	한 사람은 이제 등산을 0.54 m/s 시작하고,
	 	한 사람은 정상에서 1.07 m/s 로 내려오기 시작했다.
	 	
	 	산의 높이가 7564m라고 가정하고,
	 	두 사람이 만나는 시간은 몇분 몇초 후인지,
	 	그리고 어느 높이에서 만나는지를 출력해주는 프로그램을 작성하세요.
	 */

	public static void main(String[] args) {
		
		//속도 = 거리 / 시간
		//거리 = 속도 * 시간 
		//두 사람이 만나려면 각 사람이 이동한 거리의 합이 산의 높이가 됨
		
		//산의 높이를 저장할 변수
		int height = 7564;
//		double vel1 = 0.54;
//		double vel2 = 1.07;
//		double t = 0.0;
		
		for(int i = 0; ; i++) {
			//1초당 올라가는 사람의 거리
			double h1 = 0.54 * i;
			
			//1초당 내려가는 사람의 거리 
			double h2 = height - (1.07 * i);
			
			if(h1 > h2) {
				System.out.println("올라가는 사람의 높이 : " + h1);
				System.out.println("내려가는 사람의 높이 : " + h2);
				System.out.printf("\n두 사람이 만난 직후 시간 : %d 분 %d 초", (i/60), (i%60));
				
				break;
			}
			
		}
//		while(((t * vel1) + (t * vel2) == 7564)) {
//			
//			System.out.printf("%.2f 의 속도로 올라가는 사");
//			
//		}
		
	}//main
}
