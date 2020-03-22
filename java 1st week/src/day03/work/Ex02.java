package day03.work;

public class Ex02 {
/*
	 게시판에 글을 한페이지에 15개의 글을 표시할 수 있다.
	게시물의 갯수를 랜덤하게 0 ~ 100 발생한 후,
	필요한 페이지의 갯수를 계산하여 출력해주는 프로그램을 작성하시오.
	단, 게시물의 수가 0인 경우, 1 페이지가 필요한 것으로 한다.
 */
	public Ex02() {
		board();
	}//constructor
	
	//함수
	public void board() {
		//게시물의 갯수 랜덤 발생
		int num = (int)(Math.random() * 100);
		
		//페이지에 대한 변수선언
		int page = (num / 15) + 1;
		
		//한페이지당 15개의 글을 표시, 단, 15의 배수와 0의 경우는 결과값이 다를 수 있다.
		if(num % 15 == 0) {
			page = (num / 15);
		}else if(num == 0) {
			page = 1;
		}
		
		//출력하기
		System.out.printf("게시물의 갯수 : %d\n", num);
		System.out.printf("게시판의 페이지의 수 : %d", page);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}//main
}
