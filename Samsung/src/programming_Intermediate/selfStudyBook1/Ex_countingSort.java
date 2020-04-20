package programming_Intermediate.selfStudyBook1;

import java.util.Arrays;

public class Ex_countingSort {

	public static void main(String[] args) {
		//다음과 같은 정수 배열을 카운팅정렬을 통해 오름차순으로 정렬하자.
		int[] nArr = {0, 4, 1, 3, 1, 2, 4, 1};
		
//		//원소의 최대값 저장
//		int maxValue = 4;
		
		//정렬이 완료된 배열 선언
		int[] tmp = new int[nArr.length];
		
		//원소의 갯수를 저장할 카운트 배열선언 >> 원소의 최대값이 4이므로 0~4까지의 인덱스가 필요  
		int[] counts = new int[5];
		int cnt = 0;
		for(int i = 0; i < counts.length; i++) {
			for(int j = 0; j < nArr.length; j++) {
				if(nArr[j] == i) {
					cnt++;
				}
			}//inner
			counts[i] = cnt;
		}
		//counts 배열을 누적해서 더해줌
		System.out.println(Arrays.toString(counts));
		
		//nArr 배열을 tmp 배열에 정렬시키기
		for(int i = 0; i < nArr.length; i++) {
			int temp = counts[nArr[i]] - 1;
			tmp[temp] = nArr[i];
			counts[nArr[i]]--;
		}
		System.out.println(Arrays.toString(tmp));
	}//main
}
