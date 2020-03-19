package day09;

import java.util.Arrays;
import java.util.Scanner;

/*
 2.
	1차원배열에 10개의 데이터를 입력한 후, 
	총점과 평균을 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수로 처리하세요.
 */
public class FunEx02 {
	
	//전역배열선언
	int[] nArr;
	
	public FunEx02() {
		dataInPut();
		int total = calTotal(nArr); //반환값이 있는 함수로 변수사용하는 것이 좋다.
		float avg = calAvg(nArr);
		showScore(total, avg);
	}//constructor
	
	//데이터 초기화에 대한 함수
	public void dataInPut() {
		nArr = new int[10];
		for(int i = 0; i < nArr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("%d) 숫자를 입력하세요 : ", i+1);
			int num = sc.nextInt();
			
			nArr[i] = num;
		}//for
		//System.out.println(Arrays.toString(nArr));
	}
	
	//총점계산해주는 함수
	public int calTotal(int[] arr) {
		//총점 저장해주는 변수
		int totScore = 0;
		for(int i = 0; i < arr.length; i++) {
			totScore += arr[i];
		}//for
		return totScore;
	}
	
	//평균계산해주는 함수
	public float calAvg(int[] arr) {
		//평균 저장해줄 변수
		float avgScore = 0.f;
		int total = 0;
//		int total = calTotal(arr);
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avgScore = total / 10.f;
		return avgScore;
	}
	
	//출력해주는 함수
	public void showScore(int total, float avg) {
		//배열데이터 출력 
		System.out.println("------------------------------------------");
		System.out.println("입력하신 숫자는 다음과 같습니다.");
		System.out.println(Arrays.toString(nArr));
		System.out.println("------------------------------------------");
		System.out.printf("총점 : %2d%n", total);
		System.out.printf("평균 : %.2f\n", avg);
	}
	public static void main(String[] args) {
		new FunEx02();
	}//main

}
