package day02;

public class Constructor2 {
	
	//** 함수를 분리해서 만들어 사용하는 것이 좋다. **
	
	public Constructor2() { //생성자 method
		
		int sum = addNums(10, 50);
		System.out.println("10과 50의 합은 " + sum + " 입니다.");
		
	}
	
	public static void main(String[] args) {
		
		new Constructor2(); //Constructor2 함수를(method) 실행하겠다는 의미.
		
	}//main
	
	/*
	 	함수 : 프로그램에서 기능을 가진 최소 단위
	 	
	 		형식]
	 			[접근지정자] [속성] 반환값타입 함수명([매개변수 리스트]) {
	 			
	 				함수내용..
	 				
	 				[return [반환값];]
	 			
	 			}
	 			
	 			참고]
	 				반환값 반환하기
	 				
	 					return [반환값];
	 					>>돌려줄 값이 있으면 함수를 불러온 곳으로 돌려주고 함수를 종료한다.
	 					
	 				반환값이 없는 경우는 반환값을 기술하지 않고,
	 				return 명령의 의미는 이 함수를 즉시 종료하세요 이다.
	 			
	 				
	 			반환값 타입]
	 				되돌려 줄 데이터의 타입을 의미한다.
	 				만약, 되돌려 줄 데이터가 없는 경우는 void로 기술한다.
	 */

	//예] 두 정수를 입력하면 그 두 정수를 더한 값을 반환해주는 기능을 가진 함수를 만들어보자.
	
	public int addNums(int no1, int no2) {
		
		int sum = no1 + no2;
		
		return sum; //반환값 타입과 return 후에 들어갈 타입이 모두 동일해야한다.
		
		//위의 코드를 한줄로 줄이면,
		//return no1 + no2;
		
	}
}
