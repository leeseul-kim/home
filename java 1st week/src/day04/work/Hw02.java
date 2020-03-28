package day04.work;

import javax.swing.JOptionPane;

/*
 두 수를 입력받은 후
두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.

최소공배수 : 두 수로 나누어 떨어지는 가장 작은 수

수1 : 2
수2 : 5
최소공배수 : 10

수1 : 3
수2 : 6
최소공배수 : 6
 */
public class Hw02 {
	
	public Hw02() {
		//입력받은 숫자를 저장할 배열선언
		String[] getNums = new String[2];
		
		//배열에 데이터를 입력
		for(int i = 0; i < getNums.length; i++) {
			getNums[i] = JOptionPane.showInputDialog("###최소공배수 구하기###\n"
										+ (i+1) + " ) 숫자를 입력해주세요.");
			//예외처리기
			int val = 0;
			try {
				val = Integer.parseInt(getNums[i]);
				//숫자만 입력이 되었는지 확인 
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
				i--;
				continue;
			}		
		}//for
		
		//두 숫자 중 서로 나누어 지지 않는다면, 두 수의 곱이 최소공배수가 될 것.
		if(Integer.parseInt(getNums[0]) % Integer.parseInt(getNums[1]) != 0) {
			JOptionPane.showMessageDialog(null, "입력한 두 숫자 " +
								Integer.parseInt(getNums[0]) + " , " +
								Integer.parseInt(getNums[1]) + " 의 최소공배수는 " +
								(Integer.parseInt(getNums[0]) * Integer.parseInt(getNums[1])) +
								" 입니다.");
		}else {
			//두 숫자가 나누어진다면 그 중 큰 수가 최소공배수이다. 
			int max = (Integer.parseInt(getNums[0]) > Integer.parseInt(getNums[1]) ? 
						(Integer.parseInt(getNums[0])) : (Integer.parseInt(getNums[1])));
			JOptionPane.showMessageDialog(null, "입력한 두 숫자 " +
					Integer.parseInt(getNums[0]) + " , " +
					Integer.parseInt(getNums[1]) + " 의 최소공배수는 " +
					max + " 입니다.");
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Hw02();
	}//main

}
