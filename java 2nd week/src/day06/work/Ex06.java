package day06.work;
/*
 	팩토리얼 10개를 저장할 배열을 만들고
	1부터 순차적으로 10까지의 팩토리얼을 만들어서 배열에 담고 꺼내어 출력하세요.
	
		예]
			1! = 1
			2! = 1x2
			3! = 1x2x3
			4! = 1x2x3x4
			....
 */
public class Ex06 {
	public Ex06() {
		//배열선언
		int[] fArr = new int[10];
		
		int count = 0;
		//반복문으로 계산
		for(int i = 0; i < fArr.length; i++) {
			count++; //한번 돌때 1씩 증가.
			for(int j = 0; j < i; j++) {
				//fArr[i] = 
			}
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex06();
	}//main

}
