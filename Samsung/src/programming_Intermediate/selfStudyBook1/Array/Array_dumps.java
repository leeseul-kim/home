package programming_Intermediate.selfStudyBook1.Array;

import java.util.*;

public class Array_dumps {
/*
 	상자를 평탄화 하는데, 덤프 횟수는 1이상 1000이하로 주어진다.
 	덤프 횟수가 다해 평탄화가 완료되면 더 이상 덤프를 수행할 수 없으므로,
 	그때의 최고점과 최저점의 높이 차이를 반환하는 프로그램을 작성하라.
 	단, 가로의 길이는 항상 100으로 주어지며,
 	상자의 높이는 1이상 100이하로 주어진다. 
 	
 	=> 최고점을 찾아서 최저점으로 이동시켜주는데, 실행할때마다 카운트를 사용하여
 	덤프횟수를 넘치지 않는지 확인해주어야한다. 
 		최고점과 최저점의 가로 인덱스를 저장해 줄 변수도 필요하다. (?)
 */
	public static void main(String[] args) {
		//덤프횟수를 입력할 준비
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스는 총 10회이다.
		for(int test_case = 1; test_case <= 10; test_case++) {
			//덤프횟수 입력받기
			int dumps = sc.nextInt();
			//카운트변수 선언
			int cnt = 0;
			//상자에 대한 1차원 배열 선언
			int[] box = new int[100];
			//1차원 배열에 상자데이터 입력
			for(int i = 0; i < 100; i++) {
				//상자의 높이 입력받기 1~100 사이
				box[i] = sc.nextInt();
//				box[i] = (int)(Math.random()*100) + 1;
			}
			//최고점과 최저점의 변수선언
//			int max = 0;
//			int min = 0;
			//덤프횟수만큼 반복문
			System.out.println(Arrays.toString(box));
			while(dumps > cnt) {
				//배열의 최대값과 최소값을 찾아준다.
					//버블정렬을 통해서 오름차순으로 정렬해주면 쉽게 찾을 수 있다. 
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j < i; j++) {
						int tmp;
						if(box[j] > box[i]) {
							//오름차순이므로 자리 바꿔주기
							tmp = box[j];
							box[j] = box[i];
							box[i] = tmp;
						}
					}
				}//버블정렬로 오름차순 정렬 
				//배열의 가장 오른쪽에 있는 값 1빼어 가장 왼쪽으로 보내준다.
				box[99]--;
				box[0]++;
				cnt++;
			}
			int rst = box[98] - box[1];
//			System.out.println(Arrays.toString(box));
			System.out.println("#" + test_case + " " + rst);
		}
	}//main
}
