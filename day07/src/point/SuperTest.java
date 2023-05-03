package point;

//inner class - 여기서 잠깐 쓸 클래스
class Point{
	private int x, y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println( "("+x+","+y+")" );
	}
	
}
class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);						// 부모를 호출하는..// 안쓰면 기본생성자// 쓰면 super(x,y); 10,10...
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		this.showPoint();
	}
}

public class SuperTest {			// Super 예제
	public static void main(String[] args) {
		ColorPoint colorPoint= new ColorPoint(10, 10, "red");
		colorPoint.showColorPoint();
	}
}
