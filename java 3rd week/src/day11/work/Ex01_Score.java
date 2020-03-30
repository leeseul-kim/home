package day11.work;
/*
 	문제2]
 		이 클래스는 학생 한명의 
 		이름, java, oracle, html, javascript, jsp, spring의 점수를 기억할 클래스이다.
 		이 클래스가 객체가 될 때 데이터를 입력받아서 각 변수에 기억이 되도록
 		클래스를 정의하세요.
 		
 		단, 데이터가 입력이 안된 경우, 이름은 "박광호"으로 하고,
 		성적은 랜덤하게 기억되게하세요.
 */
public class Ex01_Score {
	//전역변수선언
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	//이 클래스가 객체가 될 때 생성자함수가 호출된다.
	public Ex01_Score() {
		this("박광호", getScore(), getScore(), getScore(), getScore(),
						getScore(), getScore());
	}//Default Constructor
	
	public Ex01_Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring) {
		//변수 값을 초기화해주는 용도 
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;	
		//다른 클래스에서 이 클래스의 생성자함수를 호출했을 때,
			//합계와 평균을 구해주는 함수까지도 같이 호출되면서
			//값이 각각 입력이 된다.
		setTotal();
		setAvg();
	}//Overloading Constructor
	
	//값을 랜덤하게 구해주는 함수
	public static int getScore() {
		//static 속성을 통해 메모리에 미리 올려야한다.
		return (int)(Math.random() * 100);
	}
	
	//합계를 구해주는 함수
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	
	//평균을 구해주는 함수
	public void setAvg() {
		this.avg = total / 6.;
	}

	//출력해주는 함수
	public void toPrint() {
		System.out.printf("###%s 학생의 성적###\n", name);
		System.out.printf("\tjava : %d \n", java);
		System.out.printf("\toracle : %d \n", oracle);
		System.out.printf("\thtml : %d \n", html);
		System.out.printf("\tjavascript : %d \n", javascript);
		System.out.printf("\tjsp : %d \n", jsp);
		System.out.printf("\tsprint : %d \n", spring);
		System.out.println("-----------------------------");
		System.out.printf("\t합계 : %d\n", total);
		System.out.printf("\t평균 : %.2f\n", avg);
	}
}
