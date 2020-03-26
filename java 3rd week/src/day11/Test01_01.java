package day11;

public class Test01_01 {
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();
		//t1, t2, t3는 각각 별개의 instance이다.
		
		t1.num = 10;
		System.out.println(t1.num);
		System.out.println(t2.num);
		System.out.println(t3.num);
		
		System.out.println(Test01.num);
		//static이 편하긴 하지만, 개인정보 등 보안이 중요한 데이터의 경우에는 사용하는 것은 좋지 않다.
		
	}//main

}
