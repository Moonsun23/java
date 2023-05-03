package day07;

public class Point {		//상속 1
	// x, y를 가지는 Point 클래스를 만들어보자
	private int x;
	private int y; 						// 이렇게 만든 것은 속성(properties)
	//private 때문에 바깥에 내보낼수없음(속성 외부로 유출 못함)
	
	// 행위(메소드)를 통해서 내부의 속성을 바꾸는게 좋다.
	
	// getter(읽기전용)
	// setter
	
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public void showPoint() {
		System.out.println(  "("+x+","+y+")"  );
	}
	

}
