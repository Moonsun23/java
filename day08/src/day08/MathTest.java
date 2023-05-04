package day08;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.PI); 			//파이 값 출력...
		System.out.println(Math.ceil(3.14)); 	// ceiling 천장이라는 뜻이라서 무조건 올림처리 -> 결과는 4
		System.out.println(Math.floor(3.14));	// 결과는 3
		System.out.println(Math.round(3.14));   // 반올림 // Math가 double 타입으로 return 되는데 round는 정수타입??
		System.out.println(Math.sqrt(9)); 		// sqrt 는 루트.. 결과는 3..
		System.out.println(Math.pow(2, 10));	// 2의 10승
		System.out.println(Math.random()); 		// 1보다 작은 16자리 실수???????
	}
}
