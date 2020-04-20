package programming_Intermediate.selfStudyBook1.Array;

import java.util.*;

public class Array_view {
/*
 	왼쪽, 오른쪽 모두 창문을 열었을 때, 양쪽 거리가 
 	2이상의 공간이 확보되었을 때 조망이 확보된다고 한다.
 	빌딩들에 대한 정보가 주어질 때, 
 	조망권이 확보된 세대의 수를 반환하는 프로그램을 작성하시오.
 	단, 가로길이는 항상 1000이하로 주어지고, 맨 왼쪽, 맨 오른쪽 두칸에는 건물이 지어지지 않는다.
 	각 빌딩의 최대높이는 255이다.
 	총 10개의 테스트케이스를 작성하시오.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//총 10개의 테스트케이스
		for(int test_case = 1; test_case <= 10; test_case++) {
			//가로길이 입력받기
			int width = sc.nextInt();
			//건물이 존재하면 1, 없으면 0으로 표시
			//단, 양 옆쪽 2칸은 0이 되어야만 한다.
			//먼저, 2차원 배열 선언
			int[][] buildings = new int[width][255];
			//가로길이만큼 반복하며 건물 세우기
			//건물의 높이를 저장할 배열선언
			int[] height = new int[width];
			for(int i = 0; i < width; i++) {
				//건물의 높이를 입력받기
				height[i] = sc.nextInt();
				for(int j = 0; j < height[i]; j++) {
					buildings[i][j] = 1;
				}
			}
			//건물이 지어지지 않은 부분을 제외한 곳에서만 왼쪽 오른쪽 2칸이상의 공간이 있는지 확인 
			//조망이 좋은 세대 수를 카운팅하기 위한 변수 선언
			int cnt = 0;
			for(int i = 0; i < width; i++) {
				if(height[i] != 0) { //건물이 세워지지 않은 부분은 걸러줌.
					for(int j = 0; j < height[i]; j++) {
						if(buildings[i-1][j] == 0 & buildings[i+1][j] == 0) {
							if(buildings[i-2][j] == 0 & buildings[i+2][j] == 0) {
								cnt++;
							}//inner if
						}//outer if
					}//inner for
				}//건물이 세워지지 않은 부분을 걸러주는 조건식  
			}//outer for 
			
			//출력 
			System.out.println("#" + test_case + " " + cnt);
		}
	}//main
}
