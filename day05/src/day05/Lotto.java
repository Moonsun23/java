package day05;

// import java.util.Arrays;
// import java.util.Collections;

public class Lotto {
	public static void main(String[] args) {
		for(int k=0; k<5; k++) {
		int lotto[]= new int[6];	
		// 변수 선언은 1개만 할 수 있는데 1개 이상 선언하고싶을때, 그리고 공간확보를 위해 배열을 사용한다.
		System.out.println("로또번호"+(k+1)+" : ");
		
		for(int i=0; i<lotto.length; i++) {
		//	lotto[i]= i+1;				// 이렇게 쓰면 1~5 밖에 안나옴
		//	lotto[i]= Math.random();	// 선언 안쓰고 쓸수있는 몇 안되는 함수(Math라는 객체가 있고 random..)
			lotto[i]= (int)(Math.random()*45)+1;
		//	System.out.println((int)(Math.random()*45));  	//-> int 없이 쓰면 소수점이 많이 나오기 때문에 형변환 필요
		
		// 위 내용으로 출력한다면 중복 될 수 있기 때문에 아래 for문을 더 써준다.
			for(int j=0; j<i; j++) {					// i랑 비교해서 숫자 하나가 빠지게끔
				if(lotto[i]==lotto[j]) { 				// 그냥 j와 lotto[j]의 숫자가 다르다는 것.
					i--;							// 증감연산...위에서 중복이 됐다면 빼버려야 하니까 
					
					break;
					}		
			}			
			
		} // 여기까지 과정이 filtering.. 그리고 sorting은
	// Arrays.sort(lotto);	
//	Arrays.sort(lotto, Collections.reverseOrder());
		for(int j=0; j<lotto.length; j++) {
			
			System.out.print(lotto[j]+",");
		}
			System.out.println();
		}
	
	
	}
}
