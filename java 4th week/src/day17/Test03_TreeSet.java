package day17;

import java.util.*;

public class Test03_TreeSet {
	public Test03_TreeSet() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elementary");
		set.add("elephant");
		set.add("fan");
		set.add("flower");
		set.add("jfla");
		
		//이중에서 b로 시작하는 데이터부터
		//d로 시작하는 데이터까지만 꺼내서
		//새로운 Set을 만들어보기
		TreeSet<String> tmpSet = (TreeSet<String>)set.subSet("b", "dzzzzzzzzzzzzzzz");
		//범위를 b, d까지만 해버리면 d 라는 단어만 포함되는 것이다. 
		//HashSet에서는 이 방법은 불가하다.
		
		//출력해보기
		Iterator<String> itor = tmpSet.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
	}//Default Constructor
	
	public static void main(String[] args) {
		new Test03_TreeSet();
	}//main
}
