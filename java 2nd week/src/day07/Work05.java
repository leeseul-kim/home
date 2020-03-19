package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Work05 {
	/*
		영문 문자열을 입력받아서
		해당 알파벳이 출현하는 빈도를 저장하고
		빈도를 * 로 표현하세요.
	 */
	public static void main(String[] args) {
		
		//영문문자열을 입력받기
		String str = JOptionPane.showInputDialog("영문 문자열을 입력하세요.");
		//예, aabbcc
		
		//중복을 제거해주기 위한 반복문
		//이때 중복을 제거하고 난 문자열만을 임시변수에 저장시킨다.
		//임시변수선언
		String tmp = str.charAt(0) + ""; //charAt함수는 char타입으로,
										//""를 이용하여 문자열타입으로 변경
		
		outer:
		for(int i = 1; i < str.length(); i++) {	//중복 비교는 입력받은 문자열의
										//1번부터 끝까지 모두 비교해야한다.
			for(int j = 0; j < i; j++) { 
				
				//입력받은 문자열의 i의 위치에서의 값이 
				//i보다 작은 위치에서의 값과 일치하면 중복이므로
				//tmp에 누적되어서는 안된다.
				if(str.charAt(i) == str.charAt(j)) {
					//str 과 tmp 를 비교하면 안되는 이유
						//기본적으로 둘은 다른 문자열을 가지게 될 수도 있다.
						//왜냐면 tmp는 중복되지 않은 문자열들만 누적시키기때문.
						//그렇기 떄문에 str 값들을 서로 비교해주어야한다.
					continue outer;
				}//if
				
			}//inner
			
			//inner for문을 다 돌았는데도, 중복된 값이 없으면,
			//이 곳을 지나게 된다. 여기서 tmp에 누적시키면 된다.
			tmp += str.charAt(i);
		}//outer
		
		//tmp 출력해보기(확인!)
//		System.out.println(tmp);
		
		//tmp를 배열로 변경하기
		char[] cArr;
		cArr = tmp.toCharArray();
		
		//카운트배열>>길이는 tmp의 길이만큼!
		//왜냐하면 입력된 문자열은 tmp 중 하나라도 있기 때
		int count[] = new int[cArr.length];
		
		//입력받은 문자열에서 중복된 알파벳을 세어준다.
		for(int i = 0 ; i < cArr.length; i++) {
			//tmp 문자열 길이만큼 반복
			int cnt = 0; //단순 숫자세주기 위한 변수
			
			for(int j = 0; j < str.length(); j++) {
				//입력받은 문자를 처음부터 끝까지 반복시켜
				//tmp 문자열과 같은 것이 있으면 세어주는 반복문
				if(cArr[i] == str.charAt(j)) {
					cnt++;
				}//if
			}//inner
			
			//카운트배열에 데이터 입력 
			count[i] = cnt;	
		
		}//outer
		
		//정렬해주기
		for(int i = 0; i < cArr.length - 1; i++) {
			
			for(int j = i + 1; j < cArr.length; j++) {
				
				if(cArr[i] > cArr[j]) {
					char ch = cArr[i];
					cArr[i] = cArr[j];
					cArr[j] = ch;
				}
				
			}//inner
		}//outer
		
		//정렬 제대로 되었는지 확
		System.out.println(Arrays.toString(cArr));
		
		//*표시할 문자열변수 선언
		String star;
		//출력해줄 메세지배열선언
		String[] msg1 = new String[cArr.length];
		
		//빈도수만큼 * 표시하기
		for(int i = 0; i < cArr.length; i++) {
			
			star = "";
			
			for(int j = 0; j < count[i]; j++) {
				
				star += "*";
				
			}//inner
			
			msg1[i] = "\t" + cArr[i] + " " + star + "\n";
			
		}//outer
		
		//메세지출력
		String msg = "입력한 문자열 " + str +
					"\n영문자의 출현 빈도\n" + Arrays.toString(msg1);
		
		JOptionPane.showMessageDialog(null, msg);
		
	}//main

}
