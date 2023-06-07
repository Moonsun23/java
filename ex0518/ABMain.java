package ex0518;

public class ABMain {
	public static void main(String[] args) {
		// 객체생성
		B b=new B();
		System.out.println(b);
		System.out.println(b.toString());
		// toString() 메서드는 최고 조상인 object에 있는 메서드이다.
		// 오버라이딩에서 많이 쓰인다.
		// 주로 어떤 역할을 하는지 문자열로 알려준다.
		
		A a=new B();
		System.out.println(a.x);
//		System.out.println(a.y); 오류남/ 부모는 자식이 속성을 쓸 수 없어서
		
		a.aaa();
		a.sss();// B에서 오버라이딩(재정의)되어서 결과는 b의 sbsbsb로 나온다.
		System.out.println(a.toString());
		// toString() 메서드는 최고 조상인 object에 있는 메서드라서 결과가 BBBB가 나온다.
		
		B b1=(B)a;
				//A가 B로 대입되는 것이기 때문에 앞에 (B)를 써줘야 한다.
		System.out.println(b1.y);
		b1.sss();
		
		A a1= new A();
		
		if(a1 instanceof B) {	//instanceof의 왼쪽에서 참조변수를 오른쪽에 타입(클래스)이 위치.// 피연산자 위치
			
			// A객체를 참조하는 참조변수 a1이 B객체로 형변환이 가능한지 묻는 것
			System.out.println("대입 가능");
		}else {
			System.out.println("대입 불가능");
		}
		
		if(a1 instanceof Object) {
			System.out.println("대입 가능");
		}else {
			System.out.println("대입 불가능");
		}
		}

}
