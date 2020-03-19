package day08;

public class MultiArrayEx03 {
	/*
	 	문제 3]
			2번에서
			점수에 총점과 평균을 추가해서 관리하려고 한다.
			2번 문제의 배열의 길이를 증가시켜서 처리하세요.
	 */
	
	public static void main(String[] args) {
		
		//5x5 2차원행렬 만들기(점수관리)
		String[][] stuArray = new String[5][5];
		
		//데이터입력>> 한명당 5과목의 점수를 랜덤으로 내야한다.
		for(int i = 0; i < stuArray.length; i++) { //5명의 학생. 
			
			for(int j = 0; j < stuArray[i].length; j++) { //0번방에 있는 학생부터 5과목에 대한 점수를 랜덤으로.
				
				stuArray[i][j] = (int)(Math.random() * 100) + "";
				
			}//inner
		}//outer
		
		//깊은 복사를 하기위한 배열생성
		String[][] stuArrayCopy = new String[5][7];
		
		//깊은복사
		for(int i = 0; i < stuArray.length; i++) { //5명의 학생
			
			for(int j = 0; j < stuArray[i].length; j++) { //동일하게 5과목을 복사해준다.
				System.arraycopy(stuArray[i], 0, stuArrayCopy[i], 0, stuArray[i].length);
			}//inner
		}//outer
		
		//총점과 평균값 입력을 위한 변수 선언
		int total;
		double avg;
		
		for(int i = 0; i < stuArrayCopy.length; i++) { //5명의 학생
			
			total = 0;
			avg = 0.;
			
			for(int j = 0; j < stuArray.length; j++) { //5번을 돌면서 총점 구하기
				total += Integer.parseInt(stuArrayCopy[i][j]);
				
			}//inner1
			
			//총점값 입력 
			stuArrayCopy[i][5] = total + "";
			//평균값 계산 
			avg = Integer.parseInt(stuArrayCopy[i][5]) / 5.;
			stuArrayCopy[i][6] = avg + "";
		}
		
		
		//출력하기
		System.out.println("***************학생별 과목점수관리***************");
		System.out.println("학생번호 | 국어 | 영어 | 수학 | 물리 | 역사 | 총점 | 평균 ");
		
		
		for(int i = 0; i < stuArrayCopy.length; i++) {
			//학생수 1부터 뽑아야한다.
			//학생수 출력해주는 변수 필요 
			int nums = i + 1;
			System.out.printf("%5d     ", nums);
			
			for(int j = 0; j < stuArrayCopy[i].length; j++) {
				//점수 출력
				System.out.printf(" %-3s\t", stuArrayCopy[i][j]);
			}//inner
			
			System.out.println();
			
		}
		
	}//main
} 