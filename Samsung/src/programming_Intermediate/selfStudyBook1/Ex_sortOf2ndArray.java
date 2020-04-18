package programming_Intermediate.selfStudyBook1;

public class Ex_sortOf2ndArray {

	public Ex_sortOf2ndArray() {
		int[][] nArr = {{9,20,2,18,11},
						{19,1,25,3,21},
						{8,24,10,17,7},
						{15,4,16,5,6},
						{12,13,22,23,14}};
		//달팽이 등껍질처럼 배열을 순회하여 정렬하기
		//선택정렬
		int sorted_arr[][] = new int[5][5];
		int cur_min = -1;
		int x, y;
		int newX = 0;
		int newY = 0;
		
		//등껍질모양으로 배열 순회할 x,y 변화값 변수
		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};
		int dir = 0;
		
		for(int i = 0; i < 25; i++) {
			cur_min = sel_min(nArr);
			x = newX;
			y = newY;
			sorted_arr[x][y] = cur_min;
			
			newX = x + dx[dir];
			newY = y + dy[dir];
			
			if(sorted_arr[newX][newY] != 0 || newX > 4 || newY > 4) {
				dir = (dir + 1) % 4;
				newX = x + dx[dir];
				newY = y + dy[dir];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(sorted_arr[i][j] + " | ");
			}
			System.out.println();
		}
		
	}//Default Constructor
	
	//먼저 최소값의 위치를 찾을 함수선언
	public int sel_min(int[][] arr) {
		int min = 0;
		int minX = 0;
		int minY = 0;
		
		min = arr[0][0];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(min > arr[i][j]) {
					min = arr[i][j];
					minX = i;
					minY = j;
				}
				
			}
		}
		//충분히 큰 값을 대입.
		arr[minX][minY] = 26;
		return min;
	}
	
	public static void main(String[] args) {
		new Ex_sortOf2ndArray();
	}//main
}
