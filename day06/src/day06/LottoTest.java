package day06;

public class LottoTest {
	
	
	
	
	public static void main(String[] args) {
		Lotto lotto=new Lotto();
		lotto.howMany(2);
		
		Lotto lotto02=new Lotto(2);
		
		/*
		 * main - 자바가 실행 될 출구가 필요할때 쓰는것../ 이름이 정해져있는 것.
		 * static을 써서 미리 메모리(heap)에 띄워두기 위해서 쓴다.
		 * static - heap메모리 라는 뜻이 있음
		 * new를 해야 메모리를 끌어올리는 것이 있음
		 * main이란 함수만 미리 static을 통해 메모리를 띄워두고 쓴다.
		 */
	}
}
