package day08;
//Rect라는 class를 만든다. width, height equals의 조건을 면적이 같으면 같은 Rect로 인정한다.
//Rect rect 01= new Rect(10,10);
//Rect rect 02= new Rect(50,2);
//System.out.println(rect01.equals(rect02));

class Rect{	// 내가 써봄
	private int width, height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;

	}
	public boolean equals(Object obj) {
		Rect rect=(Rect)obj;
		if(rect.width*rect.height==width*height) {
			
		}
		return false;
	}
	
}

public class RectTest {
	public static void main(String[] args) {
		Rect rect01= new Rect(10, 10);
		Rect rect02= new Rect(50, 1);
		System.out.println();
		System.out.println(rect01.equals(rect02));
	}

}
