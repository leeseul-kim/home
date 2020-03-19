package day08;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MultiArrayEx05 {
	/*
		금액을 입력하면
		금액만큼의 로또게임을 만들어주는 프로그램을 작성하세요.
		로또 한게임은 1000원이고, 한장에는 5게임이 들어간다.
		입력 금액은 1000원 단위로 하기로 한다.
		단, 로또 번호는 오름차순 정렬해서 저장하세요.
		
		예]
			입력금액 : 8000원
			
			로또 :
				1,2,3,4,5,6			- 1게임
				7, 8,9,10, 11,12	- 2게임
				...
				11, 12,13,14,15,16 	- 5게임
				--------------------------
				1,2,3,4,5,6			- 6게임
				7, 8,9,10, 11,12	- 7게임
				11, 12,13,14,15,16 	- 8게임
	 */
	public static void main(String[] args) {
		
		//금액을 입력받기 >> 숫자가 아닌게 입력되면 다시 입력받기
		String money = "";
		int check = 0; //반복문 탈출
		loop : 
		while(check == 0) {
			money = JOptionPane.showInputDialog("금액을 입력해주세요. (숫자만, 1000원 이상부터 가능)");
			
			for(int i = 0; i < money.length(); i++) {
				
				//숫자가 아닌 것이 들어가면 반복문 다시 
				if(money.charAt(i) < '0' || money.charAt(i) > '9') {
					JOptionPane.showMessageDialog(null, "형식이 맞지 않습니다. 숫자만 입력해주세요.");
					check = 0;
					continue loop;
				}
				
				//1000원 미만이 입력되면 반복문 다시
				if(money.length() < 4) {
					JOptionPane.showMessageDialog(null, "금액은 1000원 이상만 가능합니다. 다시 입력해주세요.");
					check = 0;
					continue loop;
				}
				
				//만일, 위 두 조건에 모두 걸리지 않은 완벽한 금액이라면, 반복문 탈출
				check = 1;
			}//for
		}//while
		
		//로또 몇 줄이 나와야하는지에 대한 코드
		//입력받은 금액을 나누고 그 값을 저장할 변수생성
		int line = Integer.parseInt(money) / 1000;
		
		
		//System.out.println(line);
		//System.out.println(sheet);
		
		//로또번호 생성, line만큼 
		int[][] lotto = new int[line][6];
		for(int k = 0; k < line; k++) {
			
			outer :
			for(int i = 0; i < lotto[k].length; i++) {
					
				lotto[k][i] = (int)(Math.random() * (45)) + 1;
				
				//중복되는 수가 있으면 다시 뽑기
				for(int j = 0; j < i; j++) {
					//i=0,j=0일때는 돌지않음.
					//i=1일때부터 반복체크함.
					if(lotto[k][i] == lotto[k][j]) {
						//중복된다면 해당번호를 다시 뽑아주어야하는데, continue 사용하면 증감식으로 가므로,
						//해당번호를 건너뛰어버림. 그러므로 감가식해야함.
						i--;
						continue outer;
					}//if
				}//inner
			}//outer
			
		}
		
		//오름차순으로 정렬
		for(int i = 0; i < line; i++) {
			//2차원배열이므로 line별로 오름차순정렬해야함
			for(int j = 0; j < lotto[i].length - 1; j++) {
				//처음부터 마지막번호 전까지 다 체크해야함. 마지막번호는 해줄필요없음.
				
				for(int k = j+1; k < lotto[i].length; k++) {
					//비교해줄 대상은 현재값 다음부터 끝까지임.
					if(lotto[i][j] > lotto[i][k]) {
						//치환
						int tmp = lotto[i][j]; //큰값을 치환
						lotto[i][j] = lotto[i][k];
						lotto[i][k] = tmp;
					}//if
				}//1st for
			}//2nd for
		}//3rd for
		System.out.println(Arrays.deepToString(lotto));
		//출력하기
		//StringBuffer buff = new StringBuffer();
		System.out.println("입력한 금액 : " + money + " 원");
		System.out.println("====================로\t또====================");
		//JOptionPane.showMessageDialog(null, buff.toString());

		//로또 1장에 5줄이 들어감. 이에 대한 배열생성
		int sheet = (line - 1)/5 + 1;
		
		outer : 
		for(int i = 1; i <= sheet; i++) {
			//5줄 이상일때.
			if(line >= 5) {
				//우선 5줄은 실행되어야함.
				for(int j = 5 * (sheet-1); j < 5 * sheet; j++) {
					for(int k = 0; k < lotto[j].length; k++) {
						System.out.print(lotto[j][k] + "\t");
					}//inner
					System.out.println();
				}//2nd
				System.out.println("----------------------------------------------");
				line -= 5; //다시 sheet 반복문을 돌때, line 판별시켜야함.
				continue outer; //sheet 증감식으로 이동
			}else if(line < 5) {
				for(int j = 1; j <= line; j++) {
					for(int k = 0; k < lotto[j].length; k++) {
						System.out.print(lotto[line + 5][k] + "\t");
					}//inner
					System.out.println();
				}//2nd
				System.out.println("----------------------------------------------");
				break outer; //5줄미만이면 for문을 종료한다.
			}//if
		}//outer for
		
		//System.out.println(Arrays.deepToString(sheetArray));
		
		
	}//main
}