package ex0517;

public class Calculator2Main {
	public static void main(String[] args) {
		// 정적 변수 값 확인
		// 객체생성없이 사용가능
		System.out.println(Calculator2.pi);
		
		// 정적 메서드 사용
		int result=Calculator2.plus(10, 5);
		System.out.println(result);
		
		int result2=Calculator2.minus(10, 5);
		System.out.println(result2);
		
	}
}
