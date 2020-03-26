package day14.work;

import javax.swing.JOptionPane;

/*
삼각형 클래스를 작성하고
그 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고
만약 
	밑변이 같으면 같은 삼각형이 되도록
equals 함수, toString 함수를 Overriding 하고 테스트 하세요.

입력은 JOptionPane으로 소속의 함수로 처리하고 출력도 같은 소속의 함수로 처리하세요.
추가로 예외처리도 해주세요.
 */

public class TriTest {
	
	//두 삼각형에 밑변, 높이 정보를 입력해주기 위한 배열 전역변수로 선언 
	String[] vals = new String[2];
	//객체생성
	Triangle[] t;
	//위치값에 대한 변수
	int idx = 0;
	
	public TriTest() {
		//getVals() 함수는 예외를 전이하는 함수이므로,
		//이 생성자함수에서 예외처리를 해줄 것이다.
//		try {
//			getVals();
//		} catch(NumberFormatException e) {
//			JOptionPane.showMessageDialog(null, "형식에 맞지 않는 숫자 입니다. 다시 입력해주세요.");
//			e.printStackTrace();
//		}
		
		getVals();
		
		String msg = "1" + t[0].toString() + "\n" + "2" + t[1].toString() + "\n";
		String msg2 = (t[1].equals(t[0])) ? ("같은 삼각형입니다.") : ("다른 삼각형입니다.");
		JOptionPane.showMessageDialog(null, msg+msg2);
		
	}//Default Constructor
		
	//입력받은 값에 , 혹은 / 가 꼭 포함되는지 확인하여 예외처리 해주는 함수
	public void getVals() /*throws NumberFormatException*/ {
		int width = 0;
		int height = 0;
		
		//문자열 배열에 입력해주기 위한 반복문 
		for(int i = 0; i < vals.length; i++) {
			vals[i] = JOptionPane.showInputDialog((i+1) + " 번 삼각형의 밑변과 높이를 입력하세요.");		
		
			for(int j = 0; j < vals[i].length(); j++) {
				//, 혹은 /가 있는 곳의 위치값을 찾자.
				if(vals[i].charAt(j) == ',') {
					idx = j;
				}//if
			}//inner
			width = Integer.parseInt(vals[i].substring(0, idx));
			height = Integer.parseInt(vals[i].substring(idx+1));
			t[i] = new Triangle(width,height);
		}//outer
		
//		//예외 발생시키기
//		for(int i = 0; i < vals.length; i++) {
//			for(int j = 0; j < vals[i].length(); j++) {
//				if(width < 0 || height < 0) {
//					throw new NumberFormatException();
//				}//if 
//			}
//		}

	}
	
	public static void main(String[] args) {
		TriTest c = new TriTest();
		System.out.println(c.t[0]);
	}//main

}
