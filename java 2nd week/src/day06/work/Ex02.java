package day06.work;
/*
 	'A' ~ 'J' 까지 문자를 랜덤하게 100개 발생시킨 후 
	각 문자의 카운트를 구해서 숫자로 출력하세요.
	
	추가로, 숫자만큼 * 표시를 해주세요.
 */
public class Ex02 {
	public Ex02() {
		//정수 배열 선언
			//우리는 최종적으로 몇 개의 알파벳이 중복되는지 체크할 것이므로.
		int[] alps = new int[10];
			//A~J까지 총 10개의 방만 있으면 됨.
		
		//문자열변수 선언
		String str = "";
		// 데이터 대입
		for(int i = 1; i <= 100; i++) {
			//랜덤하게 문자발생기키기
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			str += ch;
		}
		
		System.out.print(str);
		
		//발생시킨 문자들을 하나씩 비교해서 배열에 넣어주기.
			//이때 배열의 방은 각각 중복된 알파벳의 갯수를 넣어야함.
		loop : 
		for(int i = 0; i < alps.length; i++) {
			//10번을 돌면서 중복된 값을 체크하여 배열에 넣어줄 것임.
			int cnt = 0; //0번방이 끝나면 다시 0부터 시작하여 카운트 세야하므로 0으로 초기화.
			
			for(int j = 0; j < str.length(); j++) {
				//100개의 문자열을 다 돌아서 판단해야함.
				
				//첫번째문자열을 체크하면 무조건 1증가.
				cnt++;
				alps[i] = cnt;
				for(int k = 0; k < j; k++) {
					
				}
			}
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex02();
	}//main

}
