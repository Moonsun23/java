package other;

import day07.Person; 		// 퍼블릭/프라이빗/프로텍테드/디폴트 예제.. =>>>>// day07의 Person을 쓰기 위해 import 해와야 함.

public class Student extends Person {
	public void set() {
		this.height=185; 		// protected는 넘어온다.
		this.setWeight(90);
		this.name="홍길동";
		
	}
}
