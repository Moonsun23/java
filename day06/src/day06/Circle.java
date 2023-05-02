package day06;

public class Circle { 		// 제네시스 설계도
		int radius;
		String name;
		
		// 과적하다(overload)// 생성자 overload// 몇개를 써도 상관없다.. 같지않게만..
		public Circle()		{ //(public)은 생성자		// 여긴 매개변수가 없고
		//	System.out.println("나는 circle");	// 이걸 쓰면 다음 결과에 항상 이 말이 나옴
			
		}
		public Circle(int r) {			// 여긴 매개변수가 있음(int)..
			radius=r;
		}	
		public Circle(int r, String n) {			// 여긴 매개변수가 있음(int)..
			radius=r;
			name= n;
		}
		public double getArea() { // 어떤 행동을 취할때 동사를 많이 쓴다.
			return 3.14*radius*radius;
		}
	
}
