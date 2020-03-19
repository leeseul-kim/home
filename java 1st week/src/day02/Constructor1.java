package day02;

public class Constructor1 {
	/*
	 	모든 클래스는 생성자를 가지고 있다.
	 	생성자는 해당 클래스가 객체가 될 때, 멤버가 가져야할 초기값을 셋팅해주는 역할을 한다.
	 	
	 	클래스의 멤버에는 변수와 함수가 있는데,
	 	멤버변수 중 '기본형 멤버변수'들은 자동으로 초기화가 이루어진다.
	 	예로, int		-> 0
	 		  char		-> ' '
	 		  boolean	-> False
	 		  float		-> 0.0f
	 		  double	-> 0.0
	 */
	int no;
	
	public static void main(String[] args) {
		
		//int num = no + 1;//아직 메모리에 Counstructor1 클래스가 등록되지 않았으므로, 변수 역시 마찬가지다.
		
		Constructor1 c1 = new Constructor1(); //메모리에 변수no을 등록하고 초기값도 0으로 해줌.
		
		int num = c1.no + 1; //Constructor1 클래스에 있는 변수를 호출시 소속 클래스를 명시해주어야한다.
		System.out.println(num);
		
		//abc(); //Constructor1에 있는 메서드 abc를 호출하기 위해서는 변수 호출과 마찬가지로 소속 클래스를 명시해야한다.
		c1.abc();

		
	}//main
	
	public void abc() {
		System.out.println("********************");
	}
}
