package day04.work;

import javax.swing.JOptionPane;

/*
두 수를 입력받은 후
두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요.

최대공약수 : 두 수를 나눌 수 있는 최대 수
 */
public class Hw01 {
	
	public Hw01() {
		//두 수를 입력받기, 배열사용
		String[] getNums = new String[2];
		
		//반복문을 이용하여 배열에 데이터 채우기.
		for(int i = 0; i < getNums.length; i++) {
			getNums[i] = JOptionPane.showInputDialog("###최대공약수 찾기###\n" +
											(i+1) + " ) 숫자를 입력하세요.");
			//입력받은 데이터가 숫자만 있는지 체크해줄 변수 
			int val = 0;
			//데이터를 입력받을 때, 숫자가 아닌 문자가 들어오면 재입력해줄 수 있는 예외처리기 
			try {
				val = Integer.parseInt(getNums[i]);
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
				i--; //해당 i를 다시 돌아야하므로, 감가식 해준 후 증감식으로 이동 
				continue;
			}
			//예외처리기를 잘 통과한다면 입력이 잘 이루어진 것이다.
		}//for
		
		//두 숫자 중 작은 값을 찾아주기
		int min = (Integer.parseInt(getNums[0]) > Integer.parseInt(getNums[1])) ? 
						(Integer.parseInt(getNums[1])) : (Integer.parseInt(getNums[0]));
			
		//반복문을 통해 최대공약수 찾아주기 
		for(int i = min; i > 0; i--) {
			if(Integer.parseInt(getNums[0]) % i == 0 && Integer.parseInt(getNums[1]) % i == 0) {
				//두 숫자를 모두 나누어줄 수 있는 값 중에 가장 큰 값이 최대공약수이다.
				JOptionPane.showMessageDialog(null, "입력받은 두 숫자 " +
									Integer.parseInt(getNums[0]) + " , " + Integer.parseInt(getNums[1]) +
									" 의 최대공약수는 " + i + " 입니다.");
				//최대공약수를 찾았다면 반복문 중지해주어야한다.
				break;
			}
		}
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Hw01();
	}//main

}
