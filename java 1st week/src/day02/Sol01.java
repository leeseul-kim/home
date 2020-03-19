package day02;
/**
 * 이 클래스는 day01 Hw01에 대한 솔루션입니다.
 * @author leeseulkim
 * @see day01//Hw01
 *
 */

public class Sol01 {
	public static void main(String[] args) {
		
		double data = 365.2426;
		
		//날짜계산
		int day = (int)data;
		
		//떨어지는 날짜 이외의 데이터를 초로 환산
		int sec = (int)((data % 1) * 24 * 60 * 60);
		//0.2426일 -> 0.2426 * 24(시간)
		//			  0.2426 * 24 * 60(분)
		//			  0.2426 * 24 * 60 * 60(초)
		
		int hour = sec / 3600;
		
		sec %= 3600;
		
		int min = sec / 60;
		
		sec %= 60; //마지막에 나올 최종 sec을 위함
		
		System.out.printf("1년은 %d 일 %d 시간 %d 분 %d 초 입니다.", day, hour, min, sec);
		
	}//main

}
