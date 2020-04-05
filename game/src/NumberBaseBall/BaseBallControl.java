package NumberBaseBall;

import javax.swing.JOptionPane;

/**
 * 이 클래스는 사용자가 입력한 숫자를 판별해주는 클래스입니다.
 * @author leeseulkim
 *
 */

public class BaseBallControl {
	//게임시작을 위한 BaseBall, GetNums 클래스 객체생성
	BaseBall bb = new BaseBall();
	String cor = bb.getRnd();
		//숫자의 경우는 한번 생성되면 바뀌어서는 안된다. 그렇기 때문에 전역변수로 선언.
	GetNums gn;
	
	public BaseBallControl() {
		
		while(true) { //반복문을 돌때마다 계속해서 객체생성해줌. 
			//생성자함수 호출 
			gn = new GetNums();
			
			//랜덤숫자를 불러오기
			String user = gn.getNums;
			
			//자릿수 하나하나 살펴야함.
			//스트라이크, 볼 갯수를 카운트 해줄 카운트변수 선언
			int sCnt = 0;
			int bCnt = 0;
			
			loop : 
			for(int i = 0; i < cor.length(); i++) {	
				for(int j = 0; j < user.length(); j++) {
					//같은 숫자가 있는 경우 
					if(cor.charAt(i) == user.charAt(j)) {
						if(i == j) {
							//숫자도 맞고 자리도 맞는 경우, 즉 strike의 경우임.
							//그리고 다음 자리를 체크해줄 필요 없이 바로 j 증가해주면 된다.
							sCnt++;
							continue;
						}//inner if
						//볼이 나오면 다음 자리를 체크해줄 필요 없이 바로 i 증가시켜 다음 자릿수 비교 
						bCnt++;
						continue loop;
					}//outer if
					//같은 숫자가 없는 경우에는 아무것도 실행하지 않고 다시 i 증감식으로 이동.
				}//inner for
			}//outer for 
			
			
			if(sCnt == 4) {
				JOptionPane.showMessageDialog(null, "축하합니다! 정답을 맞추었습니다!");
				break;
			}else if(sCnt == 0 && bCnt == 0) {
				//카운터변수가 변화가 없으면 아래의 문장을 출력해줌. 
				JOptionPane.showMessageDialog(null, "입력하신 숫자 " + gn.getNums + " 은(는) 아웃입니다.");
				continue;
			}else if(sCnt != 0 || bCnt != 0) {
				JOptionPane.showMessageDialog(null, "입력하신 숫자 " + gn.getNums + " 은(는) " + 
											sCnt + " 스트라이크, " + bCnt + " 볼 입니다.");
				continue;
			}
		}
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new BaseBallControl();
	}//main

}
