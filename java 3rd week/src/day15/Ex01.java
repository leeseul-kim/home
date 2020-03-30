package day15;

import java.util.regex.*;
import javax.swing.*;

public class Ex01 {
	public Ex01() {
		String mail = JOptionPane.showInputDialog("이메일을 입력하세요.");
		
		Pattern pattern = Pattern.compile("\\w{8,}@\\w.+[a-zA-Z]{2,6}$");
							//.+ 이후에 나오는 문자의 갯수가 2~6자리이면 된다.
							//.+ 이전에 나오는 문자는 아무거나 오면 된다.
		//Pattern pattern = Pattern.compile("/^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/");
		
		Matcher match = pattern.matcher(mail);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일입니당.");
		}else {
			JOptionPane.showMessageDialog(null, "올바르지 않은 이메일입니당.");
		}
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex01();
	}//main

}
