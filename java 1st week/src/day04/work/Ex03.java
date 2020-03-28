package day04.work;

import javax.swing.JOptionPane;

/*
 5자리 정수를 입력받아서 그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
 		
 		회문수란?
 			앞에서 읽으나 뒤에서 읽으나 똑같은 수
 			ex) 12321	회문수임
 				12312	회문수아님
 				...
 				
 		참고]
 			charAt(int index) 를 사용
 */
public class Ex03 {
	
	public Ex03() {
		int num = 0;
		String msg = "";
		//숫자형태의 문자열을 입력받기, 단 형식에 맞지 않으면 재입력받도록하기 
		loop : 
		while(true) {
			msg = JOptionPane.showInputDialog("***회문수판별기***" + "\n" +
														"3자리 이상 숫자를 입력하세요.");
			//입력받은 문자가 3자리 이상 숫자가 아니면 재입력 받도록
			try {
				num = Integer.parseInt(msg); //숫자가 아닌 문자가 입력되면 재입력
				if(num - 100 < 0) throw new Exception(); 
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자 형식이 올바르지 않습니다.\n다시 입력해주세요.");
				continue loop;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "3자리의 숫자만 입력해주세요.");
				continue loop;
			}
			
			break loop;
		}//while		
		
		//try-catch로 걸러낸 숫자를 뒤에서부터 꺼내 원본과 비교
		String tmp = "";
		for(int i = msg.length() - 1; i >= 0; i--) {
			tmp += msg.charAt(i);
		}
		
		if(msg.equals(tmp)) {
			//원본과 tmp가 동일하다면 회문수이다.
			String str = "입력하신 숫자 [ " +  msg + " ] 는 회문수 입니다.";
			JOptionPane.showMessageDialog(null, str);
		}else {
			String str = "입력하신 숫자 [ " +  msg + " ] 는 회문수가 아닙니다.";
			JOptionPane.showMessageDialog(null, str);
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex03();
	}//main

}
