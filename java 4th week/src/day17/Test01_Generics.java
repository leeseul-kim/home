package day17;
/**
 * 이 클래스는 제네릭스 연습 클래스입니다. 
 * @author leeseulkim
 *
 */
import java.util.*;

public class Test01_Generics {
	public Test01_Generics() {
		ArrayList<Ex01_Sagak> list = new ArrayList<Ex01_Sagak>();
		//이 리스트는 Ex01_Sagak 클래스만 담을 수 있는 ArrayList입니다.
		//입력하는 데이터를 강제할 수 있는 것을 제네릭스라고 한다.
		
		for(int i = 0; i < 10; i++) {
			list.add(new Ex01_Sagak((int)(Math.random() * 16 + 5), (int)(Math.random() * 16 + 5)));
			
			//list.add(new Ex02_Samgak);
				//다른 클래스를 넣으려고 하면 오류난다.
		}//클래스 10개를 리스트에 넣음
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%2d ] %5.0f", i+1, list.get(i).getArea());
			//만일, 제네릭스를 설정하지 않았다면,
			//(Ex01_Sagak)list.get(i).getArea() 로 강제형변환해야한다.
				//왜냐하면 리스트에 입력될 때 Object 타입으로 되었기 때문. 
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		int i = 1;
		//향상된 for문으로 꺼내보기
		for(Ex01_Sagak s : list) {
			System.out.printf("%2d ] %5.0f", i++, s.getArea());
			//향상된 for문에서 Ex01_Sagak 클래스변수 s를 선언했기 때문에
			//list.get이 아닌 바로 s 클래스 호출하면 된다.
			System.out.println();
		}
		
		ArrayList<List> list2 = new ArrayList<List>();
		list2.add(new Vector());
		list2.add(new ArrayList());
		list2.add(new LinkedList());
		//정해져있는 타입을 상속받은 클래스를 add해도 상관없다.
		
		ArrayList<Collection> list3 = new ArrayList<Collection>();
		list3.add(new Vector());
		list3.add(new ArrayList());
		list3.add(new LinkedList());
		list3.add(new HashSet());
		list3.add(new TreeSet());
//		list3.add(new HashMap());
		//오류. 상위클래스가 list, set과는 다르기 때문이다.
		
	}//Default Constructor
	
	public static void main(String[] args) {
		new Test01_Generics();
	}//main
}
