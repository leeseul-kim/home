package programming_Intermediate.selfStudyBook1.Array;

import java.util.*;

public class Array_mode {
/*
 	어느 고등학교에서 실시한 1000명의 수학 성적을 토대로 통계 자료를 만드려고 한다.
 	이때  이 학교에서는 최빈값을 이용하여 학생들의 평균 수준을 짐작하려고 한다.
 	최빈값을 출력하는 프로그램을 작성하라.
 	단  최빈값이 여러 개 일 경우  가장 큰 점수를 출력하라.
 */
	public static void main(String[] args) {
		//테스트케이스의 수 0~10
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i = 0; i < tc; i++) {
			int t = sc.nextInt();
			//1000명의 학생들의 수학점수를 저장할 배열선언
			int[] mathScore = new int[1000];
			//배열에 데이터 채우기
			for(int j = 0; j < 1000; j++) {
				mathScore[j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(mathScore));
			
			//배열에 채워진 데이터 중 최빈값을 찾는다. 
			//0~100까지의 최빈값을 찾기 위해 점수 카운팅 배열을 선언
			int[] score = new int[101];
			for(int j = 0; j < score.length; j++) {
				int cnt = 0;
				for(int k = 0; k < mathScore.length; k++) {
					if(mathScore[k] == j) {
						cnt++;
					}
				}//학생의 점수를 파악 
				score[j] = cnt;
			}//점수배열에 데이터입력 끝
			
			//점수 카운팅 배열에서 가장 큰 값을 골라준다.
			//단  이때 위치가 바뀌면 최빈값을 찾기 어려우므로 tmp 배열을 선언
			//tmp배열은 점수 카운팅 배열의 인덱스값을 알려줄 배열이다.
			int[] tmp = score.clone();
			for(int j = 0; j < score.length; j++) {
				for(int k = 0; k < j; k++) {
					if(score[k] > score[j]) {
						int tmpNo = score[j];
						score[j] = score[k];
						score[k] = tmpNo;
					}
				}
			}
//			//점수배열과 얕은 복사를 한 배열 확인 
//			System.out.println(Arrays.toString(score));
//			System.out.println(Arrays.toString(tmp));
			//동일한 횟수의 최빈값이 다수개 나올 경우를 위한 List 선언 
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < score.length; j++) {
				if(score[score.length-1] == tmp[j]) {
					list.add(j);
				}
			}
			//ArrayList 출력 >> 최빈값 출력
			//만일  다수개의 최빈값이라면 맨 나중에 입력된 값이 그 중 최댓값임.
			for(int s : list) {
				System.out.println(s);
			}
			
			//맨 나중에 입력된 list 값 확인
//			System.out.println(list.get(list.size() - 1));
			
			System.out.println("***" + (i+1) + " 번의 최빈값***");
			System.out.println("#" + (i+1) + " " + list.get(list.size() - 1));
			System.out.println("------------------");
	
		}
	}//main
}
