package day06.work;

import java.util.Arrays;

/*
 	피보나치 수열 10개를 저장할 배열을 만들고,
	배열에 값을 입력하여 배열에 저장된 데이터를 출력하세요.
	
	피보나치수열 : 1, 2, 3, 5, 8, ...
 */

public class Ex05 {
	public Ex05() {
		//배열선언
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		
		//값을 채워줄 반복문 
		for(int i = 2; i < arr.length; i++) {
			//앞에 있는 두 수를 더해야함.
			for(int j = i-1; j < i; j++) {
				arr[i] = arr[j] + arr[j - 1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex05();
	}//main

}
