package day10;

import java.util.Scanner;

/*
3.
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고,
	총점과 평균을 계산해서 입력할 클래스를 제작하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작하여 처리하세요.		
	그리고 5명의 학생을 배열로 만들어 과목 점수, 이름을 입력하여 출력하세요.
*/
public class StudMain {
	//학생의 점수를 담을 클래스배열생성
	Stud[] studScore;
	
	//입력할 학생의 수를 담을 변수
	int num;
	
	public void score() {
		
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 학생의 수를 입력하세요.");
		num = sc.nextInt();
		
		studScore = new Stud[num]; //배열 길이 선언을 꼭 해주어야함. 
		
		for(int i = 0; i < num; i++) {
			//클래스배열 초기화
			studScore[i] = new Stud();
			
//			Scanner sc1 = new Scanner(System.in);
			System.out.print("학생의 이름을 입력하세요.");
			String name = sc.next();
			
			studScore[i].getName(name);
			studScore[i].setScore();
			studScore[i].calTotal();
			studScore[i].calAvg();
		}//for
		
	}
	public static void main(String[] args) {
		StudMain s = new StudMain();
		
		s.score(); //메인클래스에 있는 함수호출 
		
		int n = s.num;
		
		//출력하기
		for(int i = 0; i < n; i++) {
			//입력한 학생의 수만큼 출력되어야함.
			s.studScore[i].toPrint();
		}
	}//mains

}
