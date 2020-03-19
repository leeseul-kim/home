package day01;

public class Hw01 {
	/*
	 	1년은 365.2426일이다.
	 	이 날짜는 몇 일, 몇시간, 몇 분, 몇 초인지 계산하여 출력하시오.
	 */
	public static void main(String[] args) {
		
		float year = 365.2426f;
		
		int days = (int)year;	//float타입이 메모리가 .xxx만큼 더 크므로 형변환이 필요.
		System.out.printf("1년은 %f 일인데, 이는 %d 일 ", year, days);
		
		//0.2426일을 시간으로 바꾸려면 x24를 해야한다.
		year %= days;
		double hours1 = year * 24; 
		//int hours = (int)(year * 24);
		int hours2 = (int)hours1;
		
		//0.8227539시간을 분으로 바꾸려면 x60을 해야한다.
		hours1 %= hours2;
		double min1 = hours1 * 60;
		int min2 = (int)min1;
		
		//0.3652분을 초로 바꾸려면 다시 x60을 해야한다.
		min1 %= min2;
		int sec = (int)(min1 * 60);
		System.out.printf("%d 시간 %d 분 %d 초 입니다. ", hours2, min2, sec);
		
		
	}//main 
}
