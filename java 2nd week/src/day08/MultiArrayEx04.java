package day08;

import javax.swing.JOptionPane;

public class MultiArrayEx04 {
	/*
		 	"PengSoo Good!"
		이라는 문자열을 한문자씩 꺼내서
		배열로 저장하고
		하나씩 꺼내서 출력하세요.
	 */
	public static void main(String[] args) {
		
		String msg = "PengSoo is Cute!";
		
		//문자를 저장할 배열생성
		char[] cArr = new char[msg.length()];
		
		//초기화
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = msg.charAt(i);
		}
		
//		System.out.println(Arrays.toString(cArr));
		
		//팝업창과 콘솔창에 출력하
		//팝업창에 띄우기 위한 문자열 임시변수 선언
		String tmp = "";
		for(int i = 0; i < cArr.length; i++) {
			System.out.printf("%2c", cArr[i]);
			tmp += cArr[i];
		}
		
		JOptionPane.showMessageDialog(null, tmp);
		
	}//main
}
