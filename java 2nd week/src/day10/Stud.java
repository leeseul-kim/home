package day10;

//import java.util.Scanner;

/**
 * 이 클래스는 함수를 모아놓은 클래스입니다. 
 * @author leeseulkim
 *
 */
/*
	3.
		학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고,
		총점과 평균을 계산해서 입력할 클래스를 제작하세요.
		단, 입력, 총점계산, 평균계산, 출력은 함수를 제작하여 처리하세요.		
		그리고 5명의 학생을 배열로 만들어 과목 점수, 이름을 입력하여 출력하세요.
*/
public class Stud { //입력된 학생의 수만큼 이 클래스가 반복되어야함! (메인클래스에서)
	
	//학생의 이름을 받을 문자열 선언 
	String stuName;
	//점수를 랜덤하게 받을 과목 선언
	int kor;
	int eng;
	int math;
	int phy;
	int code;
	//총점과 평균을 받을 변수선언
	int total;
	double avg;
	
	//학생의 이름을 입력받는 함수
	public void getName(String name) { 
			//학생 5명을 입력받으면 5번을 돌면서 stuName 배열에 데이터 입력 
				//이부분은 메인클래스에서 진행하면 됨!
			stuName = name;
	}
	
	//학생의 수 만큼 과목 점수를 랜덤하게 입력받는 함수
	public void setScore() {
			kor = (int)(Math.random() * 100);
			eng = (int)(Math.random() * 100);
			math = (int)(Math.random() * 100);
			phy = (int)(Math.random() * 100);
			code = (int)(Math.random() * 100);
	}
	
	//총점계산해주는 함수
	public void calTotal() {
			total = kor + eng + math + phy + code;
	}
	
	//평균계산해주는 함수
	public void calAvg() {
			avg = total / 5.;
	}
	
	//출력해주는 함수
	public void toPrint() {
		System.out.printf("\n이름 : %3s\n", stuName);
		System.out.printf("\t\t | 국어 : %3d 점\n", kor);
		System.out.printf("\t\t | 영어 : %3d 점\n", eng);
		System.out.printf("\t\t | 수학 : %3d 점\n", math);
		System.out.printf("\t\t | 물리 : %3d 점\n", phy);
		System.out.printf("\t\t | 코딩 : %3d 점\n", code);
		System.out.println("");
		System.out.printf("\n\t 총	점 : %2d 점\n", total);
		System.out.printf("\n\t 평	균 : %.2f 점\n", avg);
		System.out.printf("===============================");		
	}
	
}
