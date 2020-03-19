package day01;

public class Operator1 {
	public static void main(String[] args) {
		
		/*
		 	대입연산자
		 		: 데이터를 변수에 기억시킬 때 사용하는 연산자
		 		
		 		종류]
		 			=, +=, -=, *=, /=, %=
		 			
		 		뜻]
		 			ex)	a *= b >> a = a * b
		 */
		
		//=
		int no1 = 10;
		
		//+=
		int no2 = 10;
		no2 += 10;			//no2 = no2 + 10
		
		//-=
		int no3 = 10;
		no3 -= 10;			//no3 = no3 - 10
		
		//*=
		int no4 = 2;
		no4 *= 3;			//no4 = no4 * 3
		
		///=
		int no5 = 10;
		no5 /= 3;			//no5 = no5 / 3
		
		//%=
		int no6 = 10;
		no6 %= 3;			//no6 = no6 % 3
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		
		
	}//main

}
