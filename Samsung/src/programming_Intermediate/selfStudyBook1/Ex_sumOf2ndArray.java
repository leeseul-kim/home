package programming_Intermediate.selfStudyBook1;

public class Ex_sumOf2ndArray {
	//절대값의 합 구하기
	/*
	 	5x5의 2차 배열에 무작위로 25개의 숫자로 초기화 한 후
	 	25개의 각 요소에 대해서 이웃한 요소와의 차의 절대값을 구한 뒤,
	 	구한 모든 값의 총합을 구한다.
	 */

	public Ex_sumOf2ndArray() {
		//5x5 2차원배열 선언 >> x,y 직교좌표로 생각 
		int[][] nArr = {{9,20,2,18,11},
						{19,1,25,3,21},
						{8,24,10,17,7},
						{15,4,16,5,6},
						{12,13,22,23,14}};
		
		//상하좌우의 인덱스를 위한 x,y 변화값 변수
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		//상하좌우의 새로운 인덱스 번호
		int newX, newY;
		//모든 절대값을 더할 tot 변수
		int tot = 0;
		
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				for(int i = 0; i < 4; i++) {
					newX = x + dx[i];
					newY = y + dy[i];
					boolean bool = checkXY(newX, newY);
					if(bool == true) {
//						System.out.println(nArr[newX][newY]);
						tot += getSum(nArr[x][y], nArr[newX][newY]);
					}
				}
			}
			System.out.println(tot);
		}
		
	}//Default Constructor
	
	//인덱스 값을 0~4사이로 정해줄 함수 
	public boolean checkXY(int x, int y) {
		boolean rst = false;
		if((x >= 0 && x <= 4) && (y >= 0 && y <= 4)) rst = true;
		return rst;
	}
	
	//절대값의 합을 구해주는 함수
	public int getSum(int n1, int n2) {
		return (n1>n2)?(n1-n2):-(n1-n2);
	}
	
	public static void main(String[] args) {
		new Ex_sumOf2ndArray();
	}//main

}
