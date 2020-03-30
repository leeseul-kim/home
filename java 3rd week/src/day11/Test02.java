package day11;

public class Test02 {
	public static void main(String[] args) {
//		int num1 = getRandom();	
			//static 함수 안에서는 static 멤버 또는 메모리에 올려진 데이터만 사용가능하다.
		
		//단, 꼭 사용해야한다면?
		//1. 사용할 함수를 멤버로 가지는 클래스의 객체를 만들어준다.
			//객체 = Reference Variable(참조변수, 주소) + Instance(Heap 영역에 올라가진 데이터)
		Test02 t1 = new Test02(); //해당 클래스의 객체생성.
		int no1 = t1.getRandom();	//해당 클래스가 가지고 있는 함수 호출 
		
		//static 멤버함수 호출
		int no2 = getTen();
			//getTen()함수는 static의 속성을 가지고 있기 때문에
			//별다른 new 명령없이 바로 static 메모리에서 불러올 수 있다.
	}//main
	
	//함수만들기
	public int getRandom() {
		int rst = (int)(Math.random() * 7 + 1);
		return rst;
	}
	
	public static int getTen() {
		return 10;
	}

}
