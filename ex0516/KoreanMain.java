package ex0516;

public class KoreanMain {
	public static void main(String[] args) {
		Korean k1= new Korean("문선", 890826);
		System.out.println(k1.name);
		System.out.println(k1.num);
		
		Korean k2= new Korean("지애", 900902);
		System.out.println(k2.name);
		System.out.println(k2.num);
		//속성은 변수 메소드는 동작
	}
}
