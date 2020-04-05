package day17;

import java.util.*;

public class Ex05_Sol {
	//랜덤하게 숫자를 10개 만들어서 컬렉션에 담고 출력하세요.
	//단, 중복숫자는 제외하세요.
	public Ex05_Sol() {
		//중복숫자 제외에는 Set을 사용하는 것이 좋다.
		HashSet<Integer> set = new HashSet<Integer>();
		//랜덤클래스의 랜덤함수를 객체로 선언함.
		Random rnd = new Random();
		
		while(true) {
			//먼저 숫자를 1~45까지 랜덤하게 만들어준다.
			int num = rnd.nextInt(45) + 1;
			
			//set에 채워주기
			set.add(num);
			
			//그런데 우리는 숫자 10개를 넣기로 했다.
			//Set은 중복된 데이터를 허락하지 않기때문에,
			//중복된 숫자가 입력이 되면 입력된 크기는 변경이 되지 않을 것이다.
			//Set에 입력된 데이터의 수가 10개가 되는 순간 이 반복문을 종료해줄 break를 만든다.
			if(set.size() == 10) break;
		}//while
		
		//set 출력하기
			//1. ArrayList로 변환해서 출력하는 방법
		System.out.println("------------ ArrayList 이용 ------------");
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		//정렬하기, 일반적으로 오름차순이다. 
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " | ");
		}
		System.out.println();
		System.out.println();

			//2. Iterator로 출력하는 방법 
		System.out.println("------------ Iterator 이용 ------------");
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}

	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex05_Sol();
	}//main
}
