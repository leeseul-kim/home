package day02;

public class Random_Work03 {
	/*
	 0~255 사이의 랜덤한 숫자를 만들고, 그 숫자를 코드값으로 하는 문자를 만들어서
	해당 문자가 영문자인지 아닌지 판별하여 출력하세요.
	단, 삼항연산자를 사용하여 처리하세요.
	 */

	public Random_Work03() {
		String str = check();
		
		System.out.println(str);
		
	}//constructor
	
	public String check() {
		//랜덤숫자발생
		int rnd = (int)(Math.random() * 256);
		System.out.println("랜덤숫자 : " + rnd);
		
		//아스키코드로 판별해주기 위한 문자변수
		char ch = (char)rnd;
		
		//삼항연산자로 판별
		String msg = (ch >= 'A' && ch <= 'Z') ? ("랜덤숫자 [ " + rnd + " ] 의 아스키코드는 영문자 [ " + ch + " ] 입니다.") : 
												(	(ch >= 'a' && ch <= 'z') ? ("랜덤숫자 [ " + rnd + " ] 의 아스키코드는 영문자 [ " + ch + " ] 입니다.") : 
													("랜덤숫자 [ " + rnd + " ] 의 아스키코드는 [ " + ch + " ] 으로, 영문자가 아닙니다.")	);
		return msg;
	}
	
	public static void main(String[] args) {
		new Random_Work03();
	}//main
}
