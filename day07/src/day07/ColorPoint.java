package day07;

public class ColorPoint extends Point { 		// 먼저 만들어둔 Point의 x, y를 상속받아온다.
//	private int x;
//	private int y; // 이렇게 또 x, y를 쓰지말고 위처럼 extends를 써서 상속받아온다.
	
	
	private String color;
	
//	private int x;
//	private int y;	// 부모클래스에서 x, y를 private으로 썼기 때문에  여기도 써줘야 한다...
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		this.showPoint(); 				// 부모가 허용한 것을 물려받을 수 있다.
	}

	
}
