package day08;

public class MultiArrayEx02 {
	/*
	 문제 2]
	
		국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다.(점수는 랜덤하게 추출하세요.)
		학생의 수는 5명이고
		2차원 배열로 만들어서 
		5명의 점수를 저장할 배열을 만드세요.
	 */
	public static void main(String[] args) {
		
		//5x5 2차원행렬 만들기(점수관리)
		int[][] stuArray = new int[5][5];
		
		//데이터입력>> 한명당 5과목의 점수를 랜덤으로 내야한다.
		for(int i = 0; i < stuArray.length; i++) { //5명의 학생. 
			
			for(int j = 0; j < stuArray[i].length; j++) { //0번방에 있는 학생부터 5과목에 대한 점수를 랜덤으로.
				
				stuArray[i][j] = (int)(Math.random() * 100);
				
			}//inner
		}//outer
		
		//출력하기
		System.out.println("***************학생별 과목점수관리***************");
		System.out.println("학생번호 | 국어 | 영어 | 수학 | 물리 | 역사");
		
		
		for(int i = 0; i < stuArray.length; i++) {
			//학생수 1부터 뽑아야한다.
			//학생수 출력해주는 변수 필요 
			int nums = i + 1;
			System.out.printf("%5d     ", nums);
			
			for(int j = 0; j < stuArray[i].length; j++) {
				//점수 출력
				System.out.printf("%-3d\t", stuArray[i][j]);
			}//inner
			
			System.out.println();
			
		}
		
//		//배열출력해보기 
//		System.out.println(Arrays.deepToString(stuArray));
		
	}//main
}
