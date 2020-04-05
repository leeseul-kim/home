package NumberBaseBall;
/**
 * 이 클래스는 사용자에게서 숫자를 입력받는 클래스입니다. 
 * @author leeseulkim
 *
 */
import javax.swing.*;
import exception.*;

public class GetNums {
	
	String getNums;

	public GetNums() {
		//사용자가 입력한 숫자를 기억해줄 변수선언
		this.getNums = typeNums();
	}//Default Constructor
	
	//숫자 입력받고 처리하기 위한 함수
	public String typeNums() /*throws OverlapNumException*/ {
		String str = "";
		//예외처리기(4자리 이상의 숫자가 들어오는 경우)에서 판별해줄 배열생성
		int[] nArr = new int[4];
		while(true) {
			int check = 0;
			str = JOptionPane.showInputDialog("4자리의 숫자를 입력하세요!");
			//예외처리기
			try {
				//1. 숫자가 아닌 문자가 입력되는 예외 
				check = Integer.parseInt(str);
				//2. 4자리 이상의 숫자가 입력되는 예외  
				for(int i = 0; i < str.length(); i++) {
					nArr[i] = (int)str.charAt(i);
				}
				//3. 중복된 숫자가 입력되는 예외 
				for(int i = 0; i < str.length(); i++) {
					for(int j = 0; j < i; j++) {
						if(str.charAt(i) == str.charAt(j)) {
							throw new OverlapNumException();	
						}
					}
				}
				//4. 4자리 미만의 숫자가 입력되는 예외
				if(check < 1000) throw new UnderValueException();
			} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "4자리 이상의 숫자가 입력되었거나,숫자가 아닌 문자가 입력되었습니다.\n다시 입력해주세요.");
				continue; //예외발생시 다시 반복문 실행 
			} catch(OverlapNumException e) {
				JOptionPane.showMessageDialog(null, "중복된 숫자가 있습니다.\n다시 입력해주세요.");
				continue;
			} catch(UnderValueException e) {
				JOptionPane.showMessageDialog(null, "4자리 미만의 숫자가 입력되었습니다.\n다시 입력해주세요.");
				continue;
			}
			break;
		}//while
		
		return str;
	}
	

	public static void main(String[] args) {
		new GetNums();
	}//main

}
