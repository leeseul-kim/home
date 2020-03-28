package day04.work;
/*
 1 - 2 + 3 - 4 + 5 -.....  
 이렇게 계산을 할 경우 결과값이 100이 넘어가는 
 처음 숫자는 몇인지, 결과값과 함께 출력하세요.
 */

public class Ex04 {
	public Ex04() {
		//마이너스값을 해줄 수 있는 변수 선언
		int minus = -1;
		//값을 누적해서 더해줄 수 있는 변수 선언
		int rst = 0;
		
		//반복문을 통해 값을 더해주거나 빼주기
		//증감식 해주기
		int cnt = 0;
		while(true) {
			cnt++; //반복문을 한번 돌 때 증가시켜주기.
			
			minus *= -1;
			rst += (minus*cnt);
//			//짝수번째에 - 해주어야함.
//			if(cnt % 2 == 0) {
//				rst += (cnt * -1);
//			}else {
//				rst += cnt;
//			}
			
			//rst값이 100이 넘어가면 반복문 종료
			if(rst > 100) {
				break;
			}//if

			//출력해주기
			System.out.print(rst + "\t");
		}//while
		System.out.println();
		System.out.println("100이 넘어가는 처음 숫자는 " + cnt + " 이고, 결과값은 " + rst + " 입니다.");
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex04();
	}//main

}
