package day09;

import java.util.Arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	3.
	5명의 학생의 국어, 영어, 수학, 물리, 국사 점수를 입력받아
	총점과 석차를 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
		
	단, 배열은 [5][7] 의 형태로 만드세요.	
 */

public class FunEx03 {
	
	//전역배열선언
	int[][] stuScore = new int[5][7];
	//과목배열생성
	String[] subName = {"국어", "영어", "수학", "물리", "국사"};
	
	public FunEx03() {
		scoreInPut();	//배열 초기화 완료
		calTotal(stuScore);
		rank(stuScore);
		}//constructor
	
	//석차에 대한 배열
//	int[] ranking = new int[stuScore.length];
	
	//점수입력받는 함수 
	//석차배열도 함께 초기화 
	public void scoreInPut() {
		//입력받은 점수를 임시변수에 저장
		int subScore;
		for(int i = 0; i < stuScore.length; i++) {
			subScore = 0;
//			ranking[i] = i+1;
			for(int j = 0; j < stuScore[i].length - 2; j++) {
				//랜덤
				//stuScore[i][j] = (int)(Math.random() * (100));
				System.out.printf("%2d 번 학생의 %s 점수를 입력하세요.", i+1, subName[j]);
				Scanner sc = new Scanner(System.in);
				subScore = sc.nextInt();
				stuScore[i][j] = subScore;
				//System.out.printf(" 점");
			}//inner
			System.out.printf("=========%d 번 학생 점수 입력 완료=========", i+1);
			System.out.println();
		}//outer
		System.out.println(Arrays.deepToString(stuScore));
//		System.out.println(Arrays.toString(ranking));
	}
	
	//총점을 계산하는 함수
	public void calTotal(int[][] arr) {
		//총점에 대한 임시변수
		int total;
		for(int i = 0; i < stuScore.length; i++) {
			total = 0;
			for(int j = 0; j < stuScore[i].length - 2; j++) {
				//계산
				total += stuScore[i][j];
			}//inner
			stuScore[i][stuScore[i].length - 2] = total;	//5번째방은 총점을 위한 방 
		}//outer
		System.out.println(Arrays.deepToString(stuScore));
	}
	
	//석차를 계산하는 함수 >> 정렬
	//석차를 통해 내림차순으로 정렬해줄 배열을 복사 -> 깊은복사
	//원배열과 정렬된배열을 검사하여 총점이 같은 사람에게 등수를 부여한다.
	public void rank(int[][] arr) {
		//깊은복사를 위한 배열생성
		int[][] copy = new int[stuScore.length][stuScore[0].length];
		//깊은복사
		for(int i = 0; i < stuScore.length; i++) { //5명의 학생. 5번 돌림
			//복사는 총점만 해주기.
			System.arraycopy(stuScore[i], 5, copy[i], 5, 1);	
		}
		
		//복사한 배열을 내림차순으로 정렬하기
		for(int i = 0; i < copy.length - 1; i++) {
			for(int j = i + 1; j < copy.length; j++) {
				if(copy[i][5] < copy[j][5]) {
					//치환
					int tmp = copy[j][5]; 
					copy[j][5] = copy[i][5];
					copy[i][5] = tmp;
				}//if
			}//inner
		}//outer
		System.out.println(Arrays.deepToString(copy));
		
		//원배열에 석차등록 중복값찾기 
		for(int i = 0; i < stuScore.length; i++) { //5바퀴 돌리면서 총점값확인
			for(int j = 0; j < copy.length; j++) {
				if(stuScore[j][5] == copy[i][5]) {
					stuScore[j][stuScore[j].length - 1] = i + 1; 
				}//if
			}//inner
		}//outer
		System.out.println(Arrays.deepToString(stuScore));
	}
	
	//출력해주는 함수
	public void showRank() {
		StringBuffer buff = new StringBuffer();
		buff.append("----성\t\t적----");
		for(int i = 0; i < stuScore.length; i++) {
			
			buff.append(subName[i] + "  |  ");
			for(int j = 0; j < stuScore[i].length; j++) {
				
			}
		}
		
		JOptionPane.showMessageDialog(null, buff.toString());
	}
	
	public static void main(String[] args) {
		new FunEx03();
	}//main

}
