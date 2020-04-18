package programming_Intermediate.selfStudyBook1;

import java.util.*;

public class Array_BabyGin {

	public static void main(String[] args) {
		//전체 테스트 케이스의 수를 입력하기
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		//0~9까지 숫자카드에 대한 배열생성
		int[] cardArr = new int[10];
		
		//테스트케이스 갯수만큼 6자리 숫자입력받을 반복문
		for(int i = 1; i <= tc; i++) {			
			//6장의 숫자를 임의로 입력받기 >> 문자열로 받기
//			System.out.println("6자리 숫자를 입력하세요.");
			String nums = sc.next();
			int[] nArr = new int[6];
			for(int j = 0; j < nArr.length; j++) {
				nArr[j] = (nums.charAt(j) - 48);
			}			
			System.out.println(Arrays.toString(nArr));
			//입력된 6장의 숫자카드를 체크하고 카운팅해서 cardArr에 데이터 입력하기 
			for(int j = 0; j < cardArr.length; j++) {//0~9까지의 카드 
				int cnt = 0;
				for(int k = 0; k < nArr.length; k++) {//입력받은 6자리의 숫자 카운팅 
					if(nArr[k] == j) {
						cnt++;
					}
					
				}
				cardArr[j] = cnt;
			}
			System.out.println(Arrays.toString(cardArr));
			//triplet 과 run 을 조사해줄 변수 선언
			int tri = 0;
			int run = 0;
			//cardArr에 들어있는 데이터 확인 > 3이상의 수가 있는지, 연속한 수가 있는지 확인
			for(int j = 0; j <cardArr.length; j++) {
				//triplet 조사
				if(cardArr[j] >= 3) {
					cardArr[j] -= 3;
					tri += 1;
					j--;
				}
				//run 조사
				if(cardArr[j] >= 1 && cardArr[j+1] >= 1 && cardArr[j+2] >= 1) {
					cardArr[j] -= 1;
					cardArr[j+1] -= 1;
					cardArr[j+2] -= 1;
					run += 1;
					j--;
				}
			}
			
			//baby-gin | lose
			if(tri + run >= 2) {
				System.out.println("Baby Gin");
			}else {
				System.out.println("Lose");
			}
		}
		sc.close();		
	}//main
	
}
