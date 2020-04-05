package day17;

import java.util.*;

public class Ex03 {
	
	public Ex03() {
		//TreeSet에 네모 넣기
		TreeSet<Ex03_Nemo> set = new TreeSet(new Comparator() {
				public int compare(Object o1, Object o2) {
					return ((Ex03_Nemo)o1).getArea() - ((Ex03_Nemo)o2).getArea();
				}
		});
		
		//네모 클래스에 comparable 없을때 
//		TreeSet<Ex03_Nemo> set1 = new TreeSet();

		Random rnd = new Random();
		
		for(;;) {
			//무한반복
			int width = rnd.nextInt(16) + 1;
			int height = rnd.nextInt(16) + 1;
			
			set.add(new Ex03_Nemo(width, height));
			//set1.add(new Ex03_Nemo(width, height));
			
			//10개만 뽑을 것임
			if(set.size() == 10) break;
		}
		
		//꺼내서 출력하기
			//Set은 따로 출력해주는 함수가 없으므로 Iterator 나 ArrayList로 변경해야함.
		Iterator<Ex03_Nemo> itor = set.iterator();
		
		while(itor.hasNext()) {
			//제너릭스 만들었으므로 강제형변환 하지 않아도 된다.
			System.out.print(itor.next().getArea() + " | ");
			//itor는 네모클래스를 담은 것이고, 면적값을 구하려면 getArea가 필요하다.
		}
		System.out.println();
		
//		//Set to ArrayList
		//지금 네모클래스에 comparable 구현되어 있지 않아서,
		//그 클래스는 비교가능한 클래스가 되지 않았으므로 오류난다.
//		ArrayList list = new ArrayList(set1);
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(((Ex03_Nemo)list.get(i)).getArea() + " | ");
//		}
//		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Ex03();
	}//main

}
