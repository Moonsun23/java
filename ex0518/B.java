package ex0518;

public class B extends A {
	int y=200;
	
	public String toString() {
		//문자열을 리턴해줄때 씀
		return"BBBB";
	}
	//오버라이딩
	//메서드의 선언부가 같고 구현부가 다른 것.
	//메서드(){..구현수..}
	public void sss() {
		System.out.println("sbsbsb");
	}
}
