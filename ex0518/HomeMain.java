package ex0518;

public class HomeMain {
	public static void main(String[] args) {
		System.out.println(Home.a);	// 모든 접근 허용
		System.out.println(Home.b);	// 프로텍티드 같은 패키지에 있어서 가능
		System.out.println(Home.c);	// 디폴트 같은 패키지라서
//		System.out.println(Home.d);	// 본인 클래스에서만 사용가능
		
	}
}
