package day06.work;
/*
	 int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	이라는 배열을 이용하여, 79,456원을 위의 화폐단위로 계산할 때,
	각각 몇 장, 몇 개가 필요한지 갯수를 저장할 배열을 만들고, 
	그 배열을 출력하는 프로그램을 작성하세요.
 */

public class Ex03 {
	public Ex03() {
		//배열선언
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		//변수선언
		int money = 79456;
		//화폐의 갯수를 저장할 변수 
		int count = 0;
		
		System.out.println("<<" + money + " 원에 필요한 화폐의 갯수>>");
		//반복문을 통해 계산
		for(int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			//필요한 화폐의 갯수.
			
			money %= coin[i]; //이후, 나머지 값을 money에 저장.
			//지폐와 동전구분
			if(i < 3) {
				System.out.println(coin[i] + " : " + count + " 장");
			}else {				
				System.out.println(coin[i] + " : " + count + " 개");
			}
		}
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex03();
	}//main

}
