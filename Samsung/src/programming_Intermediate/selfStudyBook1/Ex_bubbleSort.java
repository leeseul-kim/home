package programming_Intermediate.selfStudyBook1;

import java.util.Arrays;

public class Ex_bubbleSort {

	public static void main(String[] args) {
		//다음 정수배열을 버블정렬을 이용하여 오름차순 정렬 해보기
		int[] num = {55, 7, 78, 12, 42};
		
		//반복문을 통하여 0번방부터 차례로 숫자비교 
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < i; j++) {
				if(num[j] > num[i]) {
					//큰 수는 뒤로 가야하고, 작은 수는 앞에 위치해야한다.
					int tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}//if
			}//inner for 
		}//outer for
		
		//출력해보기
		System.out.println(Arrays.toString(num));
	}//main
}
