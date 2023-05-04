package day08;

//inner class
class Point {
	private int x, y;

	public Point(int x, int y) {
		super(); // 안써도 자동호출
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	public String toString() {
//		return "Point("+x+","+y+")";									// 결과를 뱉어내야해서 return을 써야함
//				
//	}	// 오버라이드를 많이 쓰기 때문에 이클립스에 기능이 있다.(위에)

}

public class ObjectTest {
	public static void main(String[] args) {
		Point point = new Point(10, 10); // 클래스를 선언하며 생성자가 생겨서 Point가 타입이 된다???
		Point point02 = new Point(10, 10);
		
		point.setX(20);								// x의 값을 바꿔준다..
		System.out.println(point.getX());
		System.out.println(point.getClass()); /// object에 들어가있는 메소드이기 때문에 쓸 수 있다.
		System.out.println(point.getClass().getName()); //
		System.out.println(point.hashCode());
		System.out.println(point02.hashCode());
		System.out.println(point.toString());
		System.out.println(point); // -> toString과 결과가 같다.

		// 위의 결과
//		class day08.Point
//		day08.Point
//		1651191114
//		1586600255
//		day08.Point@626b2d4a
	}
}
