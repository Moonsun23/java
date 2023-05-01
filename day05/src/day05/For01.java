package day05;

public class For01 {
	public static void main(String[] args) {
		// 1+2+3+...9+10=55
		// 문(statement 제어문, 반복문)
		// 식(계산) -> 문과 식으로 나눠준다.
		
		
		int sum=0;				// -> 더하는 값을 정해주어야 하니까
		for(int i=1; i<=10; i++) {
			sum=sum+i; //1
//			sum=1+2 //3
//			3+3...args /
			
			System.out.print(i);
			if(i<10) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	//	System.out.println(sum);		// 이럴 경우 합만 출력
	}
}
