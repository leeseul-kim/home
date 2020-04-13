package programming_Intermediate.selfStudyBook1;

import java.util.*;

public class Array_Gravity_02 {

	public Array_Gravity_02() {
		//테스트 케이스의 갯수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("진행할 테스트 케이스의 갯수를 입력하세요(1~100) : ");
		int tc = sc.nextInt();
		
		//입력받은 케이스 갯수만큼 진행
		for(int c = 1; c <= tc; c++) {
			System.out.print("\n가로의 길이를 입력하세요(2~100) : ");
			int rWidth = sc.nextInt();
			System.out.print("\n세로의 길이를 입력하세요(2~100) : ");
			int rHeight = sc.nextInt();
			
			
		}
	}//Constructor
	
	public static void main(String[] args) {
		new Array_Gravity_02();
	}//main

}
