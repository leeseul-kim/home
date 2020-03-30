package day06.work;

import java.util.*;

/*
 	'A' ~ 'J' 까지 문자를 순차적으로 만들어서 배열에 대입하고,
	각 문자를 하나씩 꺼내서 소문자로 변환한 후 출력하세요.
	그리고, 배열에 담긴 내용을 문자열로 확인하세요.

 */
public class Ex01 {
	public Ex01() {
		//문자를 담을 배열 선언
		char[] alp = new char[10];
		char ch = 'A';
		
		//배열에 데이터 입력
		for(int i = 0; i < alp.length; i++) {
			alp[i] = ch;
			ch++;
		}
		
		//소문자로 변환한 데이터를 기억시킬 변수선언
		String smallAlp = "";
		
		//배열을 순차적으로 꺼내어 문자를 소문자로 변환하여 출력
		for(int i = 0; i < alp.length; i++) {
			char tmp = (char)(alp[i] + ('a' - 'A'));
			//문자에서의 연산은 허용되지 않아 꼭 강제형변환 시켜주어야한다.
			
			smallAlp += (tmp + "  ");
		}
		
		//출력하기
		System.out.println("***원본 알파벳입니다.***\n" + Arrays.toString(alp) );
		
		System.out.println("***소문자로 변경한 알파벳입니다.***\n" + smallAlp);
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex01();
	}//main
}
