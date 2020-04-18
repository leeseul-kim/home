package programming_Intermediate.selfStudyBook1;

import java.util.Arrays;

public class Ex_countingSort {

	public static void main(String[] args) {
		//다음과 같은 정수 배열을 카운팅정렬을 통해 오름차순으로 정렬하자.
		int[] nArr = {0, 4, 1, 3, 1, 2, 4, 1};
		
//		//원소의 최대값 저장
//		int maxValue = 4;
		
		//동일한 숫자 카운팅해주는 카운팅배열
		int[] countArr = new int[5];
		//데이터 채우기 
		for(int i = 0; i < countArr.length; i++) {
			int cnt = 0;
			for(int j = 0; j < nArr.length; j++) {
				if(i == nArr[j]) {
					cnt++;
				}
			}
			countArr[i] = cnt;
		}
		//카운팅배열에 담긴 원소들의 합을 누적시킨다. 
		for(int i = 1; i < countArr.length; i++) {
			countArr[i] += countArr[i-1];
		}

		
		
	}//main
}
