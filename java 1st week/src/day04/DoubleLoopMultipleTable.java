package day04;

public class DoubleLoopMultipleTable {
	//이중for문을 이용한 구구단 프로그램
	public static void main(String[] args) {
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.println((i+2) + " x " + (j+1) + " = " + (i+2)*(j+1));
			}
		}	
		
	}//main

}
