package day03.work;

public class Ex01 {
	/*
	 1~100까지의 정수 세개를 랜덤하게 만들어서, 세 숫자가 큰 수부터 차례로 출력되게 하세요.
	 단, 변수는 4개를 넘기지 마세요.
	 */
	public Ex01() {
		order();
	}
	public void order() {
		//정수랜덤하게 만들기 x 3
		int max = (int)(Math.random() * 100) + 1;
		int mid = (int)(Math.random() * 100) + 1;
		int min = (int)(Math.random() * 100) + 1;
		//치환정렬할 변수 선언
		int tmp;
		
		//큰 수가 나올 경우의 수 : 6가지
		if(max > mid && mid > min) {//max - mid - min
			//아무것도 변경해주지 않아도 됨.
		}else if(max > min && min > min) {//max - min - mid
			tmp = mid;
			mid = min;
			min = tmp;
		}else if(mid > max && max > min) {//mid - max - min
			tmp = max;
			max = mid;
			mid = tmp;
		}else if(mid > min && min > max) {//mid - min - max
			tmp = max;
			max = mid;
			mid = min;
			min = tmp;
		}else if(min > max && max > mid) {//min - max - mid
			tmp = max;
			max = min;
			min = mid;
			mid = tmp;
		}else if(min > mid && mid > max) {//min - mid - max
			tmp = max;
			max = min;
			min = tmp;
		}
		
		//출력하기
		System.out.printf("랜덤하게 입력받은 숫자는 \n\n%d\t%d\t%d 입니다.", max, mid, min);

	}
	
	public static void main(String[] args) {
		new Ex01();
	}//main
}
