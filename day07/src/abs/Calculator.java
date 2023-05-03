package abs; 										// 추상 클래스.. - 설계도일 뿐이다...

//

public abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int nums[]);
	
}
// interface 도 상속이 가능하다.. interface끼리도 상속이 가능하다.
// java는 다중상속이 안된다.
