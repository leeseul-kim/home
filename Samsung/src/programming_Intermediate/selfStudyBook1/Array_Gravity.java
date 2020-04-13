package programming_Intermediate.selfStudyBook1;

import java.util.*;

public class Array_Gravity {
	
	public Array_Gravity() {
		//test case의 수, 변수 T(1~100)
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		//케이스의 수만큼 반복문 실행
		for(int i = 0; i < tc; i++) {
			//방의 가로 길이 roomWidth, 세로 길이 roomHeight 입력받는다. (2~100)
			int roomWidth = sc.nextInt();
			int roomHeight = sc.nextInt();
			//roomWidth개의 상자들이 쌓여있는 높이 box가 입력된다.	
//			NxM의 2차원배열이다. 
			int[][] box = new int[roomWidth][roomHeight];
			for(int j = 0; j < roomWidth; j++) {
				//쌓일 상자의 갯수를 랜덤으로 추출한다.
				int boxNum = (int)(Math.random() * (roomHeight+1));
				//쌓일 상자만큼 반복문으로 1을 넣어준다.
				for(int k = 0; k < boxNum; k++) {
					box[j][k] = 1;
				}//inner
				System.out.print(boxNum + " | ");
			}//for
			
			//최대 낙차값의 변수선언
			int maxFallen = 0;
			int countEmpty;

			for(int j = 0; j < roomWidth; j++) {
				for(int k = 0; k < roomHeight; k++) {
					//박스가 있을 때(배열이 1의 값을 가질 때) 
					//빈칸의 갯수를 카운트 변수를 통해 낙차를 구한다.
					//이때 카운트 변수는 초기화한다.
					if(box[j][k] == 1) {
						countEmpty = 0;
						//90도 회전시켜서 빈칸의 갯수를 카운트 해준다.
						for(int x = j+1; x < roomWidth; x++) {
							if(box[x][k] == 0) {
								countEmpty++;
							}
						}
						
						//이전에 구한 낙차보다 현재 낙차가 크다면 업데이트.
						if(countEmpty > maxFallen) {
							maxFallen = countEmpty;
						}
					}//if
				}
			}
			System.out.println();
			System.out.println(maxFallen);
		}//cases
	}//Constructor
	
	public static void main(String[] args) {
		new Array_Gravity();
	}//main
}
