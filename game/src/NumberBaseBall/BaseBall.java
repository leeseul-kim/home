package NumberBaseBall;

/**
 * 이 클래스는 숫자야구 게임을 위해 숫자를 생성해주는 클래스입니다.
 * 이 클래스가 객체가 되었을 때, 숫자를 생성하고 룰을 설명해주도록하자.
 * @author leeseulkim
 * @since 4th April 2020
 * @see 
 * 		Algorithm.txt 
 *
 */
public class BaseBall {

	//생성된 숫자를 담을 변수선언 
		//문자열로
	private String cor = "";
	
	public BaseBall() {
		setRnd();
		getRnd();
		//정답 
//		System.out.println(cor);
	}//Default Constructor
	
	//숫자 랜덤하게 발생시켜주는 함수 setter 
	public void setRnd() {
		int[] nums = new int[4];
		//랜덤생성된 숫자를 배열에 담기
		loop : 
		for(int i = 0; i < nums.length; i++) {
			//0~9까지의 숫자를 랜덤추출 
			nums[i] = (int)(Math.random() * 10);
			
			//동일숫자 나오면 재추출해주기 
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j]) {
					i--;
					continue loop;
				}//if
			}//inner
		}//outer 
		
		//배열에 담긴 숫자를 문자열에 더해주기
		for(int i = 0; i < nums.length; i++) {
			cor += nums[i];
		}
	}
	
	//getter
	public String getRnd() {
		return cor;
	}

	public static void main(String[] args) {
		new BaseBall();
	}//main

}
