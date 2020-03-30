package day16.Hw;

//캘린더 클래스

import java.util.*;

public class Hw01 {
	public Hw01() {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		//캘린더함수는 추상함수를 가지고 있는 추상클래스이므로,
		//생성자함수는 따로 존재하지 않는다.
		//그렇기 때문에 new 시킬 수가 없기 때문에, 다른 메서드를 사용하여 객체생성해야한다.
		
		//현재 date에 7을 더한 값.
		cal1.add(Calendar.DATE, 7);
		
		//setting 해주기
		cal2.set(2020, 3, 10);
		//이때, 중간에 들어가는 month는 1월부터 12월까지를 인덱스처럼 0부터 11까지라고 표시해주면 된다.
		
		//roll
		cal3.roll(Calendar.DATE, true);
			//현재 날짜에서 1 증가한 값을 표현.
		
		//데이터를 꺼내오는 것은 get을 사용한다.
		System.out.println(cal1.getTime());
		System.out.println(cal2.getTime());
		System.out.println(cal1.after(cal2));
			//cal1이 cal2 객체보다 늦은 시간인지?
		System.out.println(cal2.before(cal1));
		System.out.println(cal1.before(cal2));
		System.out.println(cal3.getTime());
		System.out.println(cal3.getActualMaximum(Calendar.DAY_OF_MONTH));
	}//Default Constructor
	
	public static void main(String[] args) {
		new Hw01();
	}//main

}
