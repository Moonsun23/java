package ex0516;

public class StudentMain {
	public static void main(String[] args) {
		// 객체 생성 =  new 연산자를 사용한다. // 하나의 변수를 선언하는 것과 같다.
		// new 클래스();
		Student s1 = new Student(); // --> s라는 Student 타입의 변수가 생겨난 것
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student(); // --> s라는 Student 타입의 변수가 생겨난 것
		System.out.println("s2 변수가 또다른 Student 객체를 참조합니다.");
	}
	
}
